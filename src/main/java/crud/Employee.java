package crud;

public class Employee {
    private int empno;
    private String empname;

    public Employee(int empno, String empname) {
        this.empno = empno;
        this.empname = empname;
    }

    public int getempno() {
        return empno;
    }

    public String getempname() {
        return empname;
    }
}