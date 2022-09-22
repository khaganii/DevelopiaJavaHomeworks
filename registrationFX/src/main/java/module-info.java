module com.myfirstfxproject.registrationfx {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires lombok;

    opens com.myfirstfxproject.registrationfx to javafx.fxml;
    exports com.myfirstfxproject.registrationfx;
    exports com.myfirstfxproject.registrationfx.controllers;
    opens com.myfirstfxproject.registrationfx.controllers to javafx.fxml;
    exports com.myfirstfxproject.registrationfx.utils;
    opens com.myfirstfxproject.registrationfx.utils to javafx.fxml;
    exports com.myfirstfxproject.registrationfx.entity;
    opens com.myfirstfxproject.registrationfx.entity to javafx.fxml;
}