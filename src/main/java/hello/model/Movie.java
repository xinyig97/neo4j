package hello.model;


import org.neo4j.ogm.annotation.GraphId;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Property;
import org.neo4j.ogm.annotation.Relationship;

import java.util.HashSet;
import java.util.Set;


@NodeEntity
public class Movie {

    @GraphId
    private Long id;

    @Property(name = "title")
    private String title;

    @Property(name = "director")
    private String director;

    @Relationship(type = "RATED", direction =  Relationship.OUTGOING)
    private Set<RatingRelationship> ratingRelationshipSet = new HashSet<>();

    public Movie() {

    }
    public void addRel(RatingRelationship ratingRelationship){
        ratingRelationshipSet.add(ratingRelationship);
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDirector() {
        return director;
    }
}
