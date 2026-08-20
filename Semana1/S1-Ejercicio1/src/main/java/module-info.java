module ni.uam.edu.ejercicio2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ni.uam.edu.ejercicio2 to javafx.fxml;
    exports ni.uam.edu.ejercicio2;
}