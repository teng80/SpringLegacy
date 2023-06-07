<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%-- ${pageContext.request.contextPath} => 프로젝트명 --%>
<c:set var="contextPath" value="${pageContext.request.contextPath}"  />
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.7.0/jquery.min.js" integrity="sha512-3gJwYpMe3QewGELv8k/BX9vcqhryRdzRMxVfq6ngyWXwo03GFEzjsUm8Q7RZcHPHksttq7/GFoxjCVUjkjvPdw==" crossorigin="anonymous" referrerpolicy="no-referrer"></script>
<script type="text/javascript">

	$(function() {
		$("#checkJson").click(function() {
			var member={tno:"777", owner:"홍길동", grade:"337"};
		
		$.ajax({
			type:"post"
// 			프로젝트명+class @RequestMapping + method @RequestMapping
// 			spring_15/sample/ticket
			,url:"http://localhost:8181/spring_15/sample/ticket.json"

			,data:member
			,success: function(data, status){
				console.log("상태코드 =>" + status);
				console.log("결과 => " + JSON.stringify(data))	
				var get = JSON.stringify(data);
				$("#checkJson").append(`<h1>${get.owner}</h1>`);
				$("#checkJson").append("<h1>" + ${get.owner} + "</h1>");
				alert("data =>" + get.owner );
			}
			,error: function(data){
				alert("오류가 발생했습니다.")
			}			
		}); //end ajax 
		}); //end function
	}); //end click function
</script>
</head>
<body>
<!-- 	ticket_test.jsp!!! -->
	<input type="button" id="checkJson" value="회원 정보 보내기"><br>
</body>
</html>