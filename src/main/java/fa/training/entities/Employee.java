package fa.training.entities;

public class Employee {
    private int employee_id;
    private String employee_name;
    private double salary;
    private int spvrld;
    public Employee(){

    }

    public Employee(int employee_id, String employee_name, double salary, int spvrld) {
        this.employee_id = employee_id;
        this.employee_name = employee_name;
        this.salary = salary;
        this.spvrld = spvrld;
    }

    public int getEmployee_id() {
        return employee_id;
    }

    public void setEmployee_id(int employee_id) {
        this.employee_id = employee_id;
    }

    public String getEmployee_name() {
        return employee_name;
    }

    public void setEmployee_name(String employee_name) {
        this.employee_name = employee_name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getSpvrld() {
        return spvrld;
    }

    public void setSpvrld(int spvrld) {
        this.spvrld = spvrld;
    }
}
