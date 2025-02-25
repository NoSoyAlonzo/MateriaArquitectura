package emails.main;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class controladorLogin {

    @FXML
    private Button Btn_inicioS;

    @FXML
    private TextField Tf_Usuario;

    @FXML
    private PasswordField Tf_pass;

    @FXML
    void IniciarSesion(ActionEvent event) {
        //cambiar pantalla al ingresar boton inciar sesion

        try{
            FXMLLoader loader= new FXMLLoader(getClass().getResource("/emails/fxml/interfazCorreo.fxml"));


        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}
