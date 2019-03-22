package hello.repository;


import hello.model.User;
import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.Neo4jRepository;

import java.util.Collection;

public interface UserRepository extends Neo4jRepository<User,Long> {


    @Query("MATCH (n:User)<-[r:RATED]-(m:Movie) RETURN n,r,m")
    Collection<User> getAllUsers();

}
