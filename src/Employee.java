public class Employee {
//    Создать класс Employee, который содержит информацию о Ф.И.О., отделе и зарплате сотрудника.
//    Отделы для простоты должны быть названы от 1 до 5.
    private final String name;
    private int department;
    private double salary;
    private int id;
//    Добавить статическую переменную-счетчик, которая будет отвечать за id.
    public static int coint = 0;

    public Employee (String name, int department, double salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
        coint++;
        this.id = coint;
    }


    public String getName(){
        return this.name;
    }
    public int getDepartment(){
        return this.department;
    }
    public double getSalary(){
        return this.salary;
    }
    public int getId(){
        return this.id;
    }

    public void setDepartment(int department){
        this.department = department;
    }
    public void setSalary(int salary){
        this.salary = salary;
    }

    @Override
    public String toString(){
        return "ID_" + id + ": " + name + " - отдел " + department + ". Зарплата - " + salary + " RUB";
    }
}