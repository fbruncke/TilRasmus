module com.example.tilrasmus {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.tilrasmus to javafx.fxml;
    exports com.example.tilrasmus;
}