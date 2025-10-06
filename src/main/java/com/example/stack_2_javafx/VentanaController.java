package com.example.stack_2_javafx;

import Clases.Pila;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;

public class VentanaController {
    @FXML
    private Button btnComprobar;

    @FXML
    private Label lblResultado;

    @FXML
    private TextArea txtCodigo;

    private Pila pila = new Pila(); // instancia de tu clase lógica

    @FXML
    private void initialize() {
        // Esto se ejecuta automáticamente al cargar el FXML
        btnComprobar.setOnAction(e -> comprobarCodigo());
    }

    @FXML
    private void comprobarCodigo() {
        try {
            String codigo = txtCodigo.getText();

            if (codigo.equals("")) {
                lblResultado.setText("El campo de código está vacío");
                Alert alerta = new Alert(Alert.AlertType.WARNING);
                alerta.setTitle("Advertencia");
                alerta.setHeaderText(null);
                alerta.setContentText("Por favor, ingresa un código antes de comprobar.");
                alerta.showAndWait();
                return;
            }

            String resultado = pila.balanceado(codigo);
            lblResultado.setText(resultado);

        } catch (Exception ex) {
            lblResultado.setText(ex.getMessage());
        }
    }

}
