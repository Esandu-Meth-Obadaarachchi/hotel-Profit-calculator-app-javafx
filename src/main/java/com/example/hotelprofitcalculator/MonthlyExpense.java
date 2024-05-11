package com.example.hotelprofitcalculator;

import java.math.BigDecimal;

// Class for MonthlyExpenses
public class MonthlyExpense {
    private int expenseId;
    private String date;
    private String reason;
    private BigDecimal amount;

    // Constructor
    public MonthlyExpense(int expenseId, String date, String reason, BigDecimal amount) {
        this.expenseId = expenseId;
        this.date = date;
        this.reason = reason;
        this.amount = amount;
    }

    // Getters and setters
    public int getExpenseId() {
        return expenseId;
    }

    public void setExpenseId(int expenseId) {
        this.expenseId = expenseId;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }
}
