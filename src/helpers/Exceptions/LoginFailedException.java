package helpers.Exceptions;


public class LoginFailedException extends Exception{
    public String email;

    public LoginFailedException(String string) {
        super("Login para e-mail: " + string + " falhou.");
        this.email=string;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
