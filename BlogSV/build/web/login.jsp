

<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<title>Document</title>
	<link rel="stylesheet" href="css/bootstrap.min.css" >

	<link rel="stylesheet" href="css/styles.css">
</head>

<body class="text-center">
    <form action="<%=request.getContextPath()%>/usuario" method="post" class="form-signin">
		
	  	<h1 class="h3 mb-3 font-weight-normal">Ingrese los datos de usuario</h1>
	  	<label for="inputEmail" class="sr-only">NickName</label>
	  	<input type="text" name="nickname" id="inputEmail" class="form-control" placeholder="nickname" required autofocus>
	  
	  	<label for="inputPassword" class="sr-only">Password</label>
	  	<input type="password" name="pwd" id="inputPassword" class="form-control" placeholder="Password" required>
                
                <input type="hidden" name="login" value="login">
                
	  	<button class="btn btn-lg btn-primary btn-block" type="submit">Iniciar sesion</button>

	  	<div class="text-right">
	  		<a href="register.jsp" >Registro de usuario</a>	
	  	</div>	
	  	
	  	<p class="mt-5 mb-3 text-muted">&copy; 2022</p>
	</form>
</body>
</html>