package com.hee.test.vo;

import lombok.*;

/*
CREATE TABLE menu (
	menu_idx INT AUTO_INCREMENT PRIMARY key 
	menu_name VARCHAR(50) NOT NULL COMMENT '메뉴명',
	menu_price INT NOT null COMMENT '메뉴가격',
	menu_intro VARCHAR(100) NOT NULL COMMENT '메뉴소개',
	menu_photo VARCHAR(50) COMMENT '메뉴사진'
);
 */

@Data
public class MenuVO {
	private int menu_idx;
	private String menu_name;
	private int menu_price;
	private String menu_intro;
	private String menu_photo;
	
	
}
