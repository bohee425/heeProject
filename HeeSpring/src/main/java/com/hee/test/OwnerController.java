package com.hee.test;

import java.util.*;

import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.*;
import org.springframework.web.bind.annotation.*;

import com.hee.test.service.*;
import com.hee.test.vo.*;

@Controller
public class OwnerController {
	
	@Autowired
	private StoreService service;
	private MenuService menuService;
	
	//owner의 예약관리 페이지 이동 Mapping
	@GetMapping("StoreReservation")
	public String StoreReservation() {
		return "owner/store_Reservation";
	}
	
	//owner의 예약관리 페이지 이동 Post 방식 Mapping
	@PostMapping("StoreReservation")
	public String StoreReservationPost() {
		return "owner/store_Reservation";
	}
	
	//owner의 리뷰관리및 편집 페이지 이동 Mapping
	@GetMapping("StoreReservationEdit")
	public String StoreReservationEdit() {
		return "owner/store_ReservationEdit";
	}
	
	//owner의 매출관리 페이지 이동 Mapping
	@GetMapping("StoreSales")
	public String StoreSales() {
		return "owner/store_Sales";
	}
	
	//owner의 매출관리및 편집 페이지 이동 Mapping
	@GetMapping("StoreSalesinOut")
	public String StoreSalesinOut() {
		return "owner/store_SalesinOut";
	}
	

	
	//owner의 식당마이페이지에서 수정후 이동 Mapping
	@PostMapping("StoreMypagePro")
	public String StoreMypagePro() {
		return "owner/store_List";
	}
	
	//owner의 점주마이페이지로 이동 Mapping
	@GetMapping("CeoMypage")
	public String CeoMypage() {
		return "owner/ceo_Mypage";
	}
	
	//owner의 점주마이페이지에서 수정후 이동 Mapping
	@PostMapping("CeoMypagePro")
	public String CeoMypagePro() {
		return "owner/ceo_Mypage";
	}
	
	//owner의 점주회원탈퇴 페이지로 이동 Mapping
	@GetMapping("CeoMypageDelete")
	public String CeoMypageDelete() {
		return "owner/ceo_MypageDelete";
	}
	
	//owner의 점주회원탈퇴 입력 정보 가지고 이동 Mapping
	@PostMapping("CeoMypageDeletePro")
	public String CeoMypageDeletePro() {
		return "main";
	}
	
	//owner의 점주정보 페이지로 이동 Mapping
	@PostMapping("ceoMypageInfo")
	public String ceoMypageInfo() {
		return "owner/ceo_Info";
	}
	
	// 그래프
	@GetMapping("storeSalesGraph")
	public String storeSalesGraph(){
		return "owner/store_SalesGraph";
	}
	
	
	// 가게 관련
	//owner의 식당추가로 이동 Mapping
	@GetMapping("StoreInsertPage")
	public String StoreInsertPage() {
		return "owner/store_InsertPage";
	}

	// 가게 추가 클릭시 가게등록 작업
	@PostMapping("storeInsertPro")
	public String storeInsertPro(RestaurantVO restaurant, Model model) {
		System.out.println(restaurant);
		
		int insertCount = service.registStore(restaurant);
		
		// 성공시 storeInsertSucess 리다이렉트 
		// 실패시 fail_back.jsp 가게등록 실패 출력
		if(insertCount > 0) {
			
			return "redirect:/storeInsertSucess";
		} else {
			
			model.addAttribute("msg", "가게 등록 실패!");
			return "fail_back";
		}
	}
	
	// 가게 등록 성공시 StoreList로 리다이렉트
	@GetMapping("storeInsertSucess")
	public String storeInsertSucess() {
		return "redirect:/StoreList";
	}
	
	//owner의 식당리스트로 이동 Mapping
	// 가게 목록 조회
	@GetMapping("StoreList")
	public String StoreList(Model model) {
		List<RestaurantVO> restaurantList = service.getRestaurantList();
		model.addAttribute("restaurantList", restaurantList);
		return "owner/store_List";
	}
	
	//owner의 식당수정로 이동 Mapping
	@GetMapping("StoreUpdatePage")
	public String StoreUpdatePage(@RequestParam String res_brn, Model model) {
		
		// 가게 상세 정보 저장
		RestaurantVO restaurant = service.getRestaurantInfo(res_brn);
		
		model.addAttribute("restaurant", restaurant);
		return "owner/store_UpdatePage";
	}
	
	// 가게 정보 수정 작업
	@PostMapping("storeUpdate")
	public String storeUpdate(RestaurantVO restaurant, Model model) {
		
		// 가게 정보 수정
		int updateCount = service.ModifyRestaurant(restaurant);
		// 성공시  success_forward.jsp 로 이동 가게 정보 수정 완료 출력
		// 실패시 가게 정보 수정 실패! 출력
		if(updateCount > 0) {
			model.addAttribute("msg", "가게 정보 수정 완료");
			model.addAttribute("targetURL", "StoreList");
			return "success_forward";
			
		} else {
			model.addAttribute("msg", "가게 정보 수정 실패!");
			return "fail_back";
			
		}
		
		
	}
	
	// 메뉴추가 버튼 클릭시 메뉴 등록 작업 
	@PostMapping("menuInsert")
	public String menuInsert(MenuVO menu, Model model) {
		System.out.println(menu);
		
		int insertCount = menuService.registMenu(menu);
		
		if(menu.getMenu_photo() == null) {
			menu.setMenu_photo("");
		}
		if(insertCount > 0) {
			
			return "";
		} else {
			
			model.addAttribute("msg", "메뉴 등록 실패!");
			return "fail_back";
		}
		
	}
	
	
}
