package Interfaces;

/**
 * @author Armand Riviere
 */
public interface IUser {
    
    /*
    Reads the db,
    Checks the db in order to find duplicates
    add the new user to the db.
    */
    public void addUser();
    
    /*
      Withraws and edits selected id from user
    */
    public void editUser();
    
    /*Deletes user from db*/
    public void deleteUser();
    
    /*searches user*/
    public int searchUser();
    
    //Returns id fron user
    public void readUser();
}
