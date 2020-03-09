import java.util.Scanner;

public class Main {
    Scanner input;
    UserData userData;
    User currentUser;
    Login login;

    Main() {
        input = new Scanner(System.in);
    }

    public String welcomeMessage() {
        System.out.println("Welcome to Foster a Post!  You can login or Sign Up!");
        // Main main = new Main();
        return "Foster";
    }

    public void userDashBoard(String userName, Main main) {
        System.out.println("Welcome!!");
    }
    public static void main(String[] args) {
        Main main = new Main();
        String getUserName = main.welcomeMessage();
        if (!getUserName.isBlank()) {
            main.userDashBoard(getUserName, main);
        }
    }
}