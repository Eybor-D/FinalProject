<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>LOGIN</title>
    <link href="ASSETS/css/loginStyle.css" rel="stylesheet" type="text/css">
        <link href="ASSETS/css/style.css" rel="stylesheet" type="text/css">
</head>
<body>
   <header>
      <a href="#inicio" class="scroll">
        <div id="logo"></div>
      </a>
      <nav>
        <ul>
          <li><a href="index.jsp" class="scroll">INICIO</a></li>
          <li><a href="nosotros.jsp" class="scroll">NOSOTROS</a></li>
          <li><a href="reservar.jsp" class="scroll">RESERVAR</a></li>
          <li><a href="#user" class="scroll">USUARIO</a></li>
            <li><a href="contacto.jsp" class="scroll">CONTÁCTENOS</a></li>
            <li><a href="login.jsp" class="scroll">Iniciar Sesion</a></li>
            <li><a href="registroUser.jsp" class="scroll">Registro</a></li>
        </ul>
      </nav>
    </header>
 <div class="login-box">
     
      <h1>Login Here</h1>
      <form>
        <!-- USERNAME INPUT -->
        <label for="username">NOMBRE DE USUARIO</label>
        <input type="text" placeholder="Enter Username">
        <!-- PASSWORD INPUT -->
        <label for="password">Password</label>
        <input type="password" placeholder="Enter Password">
        <input type="submit" value="Ingresar">
        <a href="#">No tienes una cuenta?</a>
      </form>
    </div>
</body>
</html>