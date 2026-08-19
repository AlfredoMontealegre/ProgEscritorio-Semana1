module ni.uam.edu.primerproyectojavafx {
    requires javafx.controls;
    requires javafx.fxml;


    opens ni.uam.edu.primerproyectojavafx to javafx.fxml;
    exports ni.uam.edu.primerproyectojavafx;
}