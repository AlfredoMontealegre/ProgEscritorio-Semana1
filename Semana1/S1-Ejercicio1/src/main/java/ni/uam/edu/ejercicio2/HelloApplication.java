package ni.uam.edu.ejercicio2;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class HelloApplication extends Application {

// Ejercicio 1: Leer el salario de un trabajaor,
// calcular el seguro social del 7% ademas de darle un bono
// de 10% si su salario es menor a 12000, 5% si esta entre
// 12000 a 20000 y un 3% si es mayor a 20000.

    @Override
    public void start(Stage stage) {

        VBox root = new VBox();

        root.setSpacing(10);
        root.setPadding(new Insets(20));

        Label lblTitle = new Label("Calculo de Salario");

        Label lblSalary = new Label("Salario:");
        TextField txtSalary = new TextField();

        Label lblSeguro = new Label("Seguro Social: 0");
        Label lblBono = new Label("Bono: 0");
        Label lblNeto = new Label("Salario Neto: 0");

        Button btnCalcular = new Button("Calcular");

        btnCalcular.setOnAction(event -> {

            double salario = Double.parseDouble(txtSalary.getText());

            double seguro = salario * 0.07;

            double bono;

            if (salario < 12000) {
                bono = salario * 0.10;
            } else if (salario <= 20000) {
                bono = salario * 0.05;
            } else {
                bono = salario * 0.03;
            }

            double salarioNeto = salario - seguro + bono;

            lblSeguro.setText("Seguro Social: " + seguro);
            lblBono.setText("Bono: " + bono);
            lblNeto.setText("Salario Neto: " + salarioNeto);
        });

        root.getChildren().addAll(lblTitle, lblSalary, txtSalary, lblSeguro, lblBono,
                lblNeto, btnCalcular);

        Scene scene = new Scene(root, 300, 350);
        stage.setScene(scene);
        stage.setTitle("Salario del Trabajador");
        stage.show();
    }
}