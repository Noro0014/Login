package dad.login;

import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;

public class View extends GridPane {
	
	private TextField userNameTF;
	private PasswordField userPasswordTF;
	private CheckBox ldapCheckbox;
	private Button loginButton, cancelButton;
	
	public View () {
		super();
		
		userNameTF = new TextField("Nombre del usuario");
		userPasswordTF = new PasswordField();
		ldapCheckbox = new CheckBox("Usar LDAP");
		loginButton = new Button ("Acceder");
		cancelButton = new Button ("Cancelar");
		
		HBox hbox = new HBox(5, loginButton, cancelButton);
		hbox.setAlignment(Pos.CENTER);
		
		
		setAlignment(Pos.CENTER);
		setHgap(5);
		setVgap(5);
		//setGridLinesVisible(true);
		setPadding(new Insets(5));
		
		addRow(0, new Label("Usuario:"), userNameTF);
		addRow(1, new Label("Contraseña:"), userPasswordTF);
		addRow(2, ldapCheckbox);
		addRow(3, hbox);
		
		GridPane.setColumnSpan(ldapCheckbox, 2); //Coger dos columnas
		GridPane.setHalignment(ldapCheckbox, HPos.CENTER);
		GridPane.setColumnSpan(hbox, 2); //Coger dos columnas
		GridPane.setHalignment(hbox, HPos.CENTER);
		
	}

	public TextField getUserNameTF() {
		return userNameTF;
	}

	public void setUserNameTF(TextField userNameTF) {
		this.userNameTF = userNameTF;
	}

	public TextField getUserPasswordTF() {
		return userPasswordTF;
	}

	public void setUserPasswordTF(PasswordField userPasswordTF) {
		this.userPasswordTF = userPasswordTF;
	}

	public CheckBox getLdapCheckbox() {
		return ldapCheckbox;
	}

	public void setLdapCheckbox(CheckBox ldapCheckbox) {
		this.ldapCheckbox = ldapCheckbox;
	}

	public Button getLoginButton() {
		return loginButton;
	}

	public void setLoginButton(Button loginButton) {
		this.loginButton = loginButton;
	}

	public Button getCancelButton() {
		return cancelButton;
	}

	public void setCancelButton(Button cancelButton) {
		this.cancelButton = cancelButton;
	}
	
	

}
