import java.util.ArrayList;

public class UserData {
    // This class will hold all data related to user actions
    ArrayList<User> userData;
    ArrayList<String> friend1;
    ArrayList<String> friend2;
    ArrayList<String> update1;
    ArrayList<String> update2;
    ArrayList<String> update3;
    User user1;
    User user2;
    User user3;

    UserData() {
        userData = new ArrayList<User>();

        friend1 = new ArrayList<String>();
        friend1.add("Dave");
        friend1.add("Daniel");

        update1 = new ArrayList<String>();
        update1.add("Hello my friends!");
        update1.add("Whats going on my friends!");
        update1.add("Awfully quiet my friends!");

        
    }






    public static void main(String[] args) {
        
    }
} 