package org.example.csc311_ui_design;

import javafx.fxml.FXML;
import java.io.IOException;

public class LandingController {

    @FXML
    private void goToLogin() throws IOException {
        StudentPortalApplication.changeScene("login-view.fxml");
    }
}
