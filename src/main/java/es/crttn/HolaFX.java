package es.crttn;

import javafx.application.Application;
import javafx.scene.layout.Pane;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class HolaFX extends Application{

    @Override
    public void start(Stage stage) throws Exception {

        Pane root = new Pane();
        Scene scene = new Scene(root, 320, 200);

        stage.setScene((scene));
        stage.setTitle("HolaFX");
        stage.setResizable(false);
        stage.show();
    }
}
