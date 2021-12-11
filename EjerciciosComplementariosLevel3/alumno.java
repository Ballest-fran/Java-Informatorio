package EjerciciosComplementariosLevel3;
import java.time.LocalDate;
import java.time.LocalTime;

public class alumno {
	private String apellido;
    private String nombre;
    private LocalDate fechaDeNacimiento;
	public alumno(String apellido, String nombre, LocalDate fecha) {
		super();
		this.apellido = apellido;
		this.nombre = nombre;
		this.fechaDeNacimiento = fecha;
 		//this.fechaDeNacimiento = FechaDeNacimiento;
	}
	public alumno(String apellido2, String nombre2, LocalTime now) {
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public LocalDate getFechaDeNacimiento() {
		return fechaDeNacimiento;
	}
	public void setFechaDeNacimiento(LocalDate fechaDeNacimiento) {
		this.fechaDeNacimiento = fechaDeNacimiento;
	}
}