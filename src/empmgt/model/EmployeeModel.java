
package empmgt.model;


public class EmployeeModel {
    private int id;
    private String fName;
    private String lName;
    private String dsign;
    private String dept;
    private double salary;
    private int age;
    private String address;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String getDsign() {
        return dsign;
    }

    public void setDsign(String dsign) {
        this.dsign = dsign;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public EmployeeModel(int id, String fName, String lName, String dsign, String dept, double salary, int age, String address) {
        this.id = id;
        this.fName = fName;
        this.lName = lName;
        this.dsign = dsign;
        this.dept = dept;
        this.salary = salary;
        this.age = age;
        this.address = address;
    }
    
    
}
