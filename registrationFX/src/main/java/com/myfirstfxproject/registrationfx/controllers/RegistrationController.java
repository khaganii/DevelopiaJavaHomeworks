package com.myfirstfxproject.registrationfx.controllers;

import com.myfirstfxproject.registrationfx.entity.Person;
import com.myfirstfxproject.registrationfx.utils.ConnectionDb;
import com.myfirstfxproject.registrationfx.utils.CrudOperations;
import com.myfirstfxproject.registrationfx.utils.Gender;
import com.myfirstfxproject.registrationfx.utils.SwitchToOtherScene;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;


public class RegistrationController  implements Initializable {
    @FXML
    final ToggleGroup group = new ToggleGroup();

    //registration view
    @FXML
    private TextField name_textbox, surname_textbox, username_textbox;

    @FXML
    private ComboBox<String> highSchool_combobox;

    @FXML
    private DatePicker birthday_datepicker;

    @FXML
    private RadioButton male_radio, female_radio;


    @FXML
    private PasswordField newPassword_textbox, confirmPassword_textbox;

    @FXML
    private Button viewTable_button, submit_button;

    @FXML
    public void submit(ActionEvent event) {
        CrudOperations c = new CrudOperations();
        if(confirmPassword_textbox.getText().equals(newPassword_textbox.getText())){
            Person person = new Person();
            RadioButton rb = (RadioButton) group.getSelectedToggle();
            person.setName(name_textbox.getText());
            person.setSurname(surname_textbox.getText());
            person.setBirthday(birthday_datepicker.getValue());
            person.setHighSchool("asdfghj"); //highSchool_combobox.getValue()
            person.setGender(Gender.valueOf(rb.getText()));
            person.setUsername(username_textbox.getText());
            person.setPassword(newPassword_textbox.getText());
            c.save(person);
        }
        else {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setHeaderText("passwords is not equals");
        }
    }

    @FXML
    public void viewTable(ActionEvent event) throws IOException {
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        stage.close();
        SwitchToOtherScene.display(event, "table-view.fxml", "TableView");
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        CrudOperations crudOperations = new CrudOperations();
        male_radio.setToggleGroup(group);
        female_radio.setToggleGroup(group);
        highSchool_combobox.getItems().addAll(crudOperations.getAllHighSchools());

    }
}