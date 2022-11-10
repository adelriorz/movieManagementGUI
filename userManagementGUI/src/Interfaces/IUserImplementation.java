package Interfaces;

/**
 * @author Armand Riviere
 */
public class IUserImplementation implements IUser{
    
    
    public void addUser(){
        try{
            //User user = new User("Armando", "123");
            
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public void editUser(){
        
    }
    
    public void deleteUser(){
    }
    
    public void readUser(){
        
    }

    @Override
    public int searchUser() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
