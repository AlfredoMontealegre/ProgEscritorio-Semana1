module ni.uam.edu.ejercicio1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ni.uam.edu.ejercicio1 to javafx.fxml;
    exports ni.uam.edu.ejercicio1;
}