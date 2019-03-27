package hello.repository;


import hello.model.User;
import org.springframework.data.neo4j.repository.Neo4jRepository;

import java.util.Collection;

public interface UserRepository extends Neo4jRepository<User,Long> {

    Collection<User> findAll();

    User findByName(String name);

}
