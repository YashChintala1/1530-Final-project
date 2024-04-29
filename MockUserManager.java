//Make a mock for user mangement and 
public class MockUserManager{
    //define user and map
    private static User currentUser;
    private static final Map<String, User> mockUsers = new HashMap<>();

    static{
        // making some dummy users with fixed passwords and user types
        mockUsers.put("user", new User("user", "password", "USER")); //user 
        mockUsers.put("admin", new User("admin", "password", "ADMIN")); //Admin
    }

    public static boolean loginUser(String username, String password){
        if (mockUsers.containsKey(username) && mockUsers.get(username).getPassword().equals(password)){
            currentUser=mockUsers.get(username); //fetch the user
            return true;
        }
        return false;
    }

    // A method to switch between users for testing purposes
    public static void switchUser(String userType){
        currentUser=mockUsers.get(userType);
    }

    // another helper method to get the current user, if not then default to guest.
    public static String getCurrentUserType(){
        return currentUser!=null ? currentUser.getType():"GUEST";
    }
}

