package dad.template.javafx;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

public class CalController implements Initializable {
	Calculadora Cal= new Calculadora();
	
	@FXML
    private GridPane root;

    @FXML
    private TextField resultadoText;

    @FXML
    private Button button0;

    @FXML
    private Button buttonIgual;

    @FXML
    private Button buttonSuma;

    @FXML
    private Button buttonResta;

    @FXML
    private Button button3;

    @FXML
    private Button button2;

    @FXML
    private Button buttonComa;

    @FXML
    private Button button1;

    @FXML
    private Button button7;

    @FXML
    private Button button8;

    @FXML
    private Button button4;

    @FXML
    private Button button5;

    @FXML
    private Button button6;

    @FXML
    private Button buttonMult;

    @FXML
    private Button button9;

    @FXML
    private Button buttonCE;

    @FXML
    private Button buttonC;

    @FXML
    private Button buttonDiv;
    @FXML
    void onButton0(ActionEvent event) {
		char Char='0';
		Cal.insertar( Char);
		resultadoText.setText(Cal.getPantalla());
    }

    @FXML
    void onButton1(ActionEvent event) {
    	char Char='1';
		Cal.insertar( Char);
		resultadoText.setText(Cal.getPantalla());
    }

    @FXML
    void onButton2(ActionEvent event) {
    	char Char='2';
		Cal.insertar( Char);
		resultadoText.setText(Cal.getPantalla());
    }

    @FXML
    void onButton3(ActionEvent event) {
    	char Char='3';
		Cal.insertar( Char);
		resultadoText.setText(Cal.getPantalla());
    }

    @FXML
    void onButton4(ActionEvent event) {
    	char Char='4';
		Cal.insertar( Char);
		resultadoText.setText(Cal.getPantalla());
    }

    @FXML
    void onButton5(ActionEvent event) {
    	char Char='5';
		Cal.insertar( Char);
		resultadoText.setText(Cal.getPantalla());
    }

    @FXML
    void onButton6(ActionEvent event) {
    	char Char='6';
		Cal.insertar( Char);
		resultadoText.setText(Cal.getPantalla());
    }

    @FXML
    void onButton7(ActionEvent event) {
    	char Char='7';
		Cal.insertar( Char);
		resultadoText.setText(Cal.getPantalla());
    }

    @FXML
    void onButton8(ActionEvent event) {
    	char Char='8';
		Cal.insertar( Char);
		resultadoText.setText(Cal.getPantalla());
    }

    @FXML
    void onButton9(ActionEvent event) {
    	char Char='9';
		Cal.insertar( Char);
		resultadoText.setText(Cal.getPantalla());
    }

    @FXML
    void onButtonC(ActionEvent event) {
    	Cal.borrar();
    	resultadoText.setText(Cal.getPantalla());
    }

    @FXML
    void onButtonCE(ActionEvent event) {
    	Cal.borrarTodo();
    	resultadoText.setText(Cal.getPantalla());
    }

    @FXML
    void onButtonComa(ActionEvent event) {
    	Cal.insertarComa();
    	resultadoText.setText(Cal.getPantalla());
    }

    @FXML
    void onButtonDiv(ActionEvent event) {
    	char Char='/';
    	Cal.operar(Char);
    	resultadoText.setText(Cal.getPantalla());
    }

    @FXML
    void onButtonIgual(ActionEvent event) {
    	char Char='=';
    	Cal.operar(Char);
    	resultadoText.setText(Cal.getPantalla());
    }

    @FXML
    void onButtonMul(ActionEvent event) {
    	char Char='*';
    	Cal.operar(Char);
    	resultadoText.setText(Cal.getPantalla());
    }

    @FXML
    void onButtonRes(ActionEvent event) {
    	char Char='-';
    	Cal.operar(Char);
    	resultadoText.setText(Cal.getPantalla());
    }

    @FXML
    void onButtonSum(ActionEvent event) {
    	char Char='+';
    	Cal.operar(Char);
    	resultadoText.setText(Cal.getPantalla());
    }
	
	public CalController() throws IOException {
		FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/CalculadoraFXMLview.fxml"));
		loader.setController(this);
		loader.load();
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {

	}
	
	public GridPane getRoot() {
		return root;
	}

}
