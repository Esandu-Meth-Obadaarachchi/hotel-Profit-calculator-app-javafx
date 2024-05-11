package com.example.hotelprofitcalculator;

import java.math.BigDecimal;

public class Income {
    // Class for Income
        private String incomeId;
        private String date;
        private int roomNumber;
        private String packageType;
        private String roomType;
        private BigDecimal advanceAmount;
        private BigDecimal balance;
        private BigDecimal total;

        // Constructor
        public Income(String incomeId, String date, int roomNumber, String packageType, String roomType, BigDecimal advanceAmount, BigDecimal balance, BigDecimal total) {
            this.incomeId = incomeId;
            this.date = date;
            this.roomNumber = roomNumber;
            this.packageType = packageType;
            this.roomType = roomType;
            this.advanceAmount = advanceAmount;
            this.balance = balance;
            this.total = total;
        }

        // Getters and setters
        public String getIncomeId() {
            return incomeId;
        }

        public void setIncomeId(String incomeId) {
            this.incomeId = incomeId;
        }

        public String getDate() {
            return date;
        }

        public void setDate(String date) {
            this.date = date;
        }

        public int getRoomNumber() {
            return roomNumber;
        }

        public void setRoomNumber(int roomNumber) {
            this.roomNumber = roomNumber;
        }

        public String getPackageType() {
            return packageType;
        }

        public void setPackageType(String packageType) {
            this.packageType = packageType;
        }

        public String getRoomType() {
            return roomType;
        }

        public void setRoomType(String roomType) {
            this.roomType = roomType;
        }

        public BigDecimal getAdvanceAmount() {
            return advanceAmount;
        }

        public void setAdvanceAmount(BigDecimal advanceAmount) {
            this.advanceAmount = advanceAmount;
        }

        public BigDecimal getBalance() {
            return balance;
        }

        public void setBalance(BigDecimal balance) {
            this.balance = balance;
        }

        public BigDecimal getTotal() {
            return total;
        }

        public void setTotal(BigDecimal total) {
            this.total = total;
        }
}

