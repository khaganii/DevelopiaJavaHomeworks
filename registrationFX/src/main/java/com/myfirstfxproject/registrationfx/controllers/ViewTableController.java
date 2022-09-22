package com.myfirstfxproject.registrationfx.controllers;

import com.myfirstfxproject.registrationfx.utils.Gender;
import com.myfirstfxproject.registrationfx.entity.Person;
import com.myfirstfxproject.registrationfx.utils.SwitchToOtherScene;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.stage.Stage;

import java.io.IOException;
import java.time.LocalDate;

public class ViewTableController {
    @FXML
    private TableView<Person> tableView;

    @FXML
    private TableColumn<Person, String> nameColumn;

    @FXML
    private TableColumn<Person, String> surnameColumn;

    @FXML
    private TableColumn<Person, LocalDate> birthdayColumn;

    @FXML
    private TableColumn<Person, String> highSchoolColumn;

    @FXML
    private TableColumn<Person, Gender> genderColumn;

    @FXML
    private TableColumn<Person, String> usernameColumn;

    @FXML
    private Button back_button, exit_button, refreshTable_button, deletePerson_button, editPerson_button;
    @FXML
    public void backToRegistration(ActionEvent event) throws IOException {
        SwitchToOtherScene.display(event, "registration-view.fxml", "RegistrationApp");
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        stage.close();
    }

    @FXML
    public void exit(ActionEvent event){
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        stage.close();
    }

    @FXML
    public void deletePerson_button(ActionEvent event) {

    }

    @FXML
    public void editPerson_button(ActionEvent event) {
    }

    @FXML
    public void refreshTable_button(ActionEvent event) {
    }
}
