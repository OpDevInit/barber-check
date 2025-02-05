package com.opokaynow.barber_admin.repository;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import com.opokaynow.barber_admin.entity.Client;

@FeignClient(name = "barber-client", url = "http://localhost:8080")
public interface FeignRepository {

   @GetMapping(path = "/client")
   List<Client> getAllClient();

}
