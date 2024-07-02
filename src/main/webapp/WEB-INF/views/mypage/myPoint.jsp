<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>마이페이지</title>
<c:set var="path" value="${pageContext.servletContext.contextPath}" />
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.7.1/jquery.min.js"></script>
<link rel="stylesheet" href="${path}/resources/css/myPage.css">
</head>
<body>
	<div>
		<div class="total-point">
			<h2>카드득 포인트</h2>
			<h1>
				<fmt:formatNumber value="${total}" pattern="#,###"/>P
			</h1>
		</div>
		<div class="point-per-month">
			<div class="point-summary">
				<div>
					<p>구매 포인트</p>
					<p>
						<fmt:formatNumber value="${purchase}" pattern="#,###"/>P
					</p>
				</div>
				<div>
					<p>판매 포인트</p>
					<p>
						<fmt:formatNumber value="${sales}" pattern="#,###"/>P
					</p>
				</div>
				<div>
					<p>위로 포인트</p>
					<p>
						<fmt:formatNumber value="${sorry}" pattern="#,###"/>P
					</p>
				</div>
				<div>
					<p>이벤트 포인트</p>
					<p>
						<fmt:formatNumber value="${event}" pattern="#,###"/>P
					</p>
				</div>
				<div>
					<p>사용 포인트</p>
					<p>
						<fmt:formatNumber value="${used}" pattern="#,###"/>P
					</p>
				</div>
			</div>
		</div>
	</div>
	<h2>포인트내역</h2>
	<c:forEach var="points" items="${points}">
		<div class="history-section">
			<p class="grayfont">${points.create_date}</p>
			<div class="point-detail">
				<c:choose>
					<c:when test="${points.is_add == 1}">
						<h3 class="point-status-blue">적립 +<fmt:formatNumber value="${points.amount}" pattern="#,###"/></h3>
					</c:when>
					<c:when test="${points.is_add == -1}">
						<h3 class="point-status-red">사용 -<fmt:formatNumber value="${points.amount}" pattern="#,###"/></h3>
					</c:when>
				</c:choose>
				<p>${points.cmt}</p>
			</div>
		</div>
	</c:forEach>
</body>
</html>