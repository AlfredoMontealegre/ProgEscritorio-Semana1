package ni.uam.edu.ejercicio1;

// Ejercicio 2: Leer el salario de n cantidad de empleados, calcular
// el salario mas alto, mas bajo, el promedio y la moda.

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class HelloApplication extends Application {

    @Override
    public void start(Stage stage) {

        VBox root = new VBox();

        root.setSpacing(10);
        root.setPadding(new Insets(20));

        Label lblTitle = new Label("Salarios de Empleados");

        Label lblCantidad = new Label("Cantidad de empleados:");
        TextField txtCantidad = new TextField();

        Button btnGenerar = new Button("Ingresar salarios");

        VBox salariosBox = new VBox();
        salariosBox.setSpacing(5);

        Button btnCalcular = new Button("Calcular");

        Label lblMayor = new Label("Salario más alto: 0");
        Label lblMenor = new Label("Salario más bajo: 0");
        Label lblPromedio = new Label("Promedio: 0");
        Label lblModa = new Label("Moda: 0");


        // Generaciones de textfield con for
        // Aqui se hace un bucle for teniendo en cuenta q al inicio estamos pidiendo la cantidad de salarios
        // a ingresar a la aplicacion.
        btnGenerar.setOnAction(event -> {

            int cantidad = Integer.parseInt(txtCantidad.getText());

            salariosBox.getChildren().clear();

            for (int i = 0; i < cantidad; i++) {

                Label lblSalario = new Label(
                        "Salario del empleado " + (i + 1) + ":"
                );

                TextField txtSalario = new TextField();

                salariosBox.getChildren().addAll(
                        lblSalario,
                        txtSalario
                );
            }
        });


        // Calculos
        btnCalcular.setOnAction(event -> {

            int cantidad = Integer.parseInt(txtCantidad.getText());

            double[] salarios = new double[cantidad];

            int posicion = 0;

            for (int i = 0; i < salariosBox.getChildren().size(); i++) {

                if (salariosBox.getChildren().get(i) instanceof TextField) {

                    TextField txtSalario =
                            (TextField) salariosBox.getChildren().get(i);

                    salarios[posicion] =
                            Double.parseDouble(txtSalario.getText());

                    posicion++;
                }
            }


            // Calculos dependiendo las categorias

            double mayor = salarios[0];
            double menor = salarios[0];
            double suma = 0;

            for (int i = 0; i < cantidad; i++) {

                suma += salarios[i];

                if (salarios[i] > mayor) {
                    mayor = salarios[i];
                }

                if (salarios[i] < menor) {
                    menor = salarios[i];
                }
            }

            double promedio = suma / cantidad;


            double moda = salarios[0];
            int mayorRepeticion = 0;

            for (int i = 0; i < cantidad; i++) {

                int contador = 0;

                for (int j = 0; j < cantidad; j++) {

                    if (salarios[i] == salarios[j]) {
                        contador++;
                    }
                }

                if (contador > mayorRepeticion) {
                    mayorRepeticion = contador;
                    moda = salarios[i];
                }
            }


            lblMayor.setText("Salario más alto: " + mayor);
            lblMenor.setText("Salario más bajo: " + menor);
            lblPromedio.setText("Promedio: " + promedio);
            lblModa.setText("Moda: " + moda);
        });


        root.getChildren().addAll(lblTitle, lblCantidad, txtCantidad, btnGenerar, salariosBox,
                btnCalcular, lblMayor, lblMenor, lblPromedio, lblModa);


        Scene scene = new Scene(root, 350, 500);
        stage.setScene(scene);
        stage.setTitle("Salarios");
        stage.show();
    }
}