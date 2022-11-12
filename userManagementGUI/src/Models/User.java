package Models;

/**
 * @author Armand Riviere
 */
public class User {

    private int userId;
    private String userName;
    private String userPassword;
    
    public User(java.lang.String userName, java.lang.String userPassword) {
        this.userName = userName;
        this.userPassword = userPassword;
    }
    
    public User(int userId, String userName, String userPassword){
        this.userId = userId;
        this.userName = userName;
        this.userPassword = userPassword;
    }
    
    public User(User user){
        user = new User(userId, userName, userPassword);
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }
    
    @Override
    public String toString() {
        return "User{" + "userId=" + userId + ", userName=" + userName + ", userPassword=" + userPassword + '}';
    }
    
}
