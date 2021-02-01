package com.kp.cache.daodaoImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.kp.cache.dao.CacheDao;

@Repository
public class CacheDaoImpl implements CacheDao {

	
	
	@Override
	public  List<String> getUser() throws Exception {
		
		System.out.println("Fetching Data from Database");
		List<String> users = new ArrayList<String>();
		
		users.add("Kumar");
		users.add("John");
		users.add("Mia");
		users.add("Sunny");
		users.add("Rock");
		users.add("RKO");
		users.add("Modi");
		users.add("Tesla");
		users.add("Pulsar");
		users.add("Nokia");
		users.add("facebook");
		
		
		return users;
		
		
	}

	
}
