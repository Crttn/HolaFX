package es.crttn;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class HolaFX extends Application{

    @Override
    public void start(Stage stage) throws Exception {

        Label saludoLabel = new Label();
        saludoLabel.setText("Esto es un texto :)");
        saludoLabel.setLayoutX(20);
        saludoLabel.setLayoutY(20);

        Button boton = new Button();
        boton.setText("Esto es un boton");
        boton.setLayoutX(20);
        boton.setLayoutY(60);
        boton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                System.out.println("Que haces :/");
            }
        });

        Pane root = new Pane();
        root.setStyle("-fx-background-color: cyan");
        root.getChildren().add(saludoLabel);
        root.getChildren().add(boton);

        Scene scene = new Scene(root, 320, 200);

        stage.setScene((scene));
        stage.setTitle("HolaFX");
        stage.setResizable(false);
        stage.show();
    }
}
