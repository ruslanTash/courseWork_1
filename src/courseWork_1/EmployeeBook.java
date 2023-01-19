package courseWork_1;
import courseWork_1.Employee;

public class EmployeeBook {
    private Employee[] list;
    private int size;
    public EmployeeBook(){
        this.list = new Employee[10];
    }

//    Все статические методы по работе с массивом перенести в этот класс и сделать нестатическими.
   @Override
    public String toString() {
        String listToString = "";
        for (int i = 0; i < list.length; i++) {
            listToString = listToString + list[i];
        }
        return listToString;
    }

    public double totalSalary() {
        double totalSalary = 0.0;
        for (int i = 0; i < list.length; i++) {
            if (list[i] != null) {
                totalSalary = totalSalary + list[i].getSalary();
            }
        }
        return totalSalary;
    }

    public double findMinSalary() {
        double minSalary = findMaxSalary();
        for (int i = 0; i < list.length; i++) {
            if (list[i] != null && list[i].getSalary() < minSalary) {
                minSalary = list[i].getSalary();
            }
        }
        return minSalary;
    }

    public String findMinSalaryEmployee() {
        double minSalary = findMaxSalary();
        int min = 0;
        for (int i = 0; i < list.length; i++) {
            if (list[i] != null && list[i].getSalary() < minSalary) {
                minSalary = list[i].getSalary();
                min = i;
            }
        }
        return "Сотрудник с наименьшей зарплатой: " + list[min].getName() + " Зарплата: " + minSalary + " RUB.";
    }

    public String findMaxSalaryEmployee() {
        double maxSalary = 0;
        int max = 0;
        for (int i = 1; i < list.length; i++) {
            if (list[i] != null && list[i].getSalary() > maxSalary) {
                maxSalary = list[i].getSalary();
                max = i;
            }
        }
        return "Сотрудник с наибольшей зарплатой: " + list[max].getName() + " Зарплата: " + maxSalary + " RUB.";
    }

    public double findMaxSalary() {
        double maxSalary = 0;
        for (int i = 0; i < list.length; i++) {
            if (list[i] != null && list[i].getSalary() > maxSalary) {
                maxSalary = list[i].getSalary();
            }
        }
        return maxSalary;
    }

    public double averageSalary() {
        int count = 0;
        for (int i = 0; i < list.length; i++) {
            if (list[i] != null) {
                count++;
            }
        }
        return totalSalary() / count;
    }

    public String nameToString() {
        String nameToString = "";
        for (int i = 0; i < list.length - 1; i++) {
            if (list[i] != null) {
                nameToString = nameToString + list[i].getName() + "\n";
            }
        }
        return nameToString;
    }

    public void indexSalary(int procent) {
        for (int i = 0; i < list.length; i++) {
            if (list[i] != null) {
                list[i].indexSalary(procent);
            }
        }
    }


    public String findMinSalaryEmployeeDept(int dept) {
        double minSalary = findMaxSalary();
        int min = 0;
        for (int i = 0; i < list.length; i++) {
            if (list[i] != null && list[i].getDepartment() == dept && list[i].getSalary() < minSalary) {
                minSalary = list[i].getSalary();
                min = i;
            }
        }
        return "Сотрудник с наименьшей зарплатой в отделе " + dept + " :" + list[min].getName() + " Зарплата: " + minSalary + " RUB.";
    }

    public String findMaxSalaryEmployeeDept(int dept) {
        double maxSalary = 0;
        int max = 0;
        for (int i = 0; i < list.length; i++) {
            if (list[i] != null && list[i].getDepartment() == dept && list[i].getSalary() > maxSalary) {
                maxSalary = list[i].getSalary();
                max = i;
            }
        }
        return "Сотрудник с наибольшей зарплатой в отделе " + dept + " :" + list[max].getName() + " Зарплата: " + maxSalary + " RUB.";
    }

    public double totalSalaryDept(int dept) {
        double totalSalary = 0.0;
        for (int i = 0; i < list.length; i++) {
            if (list[i] != null && list[i].getDepartment() == dept) {
                totalSalary = totalSalary + list[i].getSalary();
            }
        }
        return totalSalary;
    }

    public double averageSalaryDept(Employee[] list, int dept) {
        int count = 0;
        for (int i = 0; i < list.length; i++) {
            if (list[i] != null && list[i].getDepartment() == dept) {
                count++;
            }
        }
        return totalSalaryDept(dept) / count;
    }

    public void indexSalaryDept(int procent, int dept) {
        for (int i = 0; i < list.length; i++) {
            if (list[i] != null && list[i].getDepartment() == dept) {
                list[i].indexSalary(procent);
            }
        }
    }

    public String listToStringDept(int dept) {
        String listToString = "Отдел " + dept + ":\n";
        for (int i = 0; i < list.length - 1; i++) {
            if (list[i] != null && list[i].getDepartment() == dept) {
                listToString = listToString + "ID " + list[i].getId() + ": " + list[i].getName() + " Зарплата - " + list[i].getSalary() + "RUB\n";
            }
        }
        return listToString;
    }

    public String underNumber(int number) {
        String desiredSalary = "Зарплата менее " + number + " RUB:\n";
        for (int i = 0; i < list.length; i++) {
            if (list[i] != null && list[i].getSalary() < number) {
                desiredSalary = desiredSalary + list[i].toString();
            }
        }
        return desiredSalary;
    }

    public String overNumber(int number) {
        String desiredSalary = "Зарплата более " + number + " RUB:\n";
        for (int i = 0; i < list.length; i++) {
            if (list[i] != null && list[i].getSalary() > number) {
                desiredSalary = desiredSalary + list[i].toString();
            }
        }
        return desiredSalary;
    }

// Реализация методов по добавлению и удалению сотрудников:
    public void addEmployee(String name, int department, double salary) {
        if (size >= list.length) {
            System.out.println("Нельзя добавить - нет вакансий");
        }
        Employee newEmployee = new Employee(name, department, salary);
        list[size++] = newEmployee;
    }

    public void removeEmployee(String name) {
        for (int i = 0; i < list.length; i++) {
            if (list[i].getName().equals(name)) {
                System.out.println(list[i].getName() + " удален");
                System.arraycopy(list, i + 1, list, i, size - i - 1);
                list[size - 1] = null;
                size--;
                return;
            }
        }
    }

// Метод изменения сотрудника (получить сотрудника по Ф. И. О., модернизировать его запись):
    public void changeSalary(String name, double newSalary){
        for (int i = 0; i < list.length; i++) {
            if (list[i].getName().equals(name)) {
                list[i].setSalary(newSalary);
            }
        }
    }

//  Метод получить Ф.И.О. всех сотрудников по отделам (напечатать список отделов и их сотрудников).
    public String getAllDepts(){
        String allDepts = "";
        for (int i = 1; i <=5; i++){
            allDepts = allDepts + listToStringDept(i);
        }
        return  allDepts;
    }
}
