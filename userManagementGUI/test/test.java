
import Controller.UserJpaController;
import Entities.User;


public class test {
    
    private static UserJpaController uc = new UserJpaController();
    
    public static void main(String[] args) {
        User u = new User( "Juan", "contra");
        try{
            uc.create(u);
            System.out.print(uc.findUserEntities().toString());
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}


/*Test for the DB:

INSERT INTO test."user"("userName", "password") VALUES('Mac', 'pass');
SELECT * FROM test."user"

*/