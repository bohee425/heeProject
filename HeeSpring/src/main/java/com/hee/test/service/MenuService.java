package com.hee.test.service;

import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;

import com.hee.test.mapper.*;
import com.hee.test.vo.*;

@Service
public class MenuService {
	@Autowired
	private MenuMapper mapper;

	public int registMenu(MenuVO menu) {
		return mapper.insertMenu(menu);
	}

}
