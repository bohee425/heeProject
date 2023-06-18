package com.hee.test.vo;

import java.sql.*;

import lombok.*;

/*
CREATE TABLE restaurant (
	res_idx INT AUTO_INCREMENT PRIMARY KEY,
	res_brn VARCHAR(12) NOT NULL COMMENT '사업자등록번호',
	res_name VARCHAR(100) NOT NULL COMMENT '가게명',
	res_tel VARCHAR(13) NOT NULL COMMENT '전화번호',
	res_postcode int NOT NULL COMMENT '우편번호',
	res_address VARCHAR(100) NOT NULL COMMENT '주소',
	res_detailAddress VARCHAR(50) COMMENT '상세주소',
	res_open time NOT NULL COMMENT '영업시작시간',
	res_close time NOT NULL COMMENT '영업종료시간',
	res_breakstart time COMMENT '브레이크타임시작시간',
	res_breakend time COMMENT '브레이크타임종료시간',
	res_holiday VARCHAR(3) NOT NULL COMMENT '휴무일',
	res_amenity VARCHAR(50) COMMENT '편의시설',
	res_photo VARCHAR(50) COMMENT '가게사진',
	res_intro VARCHAR(100) NOT NULL COMMENT '가게소개글'
);

*/
@Data
public class RestaurantVO {
	private int res_idx;
	private String res_brn;
	private String res_name;
	private String res_tel;
	private String res_postcode;
	private String res_address;
	private String res_detailAddress;
	private String res_open;
	private String res_close;
	private String res_breakstart;
	private String res_breakend;
	private String res_holiday;
	private String res_amenity;
	private String res_photo;
	private String res_intro;
	
	
}
