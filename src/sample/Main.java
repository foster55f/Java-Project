
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    Scanner input;
    UserData userData;
    User currentUser;
    Login login;

    Main() {
        input = new Scanner(System.in);
        userData = new UserData();
        login = new Login();
    }

    public String welcomeMessage() {
        System.out.println("Welcome to Foster a Post!  You can login or Sign Up Now!");
        Main main = new Main();
        String option = input.nextLine().toLowerCase();
        if (option.equals("login")) {
            String userName = main.checkLogin();
            if (userName.equals("Nice try.  Try again.")) {
                return "";
            }
            return userName;
        } else if (option.equals("Sign Up")) {
            String userName = main.makeAccount();

            return userName;
        } else {
            System.out.println("Please try again");
            return "";  
        }
    }

    public String checkLogin() {
        System.out.println("Username: ");
        String userName = input.nextLine();

        System.out.println("Password: ");
        String password = input.nextLine();

        boolean userCheck = login.checkLogin(userName, password);
        if (userCheck) {
            return userName;
        } else {
            return "Nice try.  Try again.";
        }
    }

    public void userDashBoard(String userName, Main main) {
        System.out.println("Welcome "+ userName + ", please enter a number:");
        System.out.println("1. View my updates");
        System.out.println("2. View buddies");
        System.out.println("3. Change my updates");
        System.out.println("4. Delete my updates");
        System.out.println("5. Add buddies");
        System.out.println("6. Delete buddies");
        System.out.println("7. Logout");

        String option = input.nextLine();

        if (option.equals("1")) {
            // print all user's updates
            ArrayList<String> updates = userData.updateData(userName);
            System.out.println(updates);

            System.out.println("");

            main.userDashBoard(userName, main);
        }else if(option.equals("2")) {
            // print all user's buddies
            ArrayList<String> friends = userData.viewBuddies(userName);
            System.out.println(friends);

            System.out.println("");
            main.userDashBoard(userName, main);
        } else if (option.equals("5")) {
            ArrayList<String> friends = userData.viewBuddies(userName);
            System.out.println(friends);

        }
    }
    
    public String makeAccount() {
        // make a new user and add to userData
        Login login = new Login();
        System.out.println("What is your Name: ");
        String name = input.nextLine();

        System.out.println("What do you want for a UserName: ");
        String userName = input.nextLine();
        return "";
    }

    public static void main(String[] args) {
        Main main = new Main();
        String getUserName = main.welcomeMessage();
        if (!getUserName.isBlank()) {
            main.userDashBoard(getUserName, main);
        }
    }
}