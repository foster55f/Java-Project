
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
        System.out.println("Welcome to your BuddyWall!  Enter 1 or 2");
        System.out.println("1:Login");
        System.out.println("2:Sign Up");
        

        Main main = new Main();
        String option = input.nextLine().toLowerCase();
        if (option.equals("1")) {
            String userName = main.checkLogin();
            if (userName.equals("Nice try.  Try again.")) {
                return "";
            }
            return userName;
        } else if (option.equals("2")) {
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
        System.out.println("3. Change my updates to buddies");
        System.out.println("4. Delete my updates to buddies");
        System.out.println("5. Add buddies");
        System.out.println("6. Delete buddies");
        System.out.println("7. Logout");

        String option = input.nextLine();

        if (option.equals("1")) {
            // print all user's updates
            ArrayList<String> updates = userData.displayUpdates(userName);
            System.out.println("");
            System.out.println("Updates:");
            updates.forEach(update -> {
                System.out.println(update);
            });

            System.out.println("");
            System.out.println("Enter 8 to return to dashboard:");
            String insideOption = input.nextLine();

            if (insideOption.equals("8")) {        
                main.userDashBoard(userName, main);
            }
        } else if (option.equals("2")) {
            // print all user's buddies
            ArrayList<String> friends = userData.viewBuddies(userName);
            System.out.println("");
            System.out.println("Buddy List:");
            friends.forEach(friend -> {
                System.out.println(friend);
            });

            System.out.println("");
            System.out.println("Enter 8 to return to dashboard:");
            String insideOption = input.nextLine();

            if (insideOption.equals("8")) {        
                main.userDashBoard(userName, main);
            }
        } else if (option.equals("3")) {
            ArrayList<String> updates = userData.displayUpdates(userName);
            System.out.println("");
            System.out.println("Here are your current updates to friends:");
            System.out.println("");
            updates.forEach(update -> {
                int index = updates.indexOf(update);
                System.out.println(String.format(index + ": " + update));
            });

            System.out.println("");
            System.out.println("Enter number of update you want to change: ");
            String enteredNumber = input.nextLine();
            System.out.println("Enter your new update: ");
            String newUpdate = input.nextLine();
            userData.changeUpdates(userName, enteredNumber, newUpdate);

            System.out.println("");
            System.out.println("New Updates:");
            updates.forEach(update -> {
                int index = updates.indexOf(update);
                System.out.println(String.format(index + ": " + update));
            });
            System.out.println("");
            System.out.println("Enter 8 to return to dashboard:");
            String insideOption = input.nextLine();

            if (insideOption.equals("8")) {        
                main.userDashBoard(userName, main);
            }

        }   else if(option.equals("4")){
            ArrayList<String> updates = userData.displayUpdates(userName);
            System.out.println("");
            System.out.println("Here are your current updates to friends:");
            System.out.println("");
            updates.forEach(update -> {
                int index = updates.indexOf(update);
                System.out.println(String.format(index + ": " + update));
            });
            
            System.out.println("");
            System.out.println("Enter number of update you want to remove: ");
            String enteredNumber = input.nextLine();

            userData.removeUpdate(userName, enteredNumber);

            System.out.println("");
            System.out.println("New Updates:");
            updates.forEach(update -> {
                int index = updates.indexOf(update);
                System.out.println(String.format(index + ": " + update));
            });
            System.out.println("");
            System.out.println("Enter 8 to return to dashboard:");
            String insideOption = input.nextLine();

            if (insideOption.equals("8")) {        
                main.userDashBoard(userName, main);
            }

        } else if (option.equals("5")) {
            ArrayList<String> friends = userData.viewBuddies(userName);
            friends.forEach(friend -> {
                System.out.println(friend);
            });
            System.out.println("What is name of buddy that you want to add to your buddies?");
            String newFriend = input.nextLine();

            userData.addBuddies(userName, newFriend);

            // display new friends list
            ArrayList<String> newFriends = userData.viewBuddies(userName);
            System.out.println("");
            System.out.println("Buddy List:");
            newFriends.forEach(friend -> {
                System.out.println(friend);
            });

            System.out.println("");
            System.out.println("Enter 8 to return to dashboard:");
            String insideOption = input.nextLine();

            if (insideOption.equals("8")) {        
                main.userDashBoard(userName, main);
            }
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