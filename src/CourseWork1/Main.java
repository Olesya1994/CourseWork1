package CourseWork1;
public class Main {
   static Employee[] employees = new Employee[10];
    public static void main(String[] args) {
        employees[0] = new Employee("Иван","Иванович", "Иванов", 1, 50000);
        employees[1] = new Employee("Иван","Петрович", "Иванов", 2, 60000);
        employees[2] = new Employee("Пётр","Иванович", "Петров", 3, 70000);
        employees[3] = new Employee("Василий","Иванович", "Петров", 4, 80000);
        employees[4] = new Employee("Виктор","Иванович", "Сидоров", 5, 90000);
        employees[5] = new Employee("Иван","Иванович", "Иванов", 1, 50000);
        employees[6] = new Employee("Василий","Иванович", "Иванов", 2, 110000);
        employees[7] = new Employee("Иван","Олегоич", "Иванов", 3, 120000);
        employees[8] = new Employee("Роман","Васильевич", "Иванов", 4, 130000);
        employees[9] = new Employee("Иван","Иванович", "Кукушкин", 5, 140000);
        printEmployees();
        sumEmploees();
    }
    static void printEmployees(){
        for (Employee employee:employees){
            System.out.println(employee);
        }
    }
    static void sumEmploees(){
        double sum = 0;
        for (Employee employee:employees){
            sum = sum + employee.getSalary();
        }
        System.out.println("Сумма заработной платы ="+ sum);
    }
    static void findMinSalary(){
        double min = 0;
        for (Employee employee:employees){
            min = min + employee.getSalary();
        }
        System.out.println("Минимальна заработная плата ="+ min);
    }

}