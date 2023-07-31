module com.example.pertemuan3 {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.example.pertemuan3 to javafx.fxml;
    exports com.example.pertemuan3;
}
