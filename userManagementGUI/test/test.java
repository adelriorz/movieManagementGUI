
import Controller.MovieJpaController;
import Entities.Movie;
import java.util.Arrays;


public class test {
    
    public static void main(String[] args) {
        MovieJpaController mc = new MovieJpaController();
        Movie m = new Movie();
        try{
            m.setMovieId(15);
            m.setMovieName("TEST PASSED!");
            m.setMovieProducer("TESTER");
            m.setMovieDirector("TESTER");
            m.setMovieClassification("D");
            m.setMovieGenre("Sci-Fy");
            m.setMovieDuration(1);
            m.setMovieStatus(false);
            
            //mc.create(m);
            
            mc.edit(m);
            
            //mc.destroy(11);
            
            System.out.print(Arrays.toString(mc.findMovieEntities().toArray()));
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}


/*Test for the DB:

INSERT INTO test."user"("userName", "password") VALUES('Mac', 'pass');
SELECT * FROM test."user"

*/