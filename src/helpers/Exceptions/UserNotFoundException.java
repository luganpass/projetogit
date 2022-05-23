package helpers.Exceptions;

public class UserNotFoundException extends Exception {
    private String email;

    public UserNotFoundException(String email) {
        super("Usuario com e-mail: " + email + " não encontrado");
        this.email = email;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
