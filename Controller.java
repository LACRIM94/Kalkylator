package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class Controller {

    @FXML
    private Label result;
    private long num1 = 0;
    private String operator = "";
    private boolean start = true;


    @FXML
    public void processNum(ActionEvent event) {
        if (start) {
            result.setText("");
            start = false;
        }
        String value = ((Button)event.getSource()).getText();
        result.setText(result.getText()+ value);



}

    @FXML
    public void processOperator(ActionEvent event) {


        }


    }
}
