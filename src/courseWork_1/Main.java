package courseWork_1;

import courseWork_1.Employee;
import courseWork_1.EmployeeBook;

public class Main {


    public static void main(String[] args) {
        EmployeeBook list = new EmployeeBook();
        list.addEmployee("Арбузов А.А.", 1, 60000);
        list.addEmployee("Бананов И.П.", 2, 94600);
        list.addEmployee("Грушев Г.Г.", 3, 14300);
        list.addEmployee("Дынева А.С.", 4, 38900);
        list.addEmployee("Абрикосова С.Д.", 5, 98745);
        list.addEmployee("Мандарино А.Ч.", 5, 543777);
        list.addEmployee("Воронов В.В.", 4, 69841);
        list.addEmployee("Занозова В.П.", 3, 47853);
        list.addEmployee("Грачёв С.П.", 1, 77777);
        list.addEmployee("Журавлёва С.С.", 5, 145965);

// Проверка работы методов класса EmployeeBook:
        System.out.println(list.toString());
        System.out.println("list.totalSalary() = " + list.totalSalary());
        System.out.println("list.findMinSalary() = " + list.findMinSalary());
        System.out.println("list.findMinSalaryEmployee() = " + list.findMinSalaryEmployee());
        System.out.println("list.findMaxSalaryEmployee() = " + list.findMaxSalaryEmployee());
        System.out.println("list.findMaxSalary() = " + list.findMaxSalary());
        System.out.println("list.averageSalary() = " + list.averageSalary());
        System.out.println("list.nameToString() = " + list.nameToString());
        list.indexSalary(100);
        System.out.println("list.averageSalary() = " + list.averageSalary());
        System.out.println(list.findMinSalaryEmployeeDept(1));
        System.out.println(list.findMaxSalaryEmployeeDept(1));
        System.out.println("list.totalSalaryDept(1) = " + list.totalSalaryDept(1));
        list.indexSalaryDept(50, 1);
        System.out.println(list.listToStringDept(1));
        System.out.println(list.underNumber(100000));
        System.out.println(list.overNumber(100000));
        System.out.println("list.totalSalaryDept(5) = " + list.totalSalaryDept(5));

// Проверка работы добавленных методов:
        list.removeEmployee("Занозова В.П.");
        list.addEmployee("Занозова В.П.", 3, 47853);
        System.out.println(list.toString());
        System.out.println(list.getAllDepts());
        list.changeSalary("Грачёв С.П.", 100000);
        System.out.println(list.toString());


    }
}