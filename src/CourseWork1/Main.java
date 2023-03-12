package CourseWork1;

public class Main {
    static Employee[] employees = new Employee[10];

    public static void main(String[] args) {
        employees[0] = new Employee("Иван", "Иванович", "Иванов", 1, 50000);
        employees[1] = new Employee("Иван", "Петрович", "Иванов", 2, 60000);
        employees[2] = new Employee("Пётр", "Иванович", "Петров", 3, 70000);
        employees[3] = new Employee("Василий", "Иванович", "Петров", 4, 80000);
        employees[4] = new Employee("Виктор", "Иванович", "Сидоров", 5, 90000);
        employees[5] = new Employee("Иван", "Арсентьевич", "Иванов", 1, 50000);
        employees[6] = new Employee("Василий", "Иванович", "Иванов", 2, 110000);
        employees[7] = new Employee("Иван", "Олегоич", "Иванов", 3, 120000);
        //employees[8] = new Employee("Роман", "Васильевич", "Иванов", 4, 130000);
        employees[9] = new Employee("Артак", "Иванович", "Кукушкин", 5, 140000);
        //Базовый уровень
        printEmployees();
        System.out.println("Сумма заработной платы в месяц =" + sumEmpSal());
        findMinSalary();
        findMaxSalary();
        averageEmpSal();
        printEmpFio();
        //Повышенная сложность
        sumDepSal(5);
        averageDepSal(2);
        printDepEmp(1);
        findLessSalary(70000);
        findMoreSalary(100000);
        increaseSal(15);

    }

    static void printEmployees() {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    static double sumEmpSal() {
        double sum = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                sum = sum + employee.getSalary();
            }
        }
        return sum;
    }

    static void averageEmpSal() {
        System.out.println("Средняя ЗП =" + sumEmpSal() / employees.length);
    }

    static void findMinSalary() {
        Employee min = null;
        for (Employee employee : employees) {
            if (employee != null && (min == null || employee.getSalary() < min.getSalary())) {
                min = employee;
            }
        }
        System.out.println("Сотрудник с минимальной ЗП = " + min);
    }

    static void findMaxSalary() {
        Employee max = null;
        for (Employee employee : employees) {
            if (employee != null && (max == null || employee.getSalary() > max.getSalary())) {
                max = employee;
            }
        }
        System.out.println("Сотрудник с максимальной ЗП = " + max);
    }

    static void sumDepSal(int department) {
        double sum = 0;
        for (Employee employee : employees) {
            if (employee != null && department == employee.getDepartment()) {
                sum = sum + employee.getSalary();
            }
        }
        System.out.println("Cумма ЗП по отделу " + department + "=" + sum);
    }

    static void averageDepSal(int department) {
        double sum = 0;
        double i = 0;
        for (Employee employee : employees) {
            if (employee != null && department == employee.getDepartment()) {
                i++;
                sum = sum + employee.getSalary();
            }
        }
        System.out.println("Средняя ЗП по отделу " + department + "=" + sum / i);
    }

    static void printEmpFio() {
        for (Employee employee : employees) {
            if (employee != null) {

                System.out.println("Фио = " + employee.getFirstName() + " " + employee.getMiddleName()
                        + " " + employee.getLastName() + ".");
            }
        }
    }

    static void increaseSal(double percent) {
        for (Employee employee : employees) {
            if (employee != null) {
                employee.setSalary(employee.getSalary() * (1 + percent / 100));
                System.out.println("Индексированная ЗП сотрудника " + employee.getFirstName() + " " +
                        employee.getLastName() + " = " + employee.getSalary());
            }

        }
    }

    static void printDepEmp(int department) {
        System.out.println("Все сотрудники отдела " + department + ":");
        for (Employee employee : employees) {
            if (employee != null && department == employee.getDepartment()) {
                System.out.println("Фио = " + employee.getFirstName() + " " + employee.getMiddleName()
                        + " " + employee.getLastName() + ". ЗП= " + employee.getSalary() + ", id = " + employee.getId());
            }
        }
    }

    static void findLessSalary(double salary) {
        System.out.println("Cотрудники отдела c ЗП меньше " + salary + ":");
        for (Employee employee : employees) {
            if (employee != null && employee.getSalary() < salary) {
                System.out.println("Фио = " + employee.getFirstName() + " " +
                        employee.getMiddleName() + " " + employee.getLastName() + ". ЗП= " +
                        employee.getSalary() + ", id = " + employee.getId());
            }

        }
    }

    static void findMoreSalary(double salary) {
        System.out.println("Cотрудники отдела c ЗП больше " + salary + ":");
        for (Employee employee : employees) {
            if (employee != null && employee.getSalary() > salary) {
                System.out.println("Фио = " + employee.getFirstName() + " " +
                        employee.getMiddleName() + " " + employee.getLastName() + ". ЗП= " +
                        employee.getSalary() + ", id = " + employee.getId());
            }
        }
    }

}