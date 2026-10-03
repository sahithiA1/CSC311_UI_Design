package org.example.csc311_ui_design;

import javafx.fxml.FXML;
import java.io.IOException;

public class LoginController {

    @FXML
    private void goToLanding() throws IOException {
        StudentPortalApplication.changeScene("landing-view.fxml");
    }
    @FXML
    private void goToRegister() throws IOException{
        StudentPortalApplication.changeScene("register-view.fxml");
    }
}