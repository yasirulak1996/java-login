import java.util.Scanner;

public class Login {
    String[] username = new String[100];
    String[] pass = new String[100];

    public void sign_up(String name, String password) {
        if (name.isEmpty() || password.isEmpty()) {
            System.out.println("please enter username and password");
        } else {
            for (int i = 1; i < 100; i++) {
                if (username[i] == null) {
                    username[i] = name;
                    pass[i] = password;
                    System.out.println("User registered successfully!");
                    break;
                }
            }
        }
    }

    public boolean login(String user1, String pass1) {
        for (int i = 0; i < 100; i++) {
            if (username[i] != null && username[i].equals(user1) && pass[i].equals(pass1)) {
                return true;
            }
        }
        return false;
    }
}

