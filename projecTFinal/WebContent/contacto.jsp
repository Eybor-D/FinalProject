
<<!DOCTYPE html>
<html lang="es" dir="ltr">
  <head>
    <meta charset="utf-8">
    <title>Contáctanos</title>
       <link  rel="stylesheet" href="ASSETS/css/style.css"  type="text/css">
          <link  rel="stylesheet" href="ASSETS/css/contact.css"  type="text/css">
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
    <section id="contacto">
      <h3>contáctenos</h3>
      <div id="formulario">
        <form action="" method="post">
          <table>
            <tr>
              <td>
                <h2>Nombre:</h2>
              </td>
              <td>
               <input type="text" name="nombre"  placeholder="nombre" required>
              </td>
            </tr>
            <tr>
              <td>
                <h2>Correo:<h2>
              </td>
              <td>
           <input type="email" name="email" placeholder="email" required>
              </td>
            </tr>
            <tr>
              <td>
               <h2>Nro. Celular:</h2>
              </td>
              <td>
               <input type="tel" name="celular" placeholder=""="teléfono" pattern="[0-9]{3}\s[0-9]{3}\s[0-9]{3}$" title="debe ser un número con la estructura xxx xxx xxx,teniendo en cuenta los espacios" required>
              </td>
           <tel></tel>
            </tr>
            <tr>
              <td>
                <h2>Agregar mensaje:</h2>
              </td>
              <td>
               <textarea name="mensaje" cols="30" rows="30" placeholder="mensaje" required></textarea>
               <td>
            </tr>
            <tr>
            <td>
           <input type="submit" value="enviar">
           </td>
            </tr>
           </table>
        </form>
        </article>
      </div>
  </body>
</html>