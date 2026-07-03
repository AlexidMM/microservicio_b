package com.uteq.mx.microservicio_b.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.uteq.mx.microservicio_b.dto.EntityADto;

@FeignClient(name = "ms-Alejandro")
public interface ClientFeignMSA {
    @PostMapping("/api/entity-a/by-ids")
    public List<EntityADto> obtenerDTOsDelMSA(@RequestBody List<Integer> ids);
    
}
 