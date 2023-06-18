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
	// 가게 목록 조회
	public List<RestaurantVO> getRestaurantList() {
		return mapper.selectRestaurantList();
	}
	// 가게 수정
	public RestaurantVO getRestaurantInfo(String res_brn) {
		return mapper.selectRestaurant(res_brn);
	}
	public int ModifyRestaurant(RestaurantVO restaurant) {
		return mapper.updateRestaurant(restaurant);
	}

}
