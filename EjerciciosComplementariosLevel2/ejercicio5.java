package EjerciciosComplementariosLevel2;
import java.util.*;

public class ejercicio5{

    public static void main(String[] args){

        Random r = new Random();
        List<Integer> horasTrabajadas=new ArrayList<>();
        List<Integer> valorPorHoras=new ArrayList<>();
        List<Integer> resumenSemanal=new ArrayList<>();
        //cargo sueldos y horas de trabajo y caluculo el resultado
        for(int i=0;i<5;i++){
            horasTrabajadas.add(r.nextInt(9)+1);
            valorPorHoras.add(r.nextInt(300)+300);
            resumenSemanal.add(horasTrabajadas.get(i)*valorPorHoras.get(i));
        }
        System.out.println("Horas trabajadas:         "+horasTrabajadas);
        System.out.println("Valor por hora trabajada: "+valorPorHoras);
        System.out.println("Resumen semanal calculado:"+resumenSemanal);

    }
}

