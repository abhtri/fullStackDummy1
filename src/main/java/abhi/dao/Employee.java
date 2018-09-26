package abhi.dao;

import javax.persistence.*;

@Entity(name = "Employee")
public class Employee {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name="WORKER_ID")
    private Integer id;
    @Column(name="FIRST_NAME")
    private String name;
    @Column(name="DEPARTMENT")
    private String department;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
