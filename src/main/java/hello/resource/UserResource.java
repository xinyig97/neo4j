package hello.resource;

import hello.model.User;
import hello.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.Optional;

@EntityScan
@RestController
@RequestMapping("/rest/neo4j/user")
public class UserResource {

    @Autowired
    UserService userService;

//    @GetMapping
//    public Collection<User> getAll(){
//        return userService.getAll();
//    }

    @PostMapping("/addUser")
    public String addUser(@RequestBody User user){
        userService.addUser(user);
        return "added?";
    }

    @GetMapping("/getUser/{name}")
    public User getUserByName(@PathVariable("name") String name){
        return userService.getUserByName(name);

    }

    @GetMapping("/getUsers")
    public Collection<User> getAllUsers(){
        return userService.getAll();
    }

}
