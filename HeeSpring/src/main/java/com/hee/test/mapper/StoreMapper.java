package com.hee.test.mapper;

import org.apache.ibatis.annotations.*;

import com.hee.test.vo.*;

@Mapper
public interface StoreMapper {

	int insertStore(RestaurantVO restaurant);

}