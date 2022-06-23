module com.example.expensetracker {
    requires javafx.controls;
    requires javafx.fxml;


    opens main.expensetracker to javafx.fxml;
    exports main.expensetracker;
}