package datamodel;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class TransactionLedger {

    private ObservableList<Transaction> transactions;

    public TransactionLedger() {
        transactions = FXCollections.observableArrayList();
    }

    public ObservableList<Transaction> getTransactions() {
        return transactions;
    }


    public void addTransaction(Transaction transaction) {
        transactions.add(transaction);
    }

    public void deleteTransaction(Transaction transaction) {
        transactions.remove(transaction);
    }

    public double totalExpenses(){
        double totalExpenses = 0;

        for (Transaction t : transactions){
            if (t.getTransactionType().equals("Expense")){
                totalExpenses += t.getTransactionAmount();
            }
        }
        return totalExpenses;
    }

    public double totalIncome(){
        double totalIncome = 0;

        for (Transaction t : transactions){
            if (t.getTransactionType().equals("Income")){
                totalIncome += t.getTransactionAmount();
            }
        }
        return totalIncome;
    }

    @Override
    public String toString() {
        for (Transaction t : transactions) {
            System.out.println(t);
        }
        return "TransactionLedger{" +
                "transactions=" + transactions +
                '}';
    }
}
