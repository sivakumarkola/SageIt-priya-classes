package testsageit;
public class Engineer extends Employee {
    private int salary;
    private String grade;
    public void setSalary(int salary) {
        salary = this.salary;
    }

    public int  getSalary() {
        return  salary;
    }

    public void setGrade(String grade) {
    grade = this.grade;
    }

    public String getGrade() {
    return grade;
    }

    public static void main(String args[])
    {
        Engineer e1 = new Engineer();
        e1.label(70000,"Grade-A");
        e1.label(90000,"Grade-A");


    }
}