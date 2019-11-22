package cn.itcast.controller;

import cn.itcast.client.UserClient;
import com.netflix.hystrix.contrib.javanica.annotation.DefaultProperties;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/get")
//@DefaultProperties(defaultFallback = "shibai")
public class UserGetController {
//    @Autowired
//    protected RestTemplate restTemplate;
//    @Autowired
//    private DiscoveryClient discoveryClient;
    @Autowired
    private UserClient userClient;

    /**
     * 降级逻辑编写
     */
    @GetMapping("/{id}")
   // @HystrixCommand(fallbackMethod="shibai")
    //@HystrixCommand
    public String querById(@PathVariable("id") Integer id){
//        String url = "http://user-service/user/"+id;
//        System.out.println(url);
//        String user = restTemplate.getForObject(url,String.class);

        return userClient.queryById(id);
    }

//    public String shibai(){
//        return "服务器正忙";
//    }

   /* @GetMapping("/{id}")
    public User queryById(@PathVariable("id") Integer id){
//        //根据服务id获取实例
//        List<ServiceInstance> instances = discoveryClient.getInstances("user-service");
//        ServiceInstance instance = instances.get(0);
//        String url = "http://"+instance.getHost()+":"+instance.getPort()+"/user/"+id;
        String url = "http://user-service/user/"+id;
        System.out.println(url);
        User user = restTemplate.getForObject(url,User.class);
        return user;
    }*/
}
