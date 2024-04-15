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
public class OperationHistory {
    
    public String name;
    public LocalDate startDate;
    public LocalDate endDate;
    public String amount;

    public OperationHistory(String name, LocalDate startDate, LocalDate endDate, String amount) {
        this.name = name;
        this.startDate = startDate;
        this.endDate = endDate;
        this.amount = amount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "OperationHistory{" + "name=" + name + ", startDate=" + startDate + ", endDate=" + endDate + ", amount=" + amount + '}';
    }
            
    
}
