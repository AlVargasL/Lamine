package mx.edu.utez.javafx;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.awt.*;
import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.TextArea;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;


public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        Label lblNombre = new Label("Nombre:");
        TextField tfNombre = new TextField();

        Label lblEdad = new Label("Edad: ");
        TextField tfEdad = new TextField();

        Label lblOpciones = new Label("Opciones:");
        ObservableList<String> opciones = FXCollections.observableArrayList("Estudiante", "Profesor", "Administrador");
        ComboBox<String> cmbOpciones = new ComboBox<>(opciones);

        Button btnCrear = new Button("Crear");
        Label lblResultado = new Label();

        // Acción del botón
        btnCrear.setOnAction((ActionEvent e) -> {
            String nombre = tfNombre.getText();
            String edad = tfEdad.getText();
            String seleccion = cmbOpciones.getSelectionModel().getSelectedItem();
            if(nombre.isEmpty() || edad.isEmpty() || seleccion==null) {
                System.out.println("Todos los campos son obligatorios");
                lblResultado.setText("Todos los campos son obligatorios");
            } else{
                lblResultado.setText("Nombre: " + nombre +"\nEdad: " + edad +"\nOpciones: " + seleccion);
                lblResultado.setStyle("-fx-text-fill: green;");
            }
        });
        GridPane form = new GridPane();
        form.setAlignment(Pos.CENTER);
        form.setHgap(10);
        form.setVgap(10);

        form.add(lblNombre, 0, 0);
        form.add(tfNombre, 1, 0);
        form.add(lblEdad, 0, 1);
        form.add(tfEdad, 1, 1);
        form.add(lblOpciones, 0, 2);
        form.add(cmbOpciones, 1, 2);
        form.add(btnCrear, 0, 3);
        form.add(lblResultado, 1, 4);

        // Agregar los nodos a un layout
        //VBox root = new VBox(10, lblNombre, tfNombre, lblEdad, tfEdad, lblOpciones, cmbOpciones, btnCrear, lblResultado);

        Scene scene = new Scene(form, 500, 700);

        stage.setScene(scene);
        stage.setTitle("Alan Emir Vargas Luna - Mi primer Formulario en JavaFX");
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}