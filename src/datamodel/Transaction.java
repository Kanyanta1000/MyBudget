package datamodel;

import javafx.beans.property.SimpleStringProperty;

import java.time.LocalDate;

public class Transaction {
    private SimpleStringProperty description = new SimpleStringProperty("");
    private SimpleStringProperty category = new SimpleStringProperty("");
    private double transactionAmount;
    private SimpleStringProperty currency = new SimpleStringProperty("");
    private SimpleStringProperty transactionDate = new SimpleStringProperty("");
    private SimpleStringProperty transactionType = new SimpleStringProperty("");
    private SimpleStringProperty isRecurrent = new SimpleStringProperty("");

    public Transaction(String description, String category, double transactionAmount, String currency,
                                String transactionDate, String transactionType, String isRecurrent) {
        this.description.set(description);
        this.category.set(category);
        this.transactionAmount = transactionAmount;
        this.currency.set(currency);
        this.transactionDate.set(transactionDate);
        this.transactionType.set(transactionType);
        this.isRecurrent.set(isRecurrent);
    }

    public String getDescription() {
        return description.get();
    }

    public SimpleStringProperty descriptionProperty() {
        return description;
    }

    public void setDescription(String description) {
        this.description.set(description);
    }

    public String getCategory() {
        return category.get();
    }

    public SimpleStringProperty categoryProperty() {
        return category;
    }

    public void setCategory(String category) {
        this.category.set(category);
    }

    public double getTransactionAmount() {
        return transactionAmount;
    }

    public void setTransactionAmount(double transactionAmount) {
        this.transactionAmount = transactionAmount;
    }

    public String getCurrency() {
        return currency.get();
    }

    public SimpleStringProperty currencyProperty() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency.set(currency);
    }

    public String getTransactionDate() {
        return transactionDate.get();
    }

    public SimpleStringProperty transactionDateProperty() {
        return transactionDate;
    }

    public void setTransactionDate(String transactionDate) {
        this.transactionDate.set(transactionDate);
    }

    public String getTransactionType() {
        return transactionType.get();
    }

    public SimpleStringProperty transactionTypeProperty() {
        return transactionType;
    }

    public void setTransactionType(String transactionType) {
        this.transactionType.set(transactionType);
    }

    public String getIsRecurrent() {
        return isRecurrent.get();
    }

    public SimpleStringProperty isRecurrentProperty() {
        return isRecurrent;
    }

    public void setIsRecurrent(String isRecurrent) {
        this.isRecurrent.set(isRecurrent);
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "description=" + description +
                ", category=" + category +
                ", transactionAmount=" + transactionAmount +
                ", currency=" + currency +
                ", transactionDate=" + transactionDate +
                ", transactionType=" + transactionType +
                ", isRecurrent=" + isRecurrent +
                '}';
    }
}