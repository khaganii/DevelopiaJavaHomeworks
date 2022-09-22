package com.myfirstfxproject.registrationfx.utils;

import com.myfirstfxproject.registrationfx.MainApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class SwitchToOtherScene {
    public static void display(ActionEvent event, String fileName, String title) throws IOException {
        Stage viewStage = new Stage();
        FXMLLoader fxmlLoader = new FXMLLoader(MainApplication.class.getResource(fileName));
        Scene scene = new Scene(fxmlLoader.load());
        viewStage.setTitle(title);
        viewStage.setScene(scene);
        viewStage.setResizable(false);
        viewStage.setFullScreen(false);
        viewStage.show();
    }
}
