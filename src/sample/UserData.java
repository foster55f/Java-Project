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

        friend2 = new ArrayList<String>();
        friend2.add("Amy");

        update1 = new ArrayList<String>();
        update1.add("Hello my friends!");
        update1.add("Whats going on my friends?");
        update1.add("Awfully quiet my friends!");

        update2 = new ArrayList<String>();
        update2.add("Where are my friends?");
        update2.add("I miss my friends!");

        update3 = new ArrayList<String>();
        update3.add("Want to go to the movies?");
        update3.add("Whats the deal with homework? You're not working on your home!");

        user1 = new User("fosterthepeople", "foster", friend1, update1);
        user2 = new User("auroraisthebest", "aurora", friend2, update2);
        user3 = new User("steve", "xman", friend1, update3);

        userData.add(user1);
        userData.add(user2);
        userData.add(user3);
    }

    public ArrayList<String> displayUpdates(String userName) {
        User currentUser;
        for (User user : userData) {
            if (user.myUserName.equals(userName)) {
                currentUser = user;
                return currentUser.updates;
            }
        }
        return new ArrayList<String>();
    }

    public ArrayList<String> changeUpdates(String userName, String index, String newUpdate) {
        User currentUser;
        for (User user : userData) {
            if (user.myUserName.equals(userName)) {
                currentUser = user;
                int integerIndex = Integer.parseInt(index);
                currentUser.updates.set(integerIndex, newUpdate);
            }
        }
        return new ArrayList<String>();
    }

    public ArrayList<String> removeUpdate(String userName, String index) {
        User currentUser;
        for (User user : userData) {
            if (user.myUserName.equals(userName)) {
                currentUser = user;
                int integerIndex = Integer.parseInt(index);
                currentUser.updates.remove(integerIndex);
            }
        }
        return new ArrayList<String>();
    }

    public ArrayList<String> viewBuddies(String userName) {
        User currentUser;
        for (User user : userData) {
            if (user.myUserName.equals(userName)) {
                currentUser = user;
                return currentUser.friends;
            }
        }
        return new ArrayList<String>();
    }

    public void addBuddies(String userName, String newFriend) {
        User currentUser;
        for (User user : userData) {
            if (user.myUserName.equals(userName)) {
                currentUser = user;
                currentUser.friends.add(newFriend);
            }
          }
        }
        public ArrayList<String> removeBuddy(String userName, String index) {
            User currentUser;
        for (User user : userData) {
            if (user.myUserName.equals(userName)) {
                currentUser = user;
                int integerIndex = Integer.parseInt(index);
                currentUser.friends.remove(integerIndex);
            }
        }
        return new ArrayList<String>();        
    }






    public static void main(String[] args) {
        
    }
} 