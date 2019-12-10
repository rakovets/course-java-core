package sample;

import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.sql.SQLOutput;

public class Controller {
    String login = "admin";
    String password = "admin";

     @FXML
    Label loginLabel;
      @FXML
     Label passwordLabel;
     @FXML
    TextField loginTextField;
     @FXML
    PasswordField passwordTextField;
     @FXML
    public void mouseClickSignIn(ActionEvent event) {
         System.out.println("Login: " + loginTextField.getText());
         System.out.println("Password: " + passwordTextField.getText());

         if(login.equals(loginTextField.getText()) & password.equals(passwordTextField.getText())) {
             System.out.println("Access");
         } else {
             System.out.println("Denied");
         }
     }



}
