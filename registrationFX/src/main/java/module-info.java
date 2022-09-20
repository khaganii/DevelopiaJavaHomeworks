module com.myfirstfxproject.registrationfx {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;

    opens com.myfirstfxproject.registrationfx to javafx.fxml;
    exports com.myfirstfxproject.registrationfx;
}