<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../layout/header.jsp" %>

<div>
	<form class="isu-m" action="/user/insert" method="post">
		<div class="isu">
			<label for="username" class="form-label">아이디 : </label>
			<input type="text" class="form-control" id="username" placeholder="5~20자의 영문 소문자,숫자를 입력하세요" name="username">
		</div>
		<button id="icb"> 중복검사 </button> <br>
		<div class="isu">
			<label for="password" class="form-label">비밀번호 : </label>
			<input type="password" class="form-control" id="password" placeholder="8~16자의 영문 대/소문자, 숫자, 특수문자를 입력하세요" name="password">
		</div>
		<div class="isu">
			<label for="nickname" class="form-label">닉네임 : </label>
			<input type="text" class="form-control" id="nickname" placeholder="닉네임을 입력하세요" name="nickname">
		</div>
		<div class="isu">
			<label for="email" class="form-label">이메일 : </label>
			<input type="email" class="form-control" id="email" placeholder="이메일을 입력하세요" name="email">
		</div>
		<input type="submit" id="btn-insert" value="회원가입" disabled> <!-- 얘가 submit여야 정보를 보내줄 수 있음. -->
	</form>
</div>

<script src="/js/user.js"></script>
<%@ include file="../layout/footer.jsp" %>