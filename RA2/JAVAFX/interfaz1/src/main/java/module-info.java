module com.ejemplo1 {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.ejemplo1 to javafx.fxml;
    exports com.ejemplo1;
}
