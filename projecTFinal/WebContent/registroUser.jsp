<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registro</title>
  <link  rel="stylesheet" href="ASSETS/css/style.css"  type="text/css">
    <link  rel="stylesheet" href="ASSETS/css/registrando.css"  type="text/css">
</head>

<body>
    <header>
      <a href="#inicio" class="scroll">
        <div id="logo">
        <img src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTAHpSFyP3o2t-pnt2j3UcKeDxWI_hXRPw7nsKBrYfeRI6nCsNSEA" type="img">
        </div>
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
    <article>
<form action="SiteController" method="POST">
<input type="hidden" name="action" value="registrar_usuario">
Nombre:
<input type="text" name="nombres" placeholder="nombres">
<br>
<br>
<br>
Apellidos:
<input type="text" name="apellidos">
<br>
<br>
<br>
Nro.Celular:
<input type="text" name="nro_contacto">
<br>
<br>
<br>
Edad:
<input type="text" name="edad">
<br>
<br>
<br>
Fecha de cumpleaños
<input type="date" name="fecha_nacimiento">
<br>
<br>
<br>
Nombre de Usuario:
<input type="text" name="user">
<br>
<br>
<br>
Password:
<input type="password" name="password">
<br>
<br>
<br>
<button type="submit">Enviar</button>
</form>
</article>
</body>
</html>