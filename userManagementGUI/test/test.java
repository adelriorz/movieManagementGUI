
import Controller.UserEntity;
import Controller.UserEntityJpaController;


public class test {
    
    private static UserEntityJpaController uc;
    
    public static void main(String[] args) {
        UserEntity u;
        uc.create(new UserEntity("Juan", "contra"));
        System.out.print(uc.getUserEntityCount());
    }
}


/*Test for the DB:

INSERT INTO test."user"("userName", "password") VALUES('Mac', 'pass');
SELECT * FROM test."user"

*/