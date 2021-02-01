package com.kp.cache.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kp.cache.service.CacheService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
public class CacheController {

	@Autowired
	CacheService cacheService;
	
	@ApiOperation(value = "This API Return retun the same id which is passed",response = ArrayList.class)
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "Sucess"),
			@ApiResponse(code = 401, message = "401"),
			@ApiResponse(code = 403, message = "403"),
			@ApiResponse(code = 400, message = "404")
	})
	@GetMapping("/get/users")
		public List<String> getUser() throws Exception{
			
			System.out.println("Fetching Controller");
			return cacheService.getUser();
		}
	
}
