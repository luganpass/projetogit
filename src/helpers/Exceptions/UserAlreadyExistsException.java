package helpers.Exceptions;

public class UserAlreadyExistsException extends Exception {
    private String email;

    public UserAlreadyExistsException(String email) {
        super("Usuario com e-mail: " + email + " já existe.");
        this.email = email;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
