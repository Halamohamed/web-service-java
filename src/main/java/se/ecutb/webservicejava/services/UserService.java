package se.ecutb.webservicejava.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import se.ecutb.webservicejava.entities.User;
import se.ecutb.webservicejava.repositories.UserRepository;

import java.util.List;

/**
 * C - Create
 * R - Read
 * U - Update
 * D - Delete
 */
@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public List<User> findAll(){
        return userRepository.findAll();
    }
    public User findById(String id){
        return userRepository.findById(id).orElseThrow(RuntimeException::new);// () -> new RuntimeException
    }

    public User save(User user){
        return userRepository.save(user);
    }

    public void update(String id, User user){
        if(!userRepository.existsById(id)){
           throw new RuntimeException();
        }
        user.setId(id);
        userRepository.save(user);
    }

    public void delete(String id){
        if(!userRepository.existsById(id)){
            throw new RuntimeException();
        }
        userRepository.deleteById(id);
    }

}
