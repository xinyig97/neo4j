package hello.services;

import hello.model.User;
import hello.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public Collection<User> getAll(){
        return userRepository.getAllUsers();
    }

    public void addUser(User user){
        userRepository.save(user);
    }

}
