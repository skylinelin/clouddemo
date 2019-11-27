package cn.itcast.client;

import cn.itcast.pojo.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(value = "user-service",fallback = UserClientImpl.class )
public interface UserClient {

    @GetMapping("/user/{id}")
    String queryById(@PathVariable("id") Integer id);
}
