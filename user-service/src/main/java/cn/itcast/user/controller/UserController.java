package cn.itcast.user.controller;

import cn.itcast.user.pojo.User;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {



    @GetMapping("/{id}")
    public User hello(@PathVariable("id") Integer id){
        return new User();
    }

}
