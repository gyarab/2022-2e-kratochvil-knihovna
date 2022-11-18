package cz.kratochvil.knihovnice;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.*;
import java.util.Objects;

public class Main extends Application {
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("Main.fxml")));
        stage.setScene(new Scene(root, 1080, 720));
        stage.show();
    }

    public static void main(String[] args) {
        launch();

        File usernames = new File("src/main/resources/cz/kratochvil/knihovnice/data/usernames.txt");
        if (!usernames.exists()) {
            try {
                usernames.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        File passwords = new File("src/main/resources/cz/kratochvil/knihovnice/data/passwords.txt");
        if (!passwords.exists()) {
            try {
                passwords.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}