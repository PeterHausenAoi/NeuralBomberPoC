package com.github.PeterHausenAoi.NeuralBomberPoC;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.InputStream;

public class FxMain  extends Application {
    public static void main(String[] args){
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader loader = new FXMLLoader();

        Controller ctrl = new Controller();
        loader.setController(ctrl);

        InputStream is = getClass().getClassLoader().getResourceAsStream("main.fxml");

        if(is == null){
            System.out.println("Anim view not found.");
            System.exit(-1);
        }

        VBox root = loader.load(is);
        root.setPadding(new Insets(10,10,10,10));
        Scene scene = new Scene(root);

        stage.setScene(scene);
        stage.setMaximized(true);
        stage.show();
    }
}
