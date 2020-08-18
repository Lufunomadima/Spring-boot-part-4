package com.funie.springboot4.api;


import com.funie.springboot4.model.User;
import com.funie.springboot4.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.NonNull;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/api/v1/user")
@RestController
public class UserController {
    private final UserService userService;
    // home page that you see on the root
    @GetMapping("/")
    public String home(){
        return "Welcome To The Home";
    }

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    // expose end points for the client to consume
    @PostMapping
    public void addUSer(@NonNull @RequestBody User user){
        userService.addUser(user.getId(), user.getName(), user.getSurname());
    }
    @RequestMapping(path = "/{id}", method = RequestMethod.DELETE)
    public void remove(@PathVariable("id") long id) {
        userService.remove(id);
    }
    @GetMapping(path = "/{id}")
    public User getUser(@PathVariable("id") long id){
        return userService.getUser(id);
    }
}
