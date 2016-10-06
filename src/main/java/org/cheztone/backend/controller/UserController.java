package org.cheztone.backend.controller;

import org.cheztone.backend.model.User;
import org.cheztone.backend.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

/**
 * This rest controller is used to create update and read user information.
 */
@RestController
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping(path = "user/{id}",method = RequestMethod.GET)
    @ResponseBody
    public User getUser(@PathVariable String id){
        return userService.get(id);
    }

    @RequestMapping(path = "user",method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void saveUser(@RequestBody User user){
        userService.save(user);
    }

}
