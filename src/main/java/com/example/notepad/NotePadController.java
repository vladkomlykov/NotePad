package com.example.notepad;

import javafx.beans.Observable;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

public class NotePadController {
    @FXML
    public TextField noteField;
    @FXML
    public Button addNoteButton;
    @FXML
    public Button delNoteButton;
    @FXML
    public ListView<String> listOfNotes;

    private ObservableList<String> notes;

    public void initialize() {
        notes = FXCollections.observableArrayList();
        listOfNotes.setItems(notes);
    }

    @FXML
    public void clickAddNoteButton(ActionEvent actionEvent) {
        String noteText = noteField.getText();
        if (!noteText.isEmpty()) {
            notes.add(noteText);
            noteField.clear();
        }
    }

    @FXML
    public void clickDelNoteButton(ActionEvent actionEvent) {
        String noteToRemove = noteField.getText();
        notes.remove(noteToRemove);
    }
}
