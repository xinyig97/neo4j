package hello.resource;

import hello.model.User;
import hello.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/rest/neo4j/user")
public class UserResource {

    @Autowired
    UserService userService;

    @GetMapping
    public Collection<User> getAll(){
        return userService.getAll();
    }

    @PostMapping("/addUser")
    public String addUser(@RequestBody User user){
        userService.addUser(user);
        return "added?";
    }

}
