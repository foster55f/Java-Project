import java.util.ArrayList;

public class User {
    // This class will update the user info based on the current user
    String myUserName;
    String myName;

    ArrayList<String> friends;
    ArrayList<String> updates;

    User(String userName, String name, ArrayList<String> myFriends, ArrayList<String> myUpdates) {
        myUserName = userName;
        myName = name;
        friends = myFriends;
        updates = myUpdates; 
    }
    public static void main(String[] args) {
        
    }
} 