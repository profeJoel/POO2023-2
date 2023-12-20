module com.anime {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.anime to javafx.fxml;
    exports com.anime;
}
