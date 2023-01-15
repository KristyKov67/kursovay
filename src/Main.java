public class Main {
    public static void main(String[] args) {


    private static final Employee[] employees = {
            new Employee("Петров", 2, 18000),
            new Employee("Сергеев", 1, 10000)
    };


    private static void printSotrudnik() {
        for (Employee employee : employees) {
            System.out.println(employee);
        }

        }

    }
}

