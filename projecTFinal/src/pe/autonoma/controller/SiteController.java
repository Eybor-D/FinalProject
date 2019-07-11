package pe.autonoma.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.sql.DataSource;

import pe.autonoma.entity.Persona;
import pe.autonoma.entity.Reserva;
import pe.autonoma.model.PersonaModel;
import pe.autonoma.model.ReservaModel;

/**
 * Servlet implementation class SiteController
 */
@WebServlet("/SiteController")
public class SiteController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SiteController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		String action = request.getParameter("action");
		switch(action) {
			case "registrar_usuario":
				registrar_usuario(request, response);
				break;
			case "iniciar_sesion":
				break;
			case "reserva_persona":
				reserva(request, response);
				break;
		}
	}
	
	protected void iniciar_sesion(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		Persona persona = new Persona();
		PersonaModel personaModel = new PersonaModel();
		persona.setUser(request.getParameter("user"));
		persona.setPassword(request.getParameter("password"));
		Persona user = personaModel.iniciar_sesion(persona);
		HttpSession session = request.getSession();
		session.setAttribute("persona", user);
		response.sendRedirect("/reservar.jsp");
	}
	
	protected void registrar_usuario(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		Persona persona = new Persona();
		PersonaModel personaModel = new PersonaModel();
		persona.setNombres(request.getParameter("nombres"));
		persona.setApellidos(request.getParameter("apellidos"));
		persona.setNro_contacto(request.getParameter("nro_contacto"));
		persona.setEdad(request.getParameter("edad"));
		persona.setFecha_nacimiento(request.getParameter("fecha_nacimiento"));
		persona.setUser(request.getParameter("user"));
		persona.setPassword(request.getParameter("password"));
		String rpt = personaModel.registrar_usuario(persona);
		System.out.print(rpt);
	}
	
	protected void reserva(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		Reserva reserva = new Reserva();
		ReservaModel reservaModel = new ReservaModel();
		reserva.setLocal(request.getParameter("listmaps"));
		reserva.setFecha_reserva(request.getParameter("fecha"));
		reserva.setHora(request.getParameter("hora"));
		reserva.setCantidad(request.getParameter("comensales"));
		reserva.setDetalles(request.getParameter("detalles"));
		//reserva.setId_persona(Integer.parseInt(request.getParameter("id_persona")));
		String message = reservaModel.reserva(reserva);
		System.out.print(message);
	}

}

