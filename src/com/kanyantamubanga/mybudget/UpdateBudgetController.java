package com.kanyantamubanga.mybudget;

import datamodel.Transaction;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;

import java.time.LocalDate;

public class UpdateBudgetController {
    @FXML
    private TextField transactionTypeTextField;
    @FXML
    private TextField transactionDescriptionTextField;
    @FXML
    private ComboBox transactionCategoryComboBox;
    @FXML
    private ComboBox transactionCurrencyComboBox;
    @FXML
    private TextField transactionAmountTextField;
    @FXML
    private RadioButton isRecurrentRadioButton;
    @FXML
    private DatePicker transactionDate;

    public void getNewTransaction(){
        String type = transactionTypeTextField.getText();
        String description = transactionDescriptionTextField.getText();
        String category = (String) transactionCategoryComboBox.getValue();
        String currency = (String) transactionCurrencyComboBox.getValue();
        double amount = Double.parseDouble(transactionAmountTextField.getText());
        String isRecurrent = "false";
//            if (isRecurrentRadioButton.isArmed()){isRecurrent = true;}
        String date = transactionDate.getValue().toString();


        Transaction newTransaction = new Transaction(description, category, amount, currency, date, type, isRecurrent);

        System.out.println(description);
        System.out.println(category);
        System.out.println(amount);
        System.out.println(currency);
        System.out.println(date);
        System.out.println(type);
        System.out.println(isRecurrent);

//        return newTransaction;
    }

}
