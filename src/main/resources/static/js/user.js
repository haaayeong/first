let idCheck = false;

$('#icb').on('click', (e) => {
	e.preventDefault();
	
	const username = $("#username").val(); // 얘가 이 밖으로 나가면 안 되는 이유는 처음 페이지 시작할 때 이미 아무것도 없는 게 username 변수에 저장됨.
	// 그 후에 밑에서 아무리 이걸 활용해서 뭘 하라고 해봤자 그 아무것도 없는 것만 들어감.
	
	$.ajax({
		type: "GET",
		url: "/user/idcheck?username=" + username
	}).done(function(response) {
		if(response == 0) {
			alert("사용 가능한 아이디 입니다."),
			idCheck = true
			
			
		} else {
			alert("중복된 아이디입니다."),
			idCheck = false
		}
		
		show();
		
	}).fail(function(error) {
		console.log(error);
		
	})
})

function show() { // 함수로 따로 빼고 활용하는 방법을 생각 못함.
		const username = $("#username").val();
		const password = $("#password").val();
		const nickname = $("#nickname").val();
		const email = $("#email").val();
		
		if(username && password && nickname && email && idCheck) {
			$("#btn-insert").attr("disabled", false);
		} else {
			$("#btn-insert").attr("disabled", true);
		}}
		
$(".form-control").on("keyup", show)