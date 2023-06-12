<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <!-- Bootstrap CDN -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
   
   
    <!-- jQuery CDN -->
    <!-- 나중에 js파일로 교체 예정 -->
    <script
            src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.6.0/jquery.min.js"
            integrity="sha512-894YE6QWD5I59HgZOGReFYm4dnWc1Qt5NtvYSaNcOP+u1T9qYdvdihz0PPSiiqn/+/3e7Jo4EaG7TubfWGUrMQ=="
            crossorigin="anonymous"
            referrerpolicy="no-referrer">
    </script>
    
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div class="container d-flex justify-content-center p-5 modal-content">
		<form action="#" method="get">
			<table>
				<tr>
					<th>메뉴 이름</th>
					<td><input type="text" class="form-control"></td>
				</tr>
				<tr>
					<th>메뉴 가격</th>
					<td><input type="text" class="form-control" placeholder="숫자만 입력"></td>
				</tr>
				<tr>
					<th>메뉴 설명</th>
					<td><textarea rows="5" cols="30" class="form-control"></textarea></td>
				</tr>
				<tr>
					<th>메뉴 사진</th>
					<td><input type="file" class="form-control" multiple="multiple"></td>
				</tr>
				<tr>
					<td colspan="2">
						<button class="btn btn-warning"  style="color: white;" id="addMenu">추가</button>
					</td>
				</tr>
			</table>
		
		</form>
	
	</div>
<script>


$(document).ready(function() {
		// 페이지가 완전히 로드된 이후에
		// 모달창 안에 버튼을 아래와 같이 선택자로 지정해준다. - 2중 모달창일 경우에
		$("#addMenu").on("click", function() {
			  $('#addMenu').click(function() {
				  // 모달창안에 컨텐츠를 비워준다.
				  // .html('');
				   $('.modal-content').empty();               
				   $.ajax({
					   // 주소를 "storeMenuInsert" 이 부분만 수정해주면 된다.
					   url: '<c:url value="StoreInsertPage"/>',                
					   type: 'GET',                
					   dataType: 'html',                
					   success: function(response) {                                    
//  						   $('#storeMenuInsert').modal('hide');                 
//  						   $('#menu').modal('show');                 
						   $('.modal-content').html(response); 
						   $("#menu").trigger("click");
						   },                
						   error: function(xhr, status, error) {                  
							   console.log(error);                 
							   }              
						   });            
				   });   
	    	});
}); 

</script>
       
       
       <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4" crossorigin="anonymous"></script>
</body>
</html>