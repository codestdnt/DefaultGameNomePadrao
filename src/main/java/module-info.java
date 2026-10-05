module com.mycompany.aula0510 {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.aula0510 to javafx.fxml;
    exports com.mycompany.aula0510;
}
