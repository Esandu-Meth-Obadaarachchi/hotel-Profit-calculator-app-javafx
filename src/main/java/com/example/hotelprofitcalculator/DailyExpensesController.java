package com.example.hotelprofitcalculator;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.shape.Ellipse;
import javafx.stage.Stage;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.io.IOException;
import java.util.Date;

public class DailyExpensesController {
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
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        @FXML
        private Button addButt;
        Date date123;
        @FXML
        private Button backButton;

        @FXML
        private AnchorPane content;
        @FXML
        private TextField dateId;
        @FXML
        private TextField itemId;

        @FXML
        private TextField cost;

        @FXML
        private Ellipse ellipseOne;
        @FXML
        private Label errorId;
        @FXML
        private Ellipse ellipseTwo;



        @FXML
        private TextField quantity;

        @FXML
        private Label welcome;

        Stage stage;
        private Connection connections;

        public void stageLoader(ActionEvent event, String fileName) throws IOException {
                Parent root = FXMLLoader.load(getClass().getResource(fileName));
                stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                Scene scene = new Scene(root);
                stage.setScene(scene);
                stage.show();
        }
        @FXML
        public void backButton(ActionEvent event) throws IOException {
                String fileName= "main.fxml";
                stageLoader(event,fileName);
        }
        //================================================================================
        // New method to save a DailyExpense object
        public void savingNewDailyExpense(DailyExpense dailyExpense) throws SQLException {
                String insertExpenseQuery = "INSERT INTO DailyExpenses (date, item, quantity, total_cost) VALUES (?, ?, ?, ?)";

                try (PreparedStatement insertExpenseStatement = this.connections.prepareStatement(insertExpenseQuery)) {
                        // Format date to SQL date
                        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
                        String formattedDate = dateFormat.format(dailyExpense.getDate());

                        // Insert expense details
                        insertExpenseStatement.setString(1, formattedDate);
                        insertExpenseStatement.setString(2, dailyExpense.getItem());
                        insertExpenseStatement.setInt(3, Integer.parseInt(dailyExpense.getQuantity())); // Assuming getQuantity returns String
                        insertExpenseStatement.setBigDecimal(4, BigDecimal.valueOf(dailyExpense.getTotalCost())); // Assuming getTotalCost returns float

                        insertExpenseStatement.executeUpdate();

                        System.out.println("Daily expense saved successfully.");
                }
        }
        //-----------------------------------------------------------------
        @FXML
        public void onAddButtonClick(ActionEvent event) throws SQLException {
                connections = getConnection();
                String date = dateId.getText();
                String item = itemId.getText();
                String quantity123 = quantity.getText();
                String totalCost = cost.getText();

                // Validate input
                if (date.isEmpty() || item.isEmpty() || quantity123.isEmpty() || totalCost.isEmpty()) {
                        errorId.setText("Please fill all fields");
                        return;
                }

                try {
                        // Parse input values
                        try {
                                date123 = dateFormat.parse(date);
                                System.out.println("Date: " + date);
                        } catch (ParseException e) {
                                System.out.println("Error parsing date: " + e.getMessage());
                        }
                        float totalCost123 = Float.parseFloat(totalCost);

                        // Create DailyExpense object
                        DailyExpense dailyExpense = new DailyExpense(0, date123, item, quantity123, totalCost123);
                        savingNewDailyExpense(dailyExpense);
                        itemId.clear();
                        quantity.clear();
                        cost.clear();

                } catch (NumberFormatException e) {
                        errorId.setText("FORMAT ERROR");

                } catch (SQLException e) {
                        throw new RuntimeException(e);
                }
        }

}

