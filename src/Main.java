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

    public static double getAverageSalary(Employee[] list) {
        return totalSalary(list) / list.length;
    }

    public static String nameToString(Employee[] list){
        String nameToString = "";
        for (int i = 0; i < list.length - 1; i++) {
            nameToString = nameToString + list[i].getName() + "\n";
        }
        return nameToString;
    }

    public static void main(String[] args) {
        Employee arbuzov = new Employee("Арбузов А.А.", 1, 60000);
        Employee bananov = new Employee("Бананов И.П.", 2, 94600);
        Employee grushev = new Employee("Грушев Г.Г.", 3, 14300);
        Employee dyneva = new Employee("Дынева А.С.", 4, 38900);
        Employee abrikosova = new Employee("Абрикосова С.Д.", 5, 98745);

        System.out.println("arbuzov.getId() = " + arbuzov.getId());
        System.out.println("bananov.getId() = " + bananov.getId());

        Employee[] list = new Employee[10];
        list[0] = arbuzov;
        list[1] = bananov;
        list[2] = grushev;
        list[3] = dyneva;
        list[4] = abrikosova;
        list[5] = new Employee("Мандарино А.Ч.", 5, 543777);
        list[6] = new Employee("Воронов В.В.", 4, 69841);
        list[7] = new Employee("Занозова В.П.", 3, 47853);
        list[8] = new Employee("Грачёв С.П.", 1, 77777);
        list[9] = new Employee("Журавлёва С.С.", 5, 145965);

        System.out.println("list[5].getName() = " + list[5].getName());
        System.out.println("list[5].toString() = " + list[5].toString());
        System.out.println("listToString(list) = " + listToString(list));
        System.out.println("totalSalary(list) = " + totalSalary(list));

        System.out.println("findMaxSalary(list) = " + findMaxSalary(list));
        System.out.println("findMinSalary(list) = " + findMinSalary(list));
        System.out.println(findMinSalaryEmployee(list));
        System.out.println(findMaxSalaryEmployee(list));
        System.out.println(getAverageSalary(list));
        int count = list.length;
        System.out.println(count);
        System.out.println(nameToString(list));
    }
}