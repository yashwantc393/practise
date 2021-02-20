package com.yash.yashwant.first;

import org.springframework.web.bind.annotation.*;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.HashMap;

@RestController
public class FirstController {


    @GetMapping("/test")
    public String test1() {
        return "HEY!!";
    }

    @GetMapping("/test2")
    public String test1111() {
        return "HEY---------!!";
    }

    @GetMapping("/myadd/{a}/{b}")
    public int myAdd(@PathVariable int a, @PathVariable int b) {
        return a+b;
    }

    @GetMapping("/myminus/{a}/{b}")
    public int minus(@PathVariable int a, @PathVariable int b){
        return a-b;
    }

    private HashMap<Integer, UserRequest> map = new HashMap<>();
    @PostMapping("/create/user")
    public String createUser(@RequestBody UserRequest user){
        System.out.println("User Request" + user);
        // some operations.....
        map.put(user.getId(), user);
        return "received successfully";
    }
    @GetMapping("/user/{id}")
    public UserRequest getUser(@PathVariable int id){
        System.out.println("User Request Get received for Id" + id);
        // some operations.....
        return map.get(id);

    }
    @GetMapping("/users")
    public HashMap<Integer, UserRequest> getallUsers(){
        System.out.println("User Request Get received");
        // some operations.....
        return map;

    }

}
