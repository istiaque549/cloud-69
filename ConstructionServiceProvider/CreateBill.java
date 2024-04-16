/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ConstructionServiceProvider;

import java.time.LocalDate;

/**
 *
 * @author DELL
 */
public class CreateBill {
    
    public String name;
    public String location;
    public LocalDate billDate;
    public String status;

    public CreateBill(String name, String location, LocalDate billDate, String status) {
        this.name = name;
        this.location = location;
        this.billDate = billDate;
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public LocalDate getBillDate() {
        return billDate;
    }

    public void setBillDate(LocalDate billDate) {
        this.billDate = billDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "CreateBill{" + "name=" + name + ", location=" + location + ", billDate=" + billDate + ", status=" + status + '}';
    }
    
    
    
}
