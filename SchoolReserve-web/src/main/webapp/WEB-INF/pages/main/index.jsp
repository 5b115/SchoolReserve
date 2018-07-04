<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Main</title>
<!-- 引入样式 -->
<link rel="stylesheet"
	href="https://unpkg.com/element-ui/lib/theme-chalk/index.css">

</head>
<body>

	Welcome to SchoolReserve!
       欢迎使用校园订餐系统
	


</body>


</script>
	
</head>

<body>
<div class="theme-buy">
<a class="btn btn-primary btn-large theme-login" href="javascript:;"></a>
</div>
<div class="theme-popover">
     <div class="theme-poptit">
       
      
     </div>
     <div class="theme-popbod dform">
           <form class="theme-signin" name="loginform" action="" method="post">
                <ol>
                    
                     <li><strong>账户：</strong><input class="ipt" type="text" name="log" value="吴凡" size="20" /></li>
                     <li><strong>密码：</strong><input class="ipt" type="password" name="pwd" value="*********" size="20" /></li>
                     <input type="button" value="登录" 
onclick="javascrtpt:window.location.href='http://localhost:8080/SchoolReserve-web/customer/index.html'">
                     
                </ol>
           </form>
     </div>
</div>
<div class="theme-popover-mask"></div>
</body>
</html>

    	<style></style>
	    		<script></script>

<!-- import Vue before Element -->
<script src="https://unpkg.com/vue/dist/vue.js"></script>
<!-- import JavaScript -->
<script src="https://unpkg.com/element-ui/lib/index.js"></script>
<script>
	new Vue({
		el : '#app',
		data : function() {
			return {
				visible : false
			}
		}
	})
</script>
</html>