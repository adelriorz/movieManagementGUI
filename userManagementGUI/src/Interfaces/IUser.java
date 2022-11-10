package Interfaces;

/**
 * @author Armand Riviere
 */
public class IUser {
    
    
    public void addUser(){
        /*
        Reads the db,
        Checks the db in order to find duplicates
        add the new user to the db.
        */
        try{
            //User user = new User("Armando", "123");
            
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public void editUser(){
        /*
        Withraws selected id from user
        */
    }
    
    public void deleteUser(){
        /*
        Deletes user from given id
        */
    }
    
    public void readUser(){
        /*
        Reads and sets the whole db information into the table
        */
    }
    
}
