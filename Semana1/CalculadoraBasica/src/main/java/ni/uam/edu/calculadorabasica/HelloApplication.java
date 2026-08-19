package ni.uam.edu.calculadorabasica;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {

    @Override
    public void start(Stage stage) throws IOException {

        VBox root = new VBox();
        root.setSpacing(10);
        root.setPadding(new Insets(20));

        Label lblTitle = new Label("Calculadora Basica");

        Label lblNum1 = new Label("Numero 1");
        TextField txtNumber1 = new TextField();

        Label lblNum2 = new Label("Numero 2");
        TextField txtNumber2 = new TextField();

        Label lblAnswer = new Label("0");

        Button btnSum = new Button("+");
        Button btnRes = new Button("-");
        Button btnMul = new Button("*");
        Button btnDiv = new Button("/");


        // Suma
        btnSum.setOnAction(event -> {
            double num1 = Double.parseDouble(txtNumber1.getText());
            double num2 = Double.parseDouble(txtNumber2.getText());

            double resultado = num1 + num2;

            lblAnswer.setText(String.valueOf(resultado));
        });


        // Resta
        btnRes.setOnAction(event -> {
            double num1 = Double.parseDouble(txtNumber1.getText());
            double num2 = Double.parseDouble(txtNumber2.getText());

            double resultado = num1 - num2;

            lblAnswer.setText(String.valueOf(resultado));
        });


        // Multiplicacion
        btnMul.setOnAction(event -> {
            double num1 = Double.parseDouble(txtNumber1.getText());
            double num2 = Double.parseDouble(txtNumber2.getText());

            double resultado = num1 * num2;

            lblAnswer.setText(String.valueOf(resultado));
        });


        // Division
        btnDiv.setOnAction(event -> {
            double num1 = Double.parseDouble(txtNumber1.getText());
            double num2 = Double.parseDouble(txtNumber2.getText());

            double resultado = num1 / num2;

            lblAnswer.setText(String.valueOf(resultado));
        });


        HBox buttons = new HBox();

        buttons.setAlignment(Pos.CENTER);
        buttons.setSpacing(10);
        buttons.setPadding(new Insets(10));
        buttons.setStyle("-fx-background-color: #ffffff;");
        buttons.getChildren().addAll(btnSum, btnRes, btnMul, btnDiv);


        root.getChildren().addAll(lblTitle, lblNum1, txtNumber1, lblNum2, txtNumber2,
                lblAnswer, buttons);


        Scene scene = new Scene(root, 300, 300);

        stage.setScene(scene);
        stage.setTitle("UAM Calculadora");
        stage.show();
    }
}