package com.company.entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Contract{
    private Integer number;
    private Date date;
    private Double totalValue;
    private final List<Installment> intallmentList = new ArrayList<>();

    public Contract() {
    }

    public List<Installment> getIntallmentList() {
        return intallmentList;
    }


    public Contract(Integer number, Date date, Double totalValue) {
        this.number = number;
        this.date = date;
        this.totalValue = totalValue;
    }

    @Override
    public String toString() {
        return "Contract{" +
                "number=" + number +
                ", date=" + date +
                ", totalValue=" + totalValue +
                '}';
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Double getTotalValue() {
        return totalValue;
    }

    public void setTotalValue(Double totalValue) {
        this.totalValue = totalValue;
    }
}
