package com.example.notepad;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.PasswordField;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.IdentityHashMap;
import java.util.Random;
import java.util.ResourceBundle;

public class CodeMenu {
    @FXML
    public PasswordField codeBox;


    public void onEnterCodeButtonClick(ActionEvent actionEvent) throws IOException {
        if (codeBox.getText().equals(String.valueOf(HelloController.getCode()))) {
            Stage notePadStage = new Stage();
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("notePad-view.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 400, 250);
            notePadStage.setTitle("Hello!");
            notePadStage.setScene(scene);
            notePadStage.show();
        }
    }

    public void generateCode() {
        Random random = new Random();
        HelloController.setCode(random.nextInt(((9999 - 1000) + 1) + 1000));

        System.out.println(HelloController.getCode());

    }

}
