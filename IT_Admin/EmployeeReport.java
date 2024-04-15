/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package IT_Admin;

import java.time.LocalDate;

/**
 *
 * @author DELL
 */
public class EmployeeReport {
    
    public String name;
    public String role;
    public LocalDate joiningDate;

    public EmployeeReport(String name, String role, LocalDate joiningDate) {
        this.name = name;
        this.role = role;
        this.joiningDate = joiningDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public LocalDate getJoiningDate() {
        return joiningDate;
    }

    public void setJoiningDate(LocalDate joiningDate) {
        this.joiningDate = joiningDate;
    }

    @Override
    public String toString() {
        return "EmployeeReport{" + "name=" + name + ", role=" + role + ", joiningDate=" + joiningDate + '}';
    }
    
    
    
}
