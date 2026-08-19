package ni.uam.edu.ejemplo_g1_1;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    private TextField tfName;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Hola " + tfName.getText());
    }
}
