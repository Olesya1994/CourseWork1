package CourseWork1;

public class Employee {
    private static int firstId = 1;

    private String firstName;
    private String middleName;
    private String lastName;
    private int department;
    private double salary;
    private int id;

    public Employee(String firstName, String middleName, String lastName, int department, double salary) {
        this.id = firstId++;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.department = department;
        this.salary = salary;
    }


    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }


    public String getLastName() {
        return lastName;
    }


    public int getDepartment() {
        return department;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "ФИО'" + firstName + ' '
                + middleName + ' '
                + lastName + '\'' +
                ", отдел=" + department +
                ", ЗП=" + salary +
                ", id=" + id +
                '}';
    }

}
