package j25_Exceptions.Tasks.Task06;

public class User {
    private static int idCounter = 1;
    private int id;
    private String username;
    private String password;
    private boolean active=true;
    private boolean signedIn=false;

    public User(String username, String password) throws Exception {
        this.id = idCounter++;
        this.username = username;
        if (password.length() < 6) {
            throw new Exception("Şifre en az 6 karakter olmalıdır.");
        }
        this.password = password;
        this.active = true; // Default olarak true
        this.signedIn = false; // Default olarak false
    }

    public static int getIdCounter() {
        return idCounter;
    }

    public static void setIdCounter(int idCounter) {
        User.idCounter = idCounter;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public boolean isSignedIn() {
        return signedIn;
    }

    public void setSignedIn(boolean signedIn) {
        this.signedIn = signedIn;
    }
}
