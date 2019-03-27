package hello.services;

import hello.model.Movie;
import hello.model.User;
import hello.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Optional;

@Service
@EntityScan
public class UserService {

    @Autowired
    UserRepository userRepository;

    public Collection<User> getAll(){
        return userRepository.findAll();
    }

    public void addUser(User user){
        userRepository.save(user);
    }

    public User getUserByName(String name){
        return userRepository.findByName(name);
    }

    public void save(User user){
        userRepository.save(user);
    }

}
