package cn.itcast.client;

import org.springframework.context.annotation.Configuration;

/**
 * 熔断接口
 */
@Configuration
public class UserClientImpl implements UserClient {
    @Override
    public String queryById(Integer id) {
        return "熔断接口实现";
    }
}
