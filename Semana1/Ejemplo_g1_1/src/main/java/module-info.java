module ni.uam.edu.ejemplo_g1_1 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens ni.uam.edu.ejemplo_g1_1 to javafx.fxml;
    exports ni.uam.edu.ejemplo_g1_1;
}