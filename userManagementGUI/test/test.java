
import Controller.MovieJpaController;
import Entities.Movie;


public class test {
    
    public static void main(String[] args) {
        MovieJpaController mc = new MovieJpaController();
        Movie m = new Movie();
        try{
            m.setMovieName("a");
            m.setMovieProducer("b");
            m.setMovieDirector("a");
            m.setMovieClassification("A");
            m.setMovieGenre("Terror");
            m.setMovieDuration(1);
            m.setMovieStatus(false);
            mc.edit(m);
            System.out.print(mc.findMovieEntities());
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}


/*Test for the DB:

INSERT INTO test."user"("userName", "password") VALUES('Mac', 'pass');
SELECT * FROM test."user"

*/