package dad.login;

import javafx.beans.property.BooleanProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Model {
	
	private StringProperty userTF = new SimpleStringProperty();
	private StringProperty passwordTF = new SimpleStringProperty();
	private BooleanProperty ldapCB = new SimpleBooleanProperty();
	public final StringProperty userTFProperty() {
		return this.userTF;
	}
	
	public final String getUserTF() {
		return this.userTFProperty().get();
	}
	
	public final void setUserTF(final String userTF) {
		this.userTFProperty().set(userTF);
	}
	
	public final StringProperty passwordTFProperty() {
		return this.passwordTF;
	}
	
	public final String getPasswordTF() {
		return this.passwordTFProperty().get();
	}
	
	public final void setPasswordTF(final String passwordTF) {
		this.passwordTFProperty().set(passwordTF);
	}
	
	public final BooleanProperty ldapCBProperty() {
		return this.ldapCB;
	}
	
	public final boolean isLdapCB() {
		return this.ldapCBProperty().get();
	}
	
	public final void setLdapCB(final boolean ldapCB) {
		this.ldapCBProperty().set(ldapCB);
	}
	

}
