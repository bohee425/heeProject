<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	// 전달받은 오류 메세지 출력 후 지정한 페이지로 포워딩
	alert("${msg}");
	location.href = "${targetURL}";
</script>
</head>
<body>

</body>
</html>