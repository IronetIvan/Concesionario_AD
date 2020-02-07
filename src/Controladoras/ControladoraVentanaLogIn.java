package Controladoras;

import Ventanas.VentanaListar;
import Ventanas.VentanaLogIn;
import Ventanas.VentanaUno;
import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

import javax.swing.*;
import java.net.URL;
import java.util.ResourceBundle;

public class ControladoraVentanaLogIn implements Initializable {
    @FXML
    JFXButton btnVolver,btnIniciar;
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        acciones();
    }

    private void acciones() {
        btnVolver.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                VentanaUno v1 = new VentanaUno();
                VentanaLogIn vLogIn = (VentanaLogIn) btnVolver.getScene().getWindow();
                vLogIn.close();
            }
        });
    }
}
