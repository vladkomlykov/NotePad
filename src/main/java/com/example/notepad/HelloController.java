package com.example.notepad;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Random;

public class HelloController {

    public static int getCode() {
        return code;
    }

    public static void setCode(int code) {
        HelloController.code = code;
    }

    private static int code;
    @FXML
    public TextField phoneBox;


    public void loginButtonClick(ActionEvent actionEvent) throws IOException {
        Users usersList = new Users();
        CodeMenu codeMenu = new CodeMenu();
        for (int i = 0; i < usersList.users.size(); i++) {
            if (usersList.users.get(i).getPhone().equals(phoneBox.getText())) {
                openCodeMenu();
                codeMenu.generateCode();
            }
        }
    }





    private void openCodeMenu() throws IOException {
        Stage codeMenuStage = new Stage();
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("code-menu.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 500, 700);
        codeMenuStage.setTitle("Hello!");
        codeMenuStage.setScene(scene);
        codeMenuStage.show();
    }
}