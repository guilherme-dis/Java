package com.company.entities;


import java.util.Date;

public class Installment {
    private Date dueDate;
    private Double amount;

    @Override
    public String toString() {
        return "Installment{" +
                "dueDate=" + dueDate +
                ", amount=" + amount +
                '}';
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Installment(Date dueDate, Double amount) {
        this.dueDate = dueDate;
        this.amount = amount;
    }

    public Installment() {
    }
}
