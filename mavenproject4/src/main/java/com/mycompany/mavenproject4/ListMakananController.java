/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject4;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import static javax.swing.JOptionPane.showMessageDialog;

/**
 * FXML Controller class
 *
 * @author ASUS
 */
public class ListMakananController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    @FXML
    private void listMakanan(ActionEvent event) throws IOException {
    Parent root = FXMLLoader.load(getClass().getResource("/fxml/listMakanan.fxml"));
        Scene scene = new Scene(root);
        scene.getStylesheets().add("/style/Style.css");
        Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
        window.setScene(scene);
        window.show();
    }

    @FXML
    private void resikoPenyakit(ActionEvent event) throws IOException {
    Parent root = FXMLLoader.load(getClass().getResource("/fxml/resikoPenyakit.fxml"));
        Scene scene = new Scene(root);
        scene.getStylesheets().add("/style/Style.css");
        Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
        window.setScene(scene);
        window.show();  
    }

    @FXML
    private void olahraga(ActionEvent event) throws IOException {
    Parent root = FXMLLoader.load(getClass().getResource("/fxml/olahraga.fxml"));
        Scene scene = new Scene(root);
        scene.getStylesheets().add("/style/Style.css");
        Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
        window.setScene(scene);
        window.show();
    }

    @FXML
    private void caraPenanganan(ActionEvent event) throws IOException {
    Parent root = FXMLLoader.load(getClass().getResource("/fxml/caraPenanganan.fxml"));
        Scene scene = new Scene(root);
        scene.getStylesheets().add("/style/Style.css");
        Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
        window.setScene(scene);
        window.show();
    }

    @FXML
    private void btnLogout(ActionEvent event) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/fxml/Login.fxml"));
            Scene scene = new Scene(root);
            scene.getStylesheets().add("/style/Style.css");
            Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
            window.setScene(scene);
            window.show();
        } catch(Exception e) {
            showMessageDialog(null,e.getMessage());
        }
    }
    @FXML
    private void btnEditProfil(ActionEvent event){
       try {
            Parent root = FXMLLoader.load(getClass().getResource("/fxml/editProfil.fxml"));
            Scene scene = new Scene(root);
            scene.getStylesheets().add("/style/Style.css");
            Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
            window.setScene(scene);
            window.show();
        } catch(Exception e) {
            showMessageDialog(null,e.getMessage());
        }
    }
    
    @FXML
    private void btnUbahPass(ActionEvent event){
       try {
            Parent root = FXMLLoader.load(getClass().getResource("/fxml/ubahPassword.fxml"));
            Scene scene = new Scene(root);
            scene.getStylesheets().add("/style/Style.css");
            Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
            window.setScene(scene);
            window.show();
        } catch(Exception e) {
            showMessageDialog(null,e.getMessage());
        }
    }
    
}