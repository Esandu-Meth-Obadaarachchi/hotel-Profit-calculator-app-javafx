package com.example.hotelprofitcalculator;

import java.util.Date;
import java.math.BigDecimal;
public class DailyExpense {

    private int expenseId;
    private Date date;
    private String item;
    private String quantity;
    private float totalCost;

    public DailyExpense(int expenseId,Date date,String item,String quantity,float totalCost){
        this.expenseId=expenseId;
        this.date=date;
        this.item=item;
        this.quantity=quantity;
        this.totalCost=totalCost;
    }
    public int getExpenseId(){
        return this.expenseId;
    }
    public void setExpenseId(int newId){
        this.expenseId=newId;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public float getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(float totalCost) {
        this.totalCost = totalCost;
    }
}

