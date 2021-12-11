package EjerciciosComplementariosLevel3;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.time.*;

public class ejercicio5{
    public static void main(String[] args){
        //cargo la lista
        List<alumno> curso = new ArrayList<>();
        curso.add(new alumno("fuasa","dolores",LocalDate.parse("2020-03-02")));
        curso.add(new alumno("fran","balles",LocalDate.parse("2018-05-02")));
        curso.add(new alumno("mati","alba",LocalDate.parse("2019-06-02")));
        curso.add(new alumno("flor","corone",LocalDate.parse("2021-02-02")));
        curso.add(new alumno("sofi","legui",LocalDate.parse("2006-09-02")));
        curso.add(new alumno("calle","monte",LocalDate.parse("2010-10-02")));
        //defino el map
        Map<String, Integer> salida = new HashMap<String, Integer>();
        //fecha actual
        LocalDate act=LocalDate.now();
        //proceso
        for(int num = 0; num < curso.size(); num++){
            Integer edad= act.getYear() - curso.get(num).getFechaDeNacimiento().getYear();
            if (act.getMonthValue() < curso.get(num).getFechaDeNacimiento().getMonthValue()){
                edad--;
            }else if (  act.getMonthValue() == curso.get(num).getFechaDeNacimiento().getMonthValue() &&
                        act.getDayOfMonth() < curso.get(num).getFechaDeNacimiento().getDayOfMonth() ){
                edad--;   
            }
            if (edad<0){
                System.out.println("no se puede calcular la edad --> null");
                edad=null;
            }
            salida.put((curso.get(num).getApellido()+" "+curso.get(num).getNombre()), edad);
        }
        System.out.println(salida);
    } 
}