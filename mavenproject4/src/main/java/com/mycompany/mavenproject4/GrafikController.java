/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject4;

import java.net.URL;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;
import static javax.swing.JOptionPane.showMessageDialog;

/**
 * FXML Controller class
 *
 * @author acer
 */
public class GrafikController implements Initializable {
       
    @FXML
    void btnBack(ActionEvent event) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/fxml/menu.fxml"));
            Scene scene = new Scene(root);
            scene.getStylesheets().add("/style/Style.css");
            Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
            window.setScene(scene);
            window.show();
        } catch(Exception e) {
            showMessageDialog(null,e.getMessage());
        }
    }
    /**
     * Initializes the controller class.
     */
    @FXML
    private void cbJenisOnAction(){
//        if(cbJenis.getSelectionModel().getSelecctedIndex()==0){
//            XYChart.Series<String, Integer> sistolSeries = new XYChart.Series<>(); 
//            XYChart.Series<String, Integer> diastolSeries = new XYChart.Series<>();
//            sistolSeries.setName("Sistolik");
//            diastolSeries.setName("Diastolik");
//            
//            try{
//                String sql = "SELECT * FROM data WHERE username = '"+username+"'";
//                Connection con = Db.connectDB();
//                Statement stmt = con.createStatement();
//                ResultSet rs = stmt.executeQuery(sql);
//                while(rs.next()){
//                    String tanggal = rs.getString("tanggal");
//                    int sistol = rs.getInt("sistol");
//                    int diastol = rs.getInt("diastol");
//                    sistolSeries.getData().add(new XYChart.Data<>(tanggal, sistol));
//                    diastolSeries.getData().add(new XYChart.Data<>(tanggal, diastol));
//                }
//                con.close();
//            }catch(SQLException e){
//                showMessageDialog(null, e.getMessage());
//            }
//            chart.getData().clear;
//            chart.getData().add(sistolSeries);
//            chart.getData().add(diastolSeries);
//        }else if(cbJenis.getSelectionModel().getSelectedIndex()==1){
//            
//        }
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
