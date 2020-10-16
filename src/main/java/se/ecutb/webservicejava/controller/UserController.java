package se.ecutb.webservicejava.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import se.ecutb.webservicejava.entities.User;
import se.ecutb.webservicejava.services.UserService;

import java.util.List;

// @Controller // MVC med statiska html sidor
@RestController // REST API Endpoints
@RequestMapping("/api/users")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping
    public List<User> findAllUsers(){
        return userService.findAll();
    }

    @GetMapping("/{id}")
    public User findUserById(@PathVariable String id){
        return userService.findById(id);
    }

    @PostMapping
    public User saveUser(@RequestBody User user){
        return userService.save(user);
    }

    @PutMapping("/{id}")
    public void updateUser(@PathVariable String id, @RequestBody User user){
        userService.update(id,user);
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable String id){
        userService.delete(id);
    }


}
