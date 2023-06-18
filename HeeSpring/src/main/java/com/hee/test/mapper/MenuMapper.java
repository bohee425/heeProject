package com.hee.test.mapper;

import org.apache.ibatis.annotations.*;

import com.hee.test.vo.*;

@Mapper
public interface MenuMapper {

	int insertMenu(MenuVO menu);

}
