package com.kp.cache.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.kp.cache.dao.CacheDao;
import com.kp.cache.service.CacheService;

@Service
public class CacheServiceImpl implements CacheService {

	@Autowired
	CacheDao cacheDao;
	
	
	@Cacheable("users")
	@Override
	public List<String> getUser() throws Exception {
		System.out.println("Fetching from Service");
		return cacheDao.getUser();
	}

}
