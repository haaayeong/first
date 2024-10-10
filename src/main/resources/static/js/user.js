$('#icb').on('click', (e) => {
	e.preventDefault();
	
	const username = $('#username').val();
	
	$.ajax({
		type: "GET",
		url: "/user/idcheck?username=" + username
	}).done(function(response) {
		if(response == 0) {
			alert("사용 가능한 아이디 입니다.")
		} else {
			alert("중복된 아이디입니다.")
		}
		
	}).fail(function(error) {
		console.log(error);
	})
})