package EjerciciosComplementariosLevel2;
import java.util.*;

public class ejercicio6{

    public static void main(String[] args){
        Empleado emple1= new Empleado(1234, "Hombre Callado", 8, 300);
        Set<Empleado> listaDeEmple= new HashSet<>();
        listaDeEmple.add(emple1);
        listaDeEmple.add(new Empleado(5678, "Franco Gonzale", 5, 250));
        listaDeEmple.add(new Empleado(9123, "Sofia Calladas", 6, 400));
        listaDeEmple.add(new Empleado(4567, "Calamardo Gaos", 7, 350));
        listaDeEmple.add(new Empleado(8912, "Homero Callado", 9, 250));
        System.out.println("la lista de empleados esta compuesta por:");
        System.out.println(listaDeEmple);

        Map<Integer,Integer> sueldos=new HashMap<>();
        for(Empleado unEmpleado: listaDeEmple){
            sueldos.put(unEmpleado.getdni(), (unEmpleado.gethorasTrabajadas()*unEmpleado.getvalorPorHora()));
        }
        System.out.println("El diccionario quedo:");
        System.out.println(sueldos);
    }
}
