package tsouapp.controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.input.KeyEvent;
import jxl.read.biff.BiffException;
import tsouapp.data.dbConnection;
import tsouapp.raport.importxls;

/**
 *
 * @author alxga
 */
public class Controller implements Initializable {



    @Override
    public void initialize(URL url, ResourceBundle rb) {

    }

    public void yearBoxAction(ActionEvent actionEvent) {
    }

    public void groupBoxAction(ActionEvent actionEvent) {
    }

    public void ADDAction(ActionEvent actionEvent) throws IOException, BiffException {
        importxls imp = new importxls();
        imp.imrev("xls");
    }

    public void EDITAction(ActionEvent actionEvent) {
    }

    public void DELETEAction(ActionEvent actionEvent) {
    }

    public void btnExitAction(ActionEvent actionEvent) {
    }

    public void btnAddressAction(ActionEvent actionEvent) {
    }

    public void addressChooserAction(ActionEvent actionEvent) {
    }

    public void addDayAction(ActionEvent actionEvent) {
    }

    public void delKey(KeyEvent keyEvent) {
    }
}