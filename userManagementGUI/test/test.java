
import Controller.MovieJpaController;
import Entities.Movie;


public class test {
    
    public static void main(String[] args) {
        MovieJpaController mc = new MovieJpaController();
        Movie m = new Movie();
        try{
//            m.setMovieName("Lilo");
//            m.setMovieProducer("Leonardo Di Caprio");
//            m.setMovieDirector("Leo Di Caprio");
//            m.setMovieClassification("B15");
//            m.setMovieGenre("Terror");
//            m.setMovieDuration(125);
//            m.setMovieStatus(false);
//            mc.create(m);
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