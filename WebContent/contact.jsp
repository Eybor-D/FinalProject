<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


<section id="ContactUs">
 <h3></h3>
 <div id="FormContac">
   <form action="formCont" method="post">
    <input type="text" name="nombre" placeholder="Nombre" title="Ingrese su nombre correctamente" required>
    <input type="email" name="nombre" placeholder="Email" title="Ingrese correctamente su correo" required>
    <input type="tel" name="celular" placeholder="Nro.Celular" pattern="[0-9]{3}/s[0-9]{3}/s[0-9]{3}" title="¡ingrese su numero XXX XXX XXX,teniendo en cuenta los espacios y que no es necesario ingresar el +51 !" required>
    <texttarea name="" id="" cols="">
    <input type="submit" value="">
   </form>
 </div>
</section>

</body>
</html>