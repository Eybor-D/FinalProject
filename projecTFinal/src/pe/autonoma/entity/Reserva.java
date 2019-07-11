package pe.autonoma.entity;

public class Reserva {

	private int id_reserva;
	private String local;
	private String fecha_reserva;
	private String hora;
	private String cantidad;
	private String detalles;
	private String activo;
	private int id_persona;
	public Reserva(int id_reserva, String local, String fecha_reserva, String hora, String cantidad, String detalles,
			String activo, int id_persona) {
		super();
		
		this.id_reserva = id_reserva;
		this.local = local;
		this.fecha_reserva = fecha_reserva;
		this.hora = hora;
		this.cantidad = cantidad;
		this.detalles = detalles;
		this.activo = activo;
		this.id_persona = id_persona;
	}
	public Reserva() {
		super();
	}
	public int getId_reserva() {
		return id_reserva;
	}
	public void setId_reserva(int id_reserva) {
		this.id_reserva = id_reserva;
	}
	public String getLocal() {
		return local;
	}
	public void setLocal(String local) {
		this.local = local;
	}
	public String getFecha_reserva() {
		return fecha_reserva;
	}
	public void setFecha_reserva(String fecha_reserva) {
		this.fecha_reserva = fecha_reserva;
	}
	public String getHora() {
		return hora;
	}
	public void setHora(String hora) {
		this.hora = hora;
	}
	public String getCantidad() {
		return cantidad;
	}
	public void setCantidad(String cantidad) {
		this.cantidad = cantidad;
	}
	public String getDetalles() {
		return detalles;
	}
	public void setDetalles(String detalles) {
		this.detalles = detalles;
	}
	public String getActivo() {
		return activo;
	}
	public void setActivo(String activo) {
		this.activo = activo;
	}
	public int getId_persona() {
		return id_persona;
	}
	public void setId_persona(int id_persona) {
		this.id_persona = id_persona;
	}
	
}
