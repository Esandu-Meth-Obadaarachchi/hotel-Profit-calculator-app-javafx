module com.example.hotelprofitcalculator {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.example.hotelprofitcalculator to javafx.fxml;
    exports com.example.hotelprofitcalculator;
}