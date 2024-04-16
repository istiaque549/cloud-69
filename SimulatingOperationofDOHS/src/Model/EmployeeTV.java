/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author ASUS
 */
public class EmployeeTV {
    String name;
    String designation;
    String date;

    public EmployeeTV(String name, String designation, String date) {
        this.name = name;
        this.designation = designation;
        this.date = date;
    }

    public String getName() {
        return name;
    }
   

    public String getDesignation() {
        return designation;
    }
 
    public String getDate() {
        return date;
    }
   

    public void setName(String name) {
        this.name = name;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "EmployeeTV{" + "name=" + name + ", designation=" + designation + ", date=" + date + '}';
    }
    
    
}
