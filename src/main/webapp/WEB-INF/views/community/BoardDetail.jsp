<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<title>BoardDetail</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"
	rel="stylesheet">
<link href="../css/BoardDetail.css?after" rel="stylesheet">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>
<script src="../js/BoardDetail.js" defer></script>
</head>
<body>
	<div class="container custom-container mt-3">
		<div class="right-aligned-button">
			<input type="submit" class="btn btn-primary" value="목록">
		</div>
		<div class="card p-3 mt-3">
			<form action="">
				<div class="form-inline mb-3 mt-3">
					<h1>[Q&amp;A] 이 덱 구성할 때 어떤 카드 필요할까요</h1>
				</div>
				<div
					class="form-inline mb-3 mt-3 d-flex justify-content-between align-items-center">
					<div class="d-flex align-items-center">
						<img id="ImageLogo1" src="../Images/noprofile.png" alt="1"
							class="me-2">
						<h2 class="me-2 mb-0" id="writer">서연잇</h2>
						<a href="" class="d-inline"> 서연잇님의 게시글 더보기></a>
					</div>
					<div class="d-flex align-items-center">
						<p class="metadata mb-0 me-3">작성일: 2024-05-28 15:44 | 조회 6</p>
						<div class="dropdown">
							<button class="btn dropdown-toggle" type="button"
								id="dropdownMenuButton" data-bs-toggle="dropdown"
								aria-expanded="false">&#x22EE;</button>
							<ul class="dropdown-menu" aria-labelledby="dropdownMenuButton">
								<li><a class="dropdown-item" href="#">수정하기</a></li>
								<li><a class="dropdown-item" href="#">삭제하기</a></li>
								<li><a class="dropdown-item" href="#">공유하기</a></li>
							</ul>
						</div>
					</div>
				</div>
				<hr>
				<div class="mb-3 mt-3">
					<p>이 덱을 구성할 때 어떤 카드를 사용하는 것이 좋을까요? 여러 가지 카드를 추천해 주시면 감사하겠습니다.</p>
				</div>
				<br>
				<div class="d-flex mb-3 mt-3">
					<a href=""><img id="ImageLogo" src="../Images/like.png"
						alt="like"></a>
					<p class="mb-0 me-2">추천 0</p>
					<img class="ImageLogo" src="../Images/comment.png" alt="comment">
					<p class="mb-0">댓글 2</p>
				</div>
				<div class="form-inline mb-3 mt-3">
					<h2>댓글</h2>
				</div>
				<div class="card mb-3" id="comment-box">
					<div class="card-body d-flex">
						<img src="../Images/noprofile.png" alt="이미지 설명"
							class="comment-image me-2">
						<div>
							<h5 class="card-title">준성쓰</h5>
							<p class="card-text">모르는데요</p>
							<p class="text-muted">작성일 : 2024-05-28 17:20</p>
						</div>
					</div>
				</div>
				<div class="card mb-3" id="comment-box">
					<div class="card-body d-flex">
						<img src="../Images/noprofile.png" alt="이미지 설명"
							class="comment-image me-2">
						<div>
							<h5 class="card-title">대장은 심은정</h5>
							<p class="card-text">서포트 템으로 페퍼랑 암호마니아의 해독, 보스의 지령, 투로박사의
								시나리오, 비파 카드 필요해요 수량은 유동적으로 정하시면 될듯요?</p>
							<p class="text-muted">작성일 : 2024-05-29 10:12</p>
						</div>
					</div>
				</div>
				<div class="mb-3 mt-3">
					<div class="card mb-3">
						<div class="comment-header comment-type">
							<p class="mb-0" id="comment-writer">
								<strong>디자인짱성진</strong>
							</p>
							<p class="mb-0 comment-type">
								<span id="charCount">0</span>/2000
							</p>
						</div>
						<input class="form-control mt-1" id="commentInput" name="comment"
							placeholder=" 댓글을 입력해주세요" maxlength="2000"
							oninput="updateCharCount()">
						<div class="right-aligned-button mt-2">
							<input type="submit" class="btn btn-primary btn-primary-custom" value="등록">
						</div>
					</div>
				</div>
			</form>
		</div>
	</div>
</body>
</html>