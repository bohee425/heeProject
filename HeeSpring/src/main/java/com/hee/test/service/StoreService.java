package com.hee.test.service;

import java.util.*;

import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;

import com.hee.test.mapper.*;
import com.hee.test.vo.*;

@Service
public class StoreService {
	
	@Autowired
	private StoreMapper mapper;
	public int registStore(RestaurantVO restaurant) {
		return mapper.insertStore(restaurant);
	}
	public List<RestaurantVO> getRestaurantList() {
		return mapper.selectRestaurantList();
	}

}
