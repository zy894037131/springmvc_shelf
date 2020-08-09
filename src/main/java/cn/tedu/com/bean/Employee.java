package cn.tedu.com.bean;

import org.apache.ibatis.type.Alias;

import java.io.Serializable;

public class Employee implements Serializable {
    private Integer id;
    private String lastName;
    private String gender;
    private String email;
    private Department department;

    public Employee() {
        super();
    }

    public Employee(Integer id, String lastName, String gender, String email) {
        this.id = id;
        this.lastName = lastName;
        this.gender = gender;
        this.email = email;
    }

    public Employee(Integer id, String lastName, String gender, String email, Department department) {
        this.id = id;
        this.lastName = lastName;
        this.gender = gender;
        this.email = email;
        this.department = department;
    }


}
