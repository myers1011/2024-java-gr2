package com.example;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class FormulaireApp extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Créer les composants
        Label label = new Label("Entrez votre nom :");
        TextField textField = new TextField();
        Button button = new Button("Valider");
        Label resultLabel = new Label();

        // Gérer l'événement du bouton
        button.setOnAction(event -> {
            String nom = textField.getText();
            resultLabel.setText("Bonjour, " + nom + " !");
        });

        // Organiser les composants dans un VBox
        VBox vbox = new VBox(10); // 10 est l'espacement entre les composants
        vbox.getChildren().addAll(label, textField, button, resultLabel);

        // Créer la scène et appliquer le fichier CSS
        Scene scene = new Scene(vbox, 300, 200);
        scene.getStylesheets().add(getClass().getResource("/styles.css").toExternalForm());

        // Afficher la fenêtre
        primaryStage.setTitle("Formulaire Stylisé");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}