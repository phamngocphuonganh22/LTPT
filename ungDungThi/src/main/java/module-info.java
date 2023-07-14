module com.example.ungdungthi {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.ungdungthi to javafx.fxml;
    exports com.example.ungdungthi;
}