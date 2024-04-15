/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package IT_Admin;

import javafx.beans.property.SimpleStringProperty;

/**
 *
 * @author DELL
 */
public class UserAccount {
    
    public String id;
    public String name;
    public SimpleStringProperty role;
    public String dept;
    public String number;
    
     public UserAccount (){
        role = new SimpleStringProperty("TBA");
    }

    public UserAccount(String id, String name, String role, String dept, String number) {
        this.id = id;
        this.name = name;
        this.role = new SimpleStringProperty(role);
        this.dept = dept;
        this.number = number;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public void setRole(String role) {
        this.role = new SimpleStringProperty(role);
    }
    
    public String getRole(){
        return role.get();
    }


    
    
    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "UserAccount{" + "id=" + id + ", name=" + name + ", role=" + role + ", dept=" + dept + ", number=" + number + '}';
    }
     
     
    
}
