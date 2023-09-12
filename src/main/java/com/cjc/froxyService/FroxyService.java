package com.cjc.froxyService;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.cjc.dto.Department;



@FeignClient(name = "department-server")
public interface FroxyService {

	         @GetMapping("/department/{did}")
			public Department singleRecord(@PathVariable int did);
}
