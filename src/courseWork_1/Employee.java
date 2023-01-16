package courseWork_1;

public class Employee {
    //    Создать класс Employee, который содержит информацию о Ф.И.О., отделе и зарплате сотрудника.
//    Отделы для простоты должны быть названы от 1 до 5.
    private final String name;
    private int department;
    private double salary;
    private int id;
    //    Добавить статическую переменную-счетчик, которая будет отвечать за id.
    public static int count = 0;

    public Employee(String name, int department, double salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
        count++;
        this.id = count;
    }

    public String getName() {
        return this.name;
    }

    public int getDepartment() {
        return this.department;
    }

    public double getSalary() {
        return this.salary;
    }

    public int getId() {
        return this.id;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "ID_" + id + ": " + name + " - отдел " + department + ". Зарплата - " + salary + " RUB\n";
    }

    public double indexSalary(int procent) {
        return this.salary = this.salary + (this.salary * procent / 100);
    }

}
