module ni.uam.edu.calculadorabasica {
    requires javafx.controls;
    requires javafx.fxml;


    opens ni.uam.edu.calculadorabasica to javafx.fxml;
    exports ni.uam.edu.calculadorabasica;
}