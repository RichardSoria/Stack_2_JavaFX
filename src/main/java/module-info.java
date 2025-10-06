module com.example.stack_2_javafx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.stack_2_javafx to javafx.fxml;
    exports com.example.stack_2_javafx;
}