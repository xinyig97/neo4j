package hello.repository;

import hello.model.Movie;
import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.Neo4jRepository;

import java.util.Collection;

public interface MovieRepository extends Neo4jRepository<Movie,Long> {

    @Query("MATCH (m:Movie) RETURN m")
    Collection<Movie> getAllMovies();
}
