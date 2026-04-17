module com.example.geradorpdf {
    requires javafx.controls;
    requires javafx.fxml;
    requires itextpdf;


    opens com.example.geradorpdf to javafx.fxml;
    exports com.example.geradorpdf;
}