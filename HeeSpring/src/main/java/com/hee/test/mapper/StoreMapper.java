package com.hee.test.mapper;

import java.util.*;

import org.apache.ibatis.annotations.*;

import com.hee.test.vo.*;

@Mapper
public interface StoreMapper {

	int insertStore(RestaurantVO restaurant);

	List<RestaurantVO> selectRestaurantList();

	RestaurantVO selectRestaurant(String res_brn);

	int updateRestaurant(RestaurantVO restaurant);

}
