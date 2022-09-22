package com.myfirstfxproject.registrationfx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.stage.Stage;

import java.io.IOException;

public class ViewTableController {
    @FXML
    private TableView<Person> tableView;

    @FXML
    private TableColumn<?, ?> nameColumn;

    @FXML
    private TableColumn<?, ?> surnameColumn;

    @FXML
    private TableColumn<?, ?> birthdayColumn;

    @FXML
    private TableColumn<?, ?> highSchoolColumn;

    @FXML
    private TableColumn<?, ?> genderColumn;

    @FXML
    private TableColumn<?, ?> usernameColumn;

    @FXML
    private TableColumn<?, ?> usernameColumn1;

    @FXML
    private Button back_button;

    @FXML
    private Button exit_button;

    public static void display(ActionEvent event) throws IOException {
        Stage viewStage = new Stage();
        FXMLLoader fxmlLoader = new FXMLLoader(MainApplication.class.getResource("table_view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        viewStage.setTitle("RegistrationApp");
        viewStage.setScene(scene);
        viewStage.setResizable(false);
        viewStage.setFullScreen(false);
        viewStage.show();
    }
}
