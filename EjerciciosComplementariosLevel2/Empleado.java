package EjerciciosComplementariosLevel2;
public class Empleado{
    //declaracion de atributos
    private int dni;
    private String nombreYapellido;
    private int horasTrabajadas;
    private int valorPorHora;

    /*esto es parara instanciar un obeto y pasarle parametros
    osea un ejemplo seria:
    Empleado InstanciaUnEmpleado = new Empleado("1234","homero",simpson)
    */
    public Empleado(int dni, String nombreYapellido,int horasTrabajadas,int valorPorHora){
        this.dni=dni;
        this.nombreYapellido=nombreYapellido;
        this.horasTrabajadas=horasTrabajadas;
        this.valorPorHora=valorPorHora;   
    }
    /*esta parte del codigo, sobre escribe la super clase (que es la clase obeto), 
    es lo que significa override,
    pero basicamente es para mostrar las cosas por pantalla nomas*/
    @Override
    public String toString() {
        return String.valueOf(this.dni)+" - "+this.nombreYapellido+
        " - "+String.valueOf(this.horasTrabajadas)+" - "+String.valueOf(this.valorPorHora);
    }
    //esto segun el ejmplo anterior cuando se ejecute el metodo .toString() devolvera por ejemplo: "1234 - Homero - simpson"
    //a esto le falta de todas formas los get(obtener) y set(colocar) 
    public int getdni(){
        return dni;
    }
    public String getnombreYapellido(){
        return nombreYapellido;
    }   
    public int gethorasTrabajadas(){
        return horasTrabajadas;
    }
    public int getvalorPorHora(){
        return valorPorHora;
    } 

}
