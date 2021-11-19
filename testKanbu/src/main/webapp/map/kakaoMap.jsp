<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
	"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Insert title here</title>
	
<style type="text/css">
	
	div{
		width: 500px;
		height: 400px;
	}
	
</style>

<script type="text/javascript" src="//dapi.kakao.com/v2/maps/sdk.js?appkey=fe4da653d661d051c0f1aed85923ec4c">
	var container = document.getElementById('map');		// 지도를 담을 영역의 DOM 레퍼런스
	var options = {					// 지도를 생성할 때 필요한 기본 옵션
			center: new kakao.maps.LatLng(33.450701, 126.570667),	// 지도의 중심좌표,
			level: 3	// 지도의 레벨(확대. 축소 정도)
	};
	
	var map = new kakao.maps.Map(containere, options);		// 지도 생성 및 객체 리턴

</script>



</head>

<body>

	<div id="map"></div>

</body>
</html>