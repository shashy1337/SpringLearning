package ru.shashy.paymentsproject.Model;

public class Payments {
    private String id;
    private double amount;

    private String dateCreation;

    public String getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(String dateCreation) {
        this.dateCreation = dateCreation;
    }

    public double getAmount() {
        return amount;
    }

    public String getId() {
        return id;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void setId(String id) {
        this.id = id;
    }
}
