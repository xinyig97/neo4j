package hello.model;


import org.neo4j.ogm.annotation.*;

import java.rmi.MarshalledObject;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@NodeEntity
public class User {

    @GraphId
    private Long id;

    @Property(name = "name")
    private String name;

    @Property(name = "age")
    private String age;

    @Relationship(type = "RATED", direction =  Relationship.INCOMING)
    private Set<RatingRelationship> movies = new HashSet<>();

    @Labels
    private List<String> labels = new ArrayList<>();

    public User() {
    }

    public void setRatingMovie(Movie movie){
        final RatingRelationship ratingRelationship = new RatingRelationship(this,movie,"1");
        movies.add(ratingRelationship);
        movie.addRel(ratingRelationship);
        System.out.println("hello????????");
//        this.movies.add(movie);
//        System.out.println(movies.isEmpty());
    }

    public Long getId() {
        return id;
    }


    public String getName() {
        return name;
    }


    public String getAge() {
        return age;
    }
    public Set<Movie> getMovies(){
        Set<Movie> movie_set = new HashSet<>();
        for(RatingRelationship r : movies){
            movie_set.add(r.getMovie());
        }
        return movie_set;
    }
}
