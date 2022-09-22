package com.myfirstfxproject.registrationfx;

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
    String name;
    String surname;

    //registration view
    @FXML
    private TextField name_textbox, surname_textbox, highSchool_textbox, username_textbox;
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
        name = name_textbox.getText().trim();
        surname = surname_textbox.getText().trim();
        Alert alert = new Alert(Alert.AlertType.NONE);
        alert.setTitle("Information");
        alert.setHeaderText("Name: " + name + "\n" + "Surname: " + surname);
        alert.showAndWait();
    }

    @FXML
    public void viewTable(ActionEvent event) throws IOException {
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        stage.close();
        ViewTableController.display(event);
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}