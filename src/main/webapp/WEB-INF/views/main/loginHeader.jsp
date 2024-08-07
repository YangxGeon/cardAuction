<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<link rel="stylesheet" href="${path}/resources/css/header.css">
<link rel="stylesheet" as="style" crossorigin
	href="https://cdn.jsdelivr.net/gh/orioncactus/pretendard@v1.3.9/dist/web/variable/pretendardvariable.min.css" />
<c:set var="path" value="${pageContext.servletContext.contextPath }" />
<div class="top">
	<nav class="top-nav">
		<a href="${path}/main" class="top-title">
			<img src="${path }/resources/image/logo.png" alt="logo" class="logo">
		</a>
		<div class="main-category">
			<ul class="main-category-box">
				<li class="main-category-item">
					<a href="${path}/auction/auctionMain">포켓몬</a>
				</li>
				<li class="main-category-item">
					<a href="${path}/auction/auctionYMain">유희왕</a>
				</li>
				<li class="main-category-item">
					<a href="${path}/auction/auctionDMain">디지몬</a>
				</li>
				<li class="main-category-item">
					<a href="${path}/auction/auctionOMain">원피스</a>
				</li>
				<li class="main-category-item">
					<a href="${path}/auction/auctionSMain">스포츠</a>
				</li>
				<li class="main-category-item">
					<a href="${path}/inquiry/InquirySelect">문의</a>
				</li>
			</ul>
		</div>
		<div class="top-nav-category">
			<ul class="category-box">
				<li class="category-item">
					<c:choose>
						<c:when test="${isAdmin eq 1}">
							<a href="/myapp/admin/adminMain.do"> 
								<img src="${path }/resources/icon/user.png" class="icon">${nickname}님
							</a>
						</c:when>
						<c:otherwise>
							<a href="/myapp/mypage/myInfo.do"> 
								<img src="${path }/resources/icon/user.png" class="icon">${nickname}님
							</a>
						</c:otherwise>
					</c:choose>
				</li>
				<li class="category-item"><a href="/myapp/auth/logout"> 
					<img src="${path}/resources/icon/logout.png" class="icon">
					로그아웃
					</a>
				</li>
				<li class="category-item">
					<div class="dropdown">
						<a href="#" class="dropdown-toggle"> <c:choose>
								<c:when test="${empty nlist}">
									<img src="${path}/resources/icon/alarm.png" alt="알림" height=20>
								</c:when>
								<c:otherwise>
									<img src="${path}/resources/icon/isAlarm.png" alt="알림" height=20>
								</c:otherwise>
							</c:choose>
						</a>
						<div class="dropdown-content">
							<c:choose>
								<c:when test="${empty nlist}">
									<div class="no-unread-noti">
										<h3>미확인 알림이 없습니다.</h3>
									</div>
								</c:when>
								<c:otherwise>
									<c:forEach var="noti" items="${nlist}">
										<div class="noti-brief">
											<div class="noti-image">
												<img src="${noti.image1 }" alt="Product Image">
											</div>
											<div class="noti-content">
												<h3>${noti.item_name }</h3>
												<p>${noti.cmt }</p>
											</div>
										</div>
									</c:forEach>
								</c:otherwise>
							</c:choose>
							<a id="allNoti" class="mainColor" href="/myapp/mypage/myNoti.do">모든 알림 보기</a>
						</div>
					</div>
				</li>
			</ul>
		</div>
	</nav>
</div>