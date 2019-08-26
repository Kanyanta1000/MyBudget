package com.kanyantamubanga.mybudget;

import datamodel.Transaction;
import datamodel.TransactionLedger;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableView;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.time.LocalDate;

public class Controller {

    private TransactionLedger myLedger;

    @FXML
    private BorderPane mainPanel;
    @FXML
    private BorderPane updatePanel;
    @FXML
    private Label contentTitle;
    @FXML
    private Button updateBudgetButton;
    @FXML
    private Button addBudgetItemButton;
    @FXML
    private TableView<Transaction> updateBudgetTableView;

    public void initialize() {
        myLedger= new TransactionLedger();
        String todaysDate = LocalDate.now().toString();
        Transaction transaction1 = new Transaction("Water Bill", "Bills", 500,
                "Rubles", todaysDate, "Expense", "true");
        myLedger.addTransaction(transaction1);

        Transaction transaction2 = new Transaction("Gas Bill", "Bills", 500,
                "Rubles", todaysDate, "Expense", "false");
        myLedger.addTransaction(transaction2);

        Transaction transaction3 = new Transaction("Random birthday present", "Bills",
                500, "Rubles", todaysDate, "Expense", "false");
        myLedger.addTransaction(transaction3);

        Transaction transaction4 = new Transaction("Petrol", "Bills", 500,
                "Rubles", todaysDate, "Expense", "false");
        myLedger.addTransaction(transaction4);

        Transaction transaction5 = new Transaction("Water Bill", "Bills", 500,
                "Rubles", todaysDate, "Expense", "false");
        myLedger.addTransaction(transaction5);

        Transaction transaction6 = new Transaction("First Salary Payment", "Bills",
                500, "Rubles", todaysDate, "Income", "false");
        myLedger.addTransaction(transaction6);


        updateBudgetTableView.setItems(myLedger.getTransactions());

//        System.out.println(myLedger);

//        System.out.println("Expenses: " + myLedger.totalExpenses());
//        System.out.println("Income: " + myLedger.totalIncome());
    }

    @FXML
    public void handleOverviewButtonAction() {
        contentTitle.setText("OVERVIEW");
    }

    @FXML
    public void handleUpdateBudgetClicked(ActionEvent event) throws IOException {
        new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                updateBudgetButton.setText("Accepted");
            }
        };

        Parent updateBudgetParent = FXMLLoader.load(getClass().getResource("updatebudget.fxml"));
        Scene updateBudgetScene = new Scene(updateBudgetParent, 1080, 720);

        Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();

        window.setTitle("Update Budget");
        window.setScene(updateBudgetScene);
        window.show();
    }

    public void handleAddBudgetItemButtonAction(){
        UpdateBudgetController updateBudgetController = new UpdateBudgetController();
//        myLedger.addTransaction(updateBudgetController.getNewTransaction());
//        System.out.println(updateBudgetController.getNewTransaction());
        updateBudgetController.getNewTransaction();
    }
}