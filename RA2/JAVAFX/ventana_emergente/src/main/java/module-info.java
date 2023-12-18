module com.emergente {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.emergente to javafx.fxml;
    exports com.emergente;
}
