module com.example.examinationplatform {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.examinationplatform to javafx.fxml;
    exports com.example.examinationplatform;
}