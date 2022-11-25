package Entities;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.10.v20211216-rNA", date="2022-11-24T22:16:57")
@StaticMetamodel(Movie.class)
public class Movie_ { 

    public static volatile SingularAttribute<Movie, String> movieDirector;
    public static volatile SingularAttribute<Movie, String> movieProducer;
    public static volatile SingularAttribute<Movie, Boolean> movieStatus;
    public static volatile SingularAttribute<Movie, String> movieClassification;
    public static volatile SingularAttribute<Movie, String> movieGenre;
    public static volatile SingularAttribute<Movie, Integer> movieId;
    public static volatile SingularAttribute<Movie, Integer> movieDuration;
    public static volatile SingularAttribute<Movie, String> movieName;

}