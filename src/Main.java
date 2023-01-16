public class Main {
    public static void main(String[] args) {

        Employee[] employees = {
                new Employee("Петров С.С.", 2, 18000),
                new Employee("Сергеев Н.Н.", 1, 60000),
                new Employee("Иванов И.А.", 1, 18000),
                new Employee("Сергеева Л.Д.", 3, 30000),
                new Employee("Никоноров А.А.", 5, 19000),
                new Employee("Семенова Л.Л.", 4, 27000),
                new Employee("Никулина О.Д.", 1, 65000),
                new Employee("Кралькова Е.Н.", 5, 34000),
                new Employee("Денисова Е.Э.", 2, 26000),
                new Employee("Сергенко О.К.", 1, 10000),

        };

        for (Employee employee : employees) {
            System.out.println(employee);
        }

        float sum = 0;
        for (Employee employee : employees) {
            sum = sum + employee.getSalary();
        }
        System.out.println("Месячная зарплата всех сотрудников = " + sum);
        System.out.println("Средняя ЗП " + (sum / employees.length));

        for (Employee employee : employees) {
            System.out.printf(" " + employee.getFullName());
        }


        float min = 1000000;
        float max = 0;
        String name = null;
        for (Employee employee : employees) {

            if (employee.getSalary() > max) {
                max = employee.getSalary();
                name = employee.getFullName();
            }

        }
        System.out.println();
        System.out.println("Максимальная зарплата " + max + " " + name);

        for (Employee employee : employees) {
            if (employee.getSalary() < min) {
                min = employee.getSalary();
                name = employee.getFullName();
            }
        }
        System.out.println("Минимальная зарплата " + min + " " + name);


    }
}


