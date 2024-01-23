
package classes;

public class Employee {
    String name;
    String designation;
    String department;
    int id;
    
    public Employee(String name, String designation, String department, int id) {
        this.name = name;
        this.designation = designation;
        this.department = department;
        this.id = id;
    }
    
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getDesignation() {
        return this.designation;
    }
    
    public void setDesignation(String designation) {
        this.designation = designation;
    }
    
    public String getDepartment() {
        return this.department;
    }
    
    public void setDepartment(String department) {
        this.department = department;
    }
    
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    
    
}
