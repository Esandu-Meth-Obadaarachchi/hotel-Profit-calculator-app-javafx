package com.example.hotelprofitcalculator;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.shape.Ellipse;
import javafx.stage.Stage;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.EventObject;

public class HelloController {
    // JDBC URL, username, and password of MySQL server
    private static final String URL = "jdbc:mysql://localhost:3306/hotel_the_odon_finances";
    private static final String USER = "root";
    private static final String PASSWORD = "esandu12345";

    // Method to establish a connection to the database
    public static Connection getConnection() throws SQLException {
        try {
            // Registering the MySQL JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            // Creating and returning a connection to the database
            return DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (ClassNotFoundException e) {
            // Log or handle the ClassNotFoundException appropriately
            throw new SQLException("MySQL JDBC driver not found", e);
        }
    }
    @FXML
    private Button DailyExpensesButt;

    @FXML
    private Button MonthlyExpensesButt;

    @FXML
    private Button backButtonCDD;

    @FXML
    private Button checkButton;

    @FXML
    private AnchorPane content;

    @FXML
    private Ellipse ellipseOne;

    @FXML
    private Ellipse ellipseTwo;

    @FXML
    private Button incomeButt;

    @FXML
    private Button profitButt;

    @FXML
    private Label welcome;

    Stage stage;
    //========================================
    public void stageLoader(ActionEvent event, String fileName) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource(fileName));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    @FXML
    void backButtonCDD(ActionEvent event) {

    }
    //===========================================
    @FXML
    public void onDailyExpensesButtonClick(ActionEvent event) throws IOException {
        String fileName= "dailyExpense.fxml";
        stageLoader(event,fileName);
    }

    @FXML
    void onCheckButtonClick(ActionEvent event) {

    }



    @FXML
    void onIncomeButtonClick(ActionEvent event) {

    }

    @FXML
    void onMonthlyExpensesButtonClick(ActionEvent event) {

    }

    @FXML
    void onProfitButtonClick(ActionEvent event) {

    }


}