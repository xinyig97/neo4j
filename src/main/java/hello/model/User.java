package hello.model;


import org.neo4j.ogm.annotation.GraphId;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;

import java.util.List;

@NodeEntity
public class User {

    @GraphId
    private Long id;
    private String name;
    private String age;

    @Relationship(type = "RATED",direction = Relationship.INCOMING)
    private List<Movie> movies;

    public User() {
    }

    public List<Movie> getMovies() {
        return movies;
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
}
