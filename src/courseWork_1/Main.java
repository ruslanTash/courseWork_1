package courseWork_1;

import courseWork_1.Employee;

public class Main {

    public static String listToString(Employee[] list) {
        String listToString = "";
        for (int i = 0; i < list.length - 1; i++) {
            listToString = listToString + list[i] + "\n";
        }
        return listToString;
    }

    public static double totalSalary(Employee[] list) {
        double totalSalary = 0.0;
        for (int i = 0; i < list.length; i++) {
            totalSalary = totalSalary + list[i].getSalary();
        }
        return totalSalary;
    }

    public static double findMinSalary(Employee[] list) {
        double minSalary = list[0].getSalary();
        for (int i = 1; i < list.length; i++) {
            if (list[i].getSalary() < minSalary) minSalary = list[i].getSalary();
        }
        return minSalary;
    }

    public static String findMinSalaryEmployee(Employee[] list) {
        double minSalary = list[0].getSalary();
        int min = 0;
        for (int i = 1; i < list.length; i++) {
            if (list[i].getSalary() < minSalary) {
                minSalary = list[i].getSalary();
                min = i;
            }
        }
        return "Сотрудник с наименьшей зарплатой: " + list[min].getName() + " Зарплата: " + minSalary + " RUB.";
    }

    public static String findMaxSalaryEmployee(Employee[] list) {
        double maxSalary = list[0].getSalary();
        int max = 0;
        for (int i = 1; i < list.length; i++) {
            if (list[i].getSalary() > maxSalary) {
                maxSalary = list[i].getSalary();
                max = i;
            }
        }
        return "Сотрудник с наибольшей зарплатой: " + list[max].getName() + " Зарплата: " + maxSalary + " RUB.";
    }

    public static double findMaxSalary(Employee[] list) {
        double maxSalary = list[0].getSalary();
        for (int i = 1; i < list.length; i++) {
            if (list[i].getSalary() > maxSalary) maxSalary = list[i].getSalary();
        }
        return maxSalary;
    }

    public static double averageSalary(Employee[] list) {
        return totalSalary(list) / list.length;
    }

    public static String nameToString(Employee[] list) {
        String nameToString = "";
        for (int i = 0; i < list.length - 1; i++) {
            nameToString = nameToString + list[i].getName() + "\n";
        }
        return nameToString;
    }

    public static void indexSalary(Employee[] list, int procent) {
        for (int i = 0; i < list.length; i++) {
            list[i].indexSalary(procent);
        }
    }


    public static String findMinSalaryEmployeeDept(Employee[] list, int dept) {
        double minSalary = findMaxSalary(list);
        int min = 0;
        for (int i = 0; i < list.length; i++) {
            if (list[i].getDepartment() == dept && list[i].getSalary() < minSalary) {
                minSalary = list[i].getSalary();
                min = i;
            }
        }
        return "Сотрудник с наименьшей зарплатой в отделе " + dept + " :" + list[min].getName() + " Зарплата: " + minSalary + " RUB.";
    }

    public static String findMaxSalaryEmployeeDept(Employee[] list, int dept) {
        double maxSalary = findMinSalary(list);
        int max = 0;
        for (int i = 0; i < list.length; i++) {
            if (list[i].getDepartment() == dept && list[i].getSalary() > maxSalary) {
                maxSalary = list[i].getSalary();
                max = i;
            }
        }
        return "Сотрудник с наибольшей зарплатой в отделе " + dept + " :" + list[max].getName() + " Зарплата: " + maxSalary + " RUB.";
    }

    public static double totalSalaryDept(Employee[] list, int dept) {
        double totalSalary = 0.0;
        for (int i = 0; i < list.length; i++) {
            if (list[i].getDepartment() == dept) {
                totalSalary = totalSalary + list[i].getSalary();
            }
        }
        return totalSalary;
    }

    public static double averageSalaryDept(Employee[] list, int dept) {
        int count = 0;
        for (int i = 0; i < list.length; i++) {
            if (list[i].getDepartment() == dept) count++;
        }
        return totalSalaryDept(list, dept) / count;
    }

    public static void indexSalaryDept(Employee[] list, int procent, int dept) {
        for (int i = 0; i < list.length; i++) {
            if (list[i].getDepartment() == dept) list[i].indexSalary(procent);
        }
    }

    public static String listToStringDept(Employee[] list, int dept) {
        String listToString = "";
        for (int i = 0; i < list.length - 1; i++) {
            if (list[i].getDepartment() == dept)
                listToString = listToString + "ID " + list[i].getId() + ": " + list[i].getName() + " Зарплата - " + "RUB\n";
        }
        return listToString;
    }

    public static String underNumber(Employee[] list, int number) {
        String desiredSalary = "";
        for (int i = 0; i < list.length; i++) {
            if (list[i].getSalary() < number) desiredSalary = desiredSalary + list[i].toString();
        }
        return desiredSalary;
    }

    public static String overNumber(Employee[] list, int number) {
        String desiredSalary = "";
        for (int i = 0; i < list.length; i++) {
            if (list[i].getSalary() > number) desiredSalary = desiredSalary + list[i].toString();
        }
        return desiredSalary;
    }

    public static void main(String[] args) {
        Employee[] list = new Employee[10];
        list[0] = new Employee("Арбузов А.А.", 1, 60000);
        list[1] = new Employee("Бананов И.П.", 2, 94600);
        list[2] = new Employee("Грушев Г.Г.", 3, 14300);
        list[3] = new Employee("Дынева А.С.", 4, 38900);
        list[4] = new Employee("Абрикосова С.Д.", 5, 98745);
        list[5] = new Employee("Мандарино А.Ч.", 5, 543777);
        list[6] = new Employee("Воронов В.В.", 4, 69841);
        list[7] = new Employee("Занозова В.П.", 3, 47853);
        list[8] = new Employee("Грачёв С.П.", 1, 77777);
        list[9] = new Employee("Журавлёва С.С.", 5, 145965);

        System.out.println(findMinSalaryEmployeeDept(list, 1));
        System.out.println(findMaxSalaryEmployeeDept(list, 1));
        System.out.println(totalSalaryDept(list, 1));
        System.out.println(averageSalaryDept(list, 5));


        System.out.println("list[5].getName() = " + list[5].getName());
        System.out.println("list[5].toString() = " + list[5].toString());
        System.out.println(listToString(list));
        indexSalary(list, 10);
        System.out.println(listToString(list));
        System.out.println("totalSalary(list) = " + totalSalary(list));

        System.out.println("findMaxSalary(list) = " + findMaxSalary(list));
        System.out.println("findMinSalary(list) = " + findMinSalary(list));
        System.out.println(findMinSalaryEmployee(list));
        System.out.println(findMaxSalaryEmployee(list));
        System.out.println(nameToString(list));

        System.out.println("list[0].getSalary() = " + list[0].getSalary());
        list[0].indexSalary(10);
        System.out.println("list[0].getSalary() = " + list[0].getSalary());

        System.out.println(listToString(list));
        indexSalaryDept(list, 100, 1);
        System.out.println(listToString(list));

        System.out.println(listToStringDept(list, 1));
        System.out.println(underNumber(list, 100000));
        System.out.println(overNumber(list, 100000));

    }
}