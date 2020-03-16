
import java.util.ArrayList;

public class Login {
    // This will hold data for all logins for users.  These will have usernames and passwords
    private ArrayList<String> userNames = new ArrayList<String>();
    private ArrayList<String> passwords = new ArrayList<String>();

    Login() {
        userNames.add("fosterthepeople");
        userNames.add("auroraisthebest");
        userNames.add("steve");

        passwords.add("foster55");
        passwords.add("aurora55");
        passwords.add("steve55");
    }
    
    public void addUser(String userName, String password) {
        userNames.add(userName);
        passwords.add(password);
    }

    public boolean checkLogin(String userName, String password) {
        int index = userNames.indexOf(userName);
        boolean passwordCheck = false;
        if (index != -1) {
            passwordCheck = password.equals(passwords.get(index));
        }
        if (index != -1 && passwordCheck) {
            return true;
        } else if (index != -1) {
            System.out.println("Wrong Password");
            return false;
        } else {
            System.out.println("Username does not exist. Create an account");
            return false;
        }
        
    }
    public static void main(String[] args) {
        
    }
} 