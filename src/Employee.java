public class Employee {
    private String fullName;
    private int otdel;
    private float salary;
    private int id;
    private static int counter = 1;


    public Employee(String fullName, int otdel, float salary) {
        this.fullName = fullName;
        this.otdel = otdel;
        this.salary = salary;
        this.id = counter++;
    }

    public String getFullName() {
        return fullName;
    }


    public int getOtdel() {
        return otdel;
    }

    public void setOtdel(int otdel) {
        this.otdel = otdel;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Сотрудник " + fullName + ",отдел № " + otdel + ", зарплата = " + salary ;
    }
}
