package pe.autonoma.entity;

import java.util.Date;

public class Persona {
	private int id_persona;
	private String nombres;
	private String apellidos;
	private String nro_contacto;
	private String edad;
	private String fecha_nacimiento;
	private String user;
	private String password;
	private Date create_at;
	private Date update_at;
	public int getId_persona() {
		return id_persona;
	}
	public void setId_persona(int id_persona) {
		this.id_persona = id_persona;
	}
	public String getNombres() {
		return nombres;
	}
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public String getNro_contacto() {
		return nro_contacto;
	}
	public void setNro_contacto(String nro_contacto) {
		this.nro_contacto = nro_contacto;
	}
	public String getEdad() {
		return edad;
	}
	public void setEdad(String edad) {
		this.edad = edad;
	}
	public String getFecha_nacimiento() {
		return fecha_nacimiento;
	}
	public void setFecha_nacimiento(String fecha_nacimiento) {
		this.fecha_nacimiento = fecha_nacimiento;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Date getCreate_at() {
		return create_at;
	}
	public void setCreate_at(Date create_at) {
		this.create_at = create_at;
	}
	public Date getUpdate_at() {
		return update_at;
	}
	public void setUpdate_at(Date update_at) {
		this.update_at = update_at;
	}
	public Persona(int id_persona, String nombres, String apellidos, String nro_contacto, String edad,
			String fecha_nacimiento, String user, String password, Date create_at, Date update_at) {
		super();
		this.id_persona = id_persona;
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.nro_contacto = nro_contacto;
		this.edad = edad;
		this.fecha_nacimiento = fecha_nacimiento;
		this.user = user;
		this.password = password;
		this.create_at = create_at;
		this.update_at = update_at;
	}
	public Persona(){
		
	}
}
