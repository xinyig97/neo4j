package hello.model;


import org.neo4j.ogm.annotation.*;


@RelationshipEntity(type = "RATED")
public class RatingRelationship {

    @GraphId
    private Long relationshipId;

    @Property Integer rating;

    public Movie getMovie() {
        return movie;
    }

    public User getUser() {
        return user;
    }

    public RatingRelationship() {
    }

    @StartNode
    private Movie movie;
    @EndNode
    private User user;

    public RatingRelationship(User user, Movie movie, String s) {
        this.rating = Integer.parseInt(s);
        this.movie = movie;
        this.user = user;
    }
}
