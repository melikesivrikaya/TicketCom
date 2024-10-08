package com.melikesivrikaya.gatewayservice.client.user;

import com.melikesivrikaya.gatewayservice.model.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@FeignClient(value = "user-service", url = "localhost:1012/api/v1/users/")
public interface UserClient {

    @GetMapping("{username}")
    User findByUsername(@PathVariable String username);
}
