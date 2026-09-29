module org.example.csc311_ui_design {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.csc311_ui_design to javafx.fxml;
    exports org.example.csc311_ui_design;
}