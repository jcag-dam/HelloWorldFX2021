package sample;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

public class Controller implements Initializable {


    @FXML
    private Label name;

    private void init() {
        name.setText("Hello World!");
    }


    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }


}


