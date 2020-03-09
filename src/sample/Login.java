package src.sample;

import java.util.ArrayList;

public class Login {
    // This will hold data for all logins for users.  These will have usernames and passwords
    private ArrayList<String> userNames = new ArrayList<String>();
    private ArrayList<String> passwords = new ArrayList<String>();

    Login(){
        userNames.add("fosterthepeople");

        passwords.add("foster55");
    }

    public boolean checkLogin(String userName, String password) {
        System.out.println(userNames);
        return true;
    }
    public static void main(String[] args) {
        
    }
} 