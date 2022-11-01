package dad.login;

import dad.login.auth.AuthService;
import dad.login.auth.FileAuthService;
import dad.login.auth.LdapAuthService;
import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

public class Controller {
	
	private View view = new View();
	private Model model = new Model();
	
	public Controller() {

		view.getUserNameTF().textProperty().bindBidirectional(model.userTFProperty());
		view.getUserPasswordTF().textProperty().bindBidirectional(model.passwordTFProperty());
		view.getLdapCheckbox().selectedProperty().bindBidirectional(model.ldapCBProperty());

		view.getLoginButton().setOnAction(this :: onAccederAction);
		view.getCancelButton().setOnAction(this :: onCancelarAction);
	}

	private void onAccederAction(ActionEvent ea) {
		AuthService ldap = model.isLdapCB() ? new LdapAuthService() : new FileAuthService();
		
		try {
			
			if (ldap.login(model.getUserTF(), model.getPasswordTF()) == true) {
				Alert alert = new Alert(AlertType.INFORMATION);
				alert.setTitle("Login");
				alert.setContentText("Las credenciales de acceso son válidas.");
				alert.setHeaderText("Acceso permitido");
				alert.showAndWait();
				
			} else {
				Alert alert = new Alert(AlertType.ERROR);
				alert.setTitle("Login");
				alert.setContentText("El usuario y/o contraseña no son válidos.");
				alert.setHeaderText("Acceso denegado");
				alert.showAndWait();
			}
			
		} catch (Exception ex) {
			System.out.println("Ha ocurrido algún error.");
		}
		
	}

	private void onCancelarAction(ActionEvent ec) {
		System.exit(0);
	}

	public View getView() {
		return view;
	}

	public void setView(View view) {
		this.view = view;
	}

	public Model getModel() {
		return model;
	}

	public void setModel(Model model) {
		this.model = model;
	}
	

}
