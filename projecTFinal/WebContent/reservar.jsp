<!DOCTYPE html>

<html lang="en" dir="ltr">
  <head>
    <meta charset="utf-8">
    <title>Reservar</title>
        <link href="ASSETS/css/style.css" rel="stylesheet" type="text/css">
        <link href="ASSETS/css/reserverStyle.css" rel="stylesheet" type="text/css">
  </head>
  <body>
      <header>
      <a href="#inicio" class="scroll">
      
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
   
<article id="reservando">
<h1>Reservas</h1>
    <form name="formulario" method="post" action="SiteController">
    <table class="tablareserver">
    <input type="hidden" value="reserva_persona" name="action">
 <tr>
 <td>
  Seleccione el lugar:
  </td>
  <td>
  <select name="listmaps">
    <option value="1" selected>San Isidro</option>
    <option value="2">Miraflores</option>
    <option value="3">La Molina</option>
  </select>
  <td>
  </tr>

     <tr>
     <td>fecha:</td>
     <td><input type="date" name="fecha"></td>
	</tr>
	<tr>
    <td>hora:</td>
    <td><input type="time" name="hora"  required></td>
    </tr>
    <tr>
    <td>cantidad de comensales:</td>
    <td><input type="number" name="comensales" min="1" max="40" required><td>
    </tr>
    <td>Detalles adicionales:</td>
   <td> <textarea name="detalles" cols="30" rows="30" placeholder="detalles" required>
    </textarea></td>
    
<tr>
<td>
<input type="submit" value="reservar">
</td>
</tr>
</table>
</form>
</article>

  </body>
</html>
