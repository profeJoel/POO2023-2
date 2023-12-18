module com.boton {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.boton to javafx.fxml;
    exports com.boton;
}
