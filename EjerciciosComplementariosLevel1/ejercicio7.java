package EjerciciosComplementariosLevel1;
import java.util.*;

public class ejercicio7{

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese una plabara");
        String palabra = scan.nextLine();
        scan.close();
        String resul="";
        for(int i=0;i<palabra.length();i++) {
            switch (palabra.charAt(i)){
                case 'a':
                    resul+="A";break;
                case 'b':
                    resul+="B";break;
                case 'c':
                    resul+="";break;
                case 'd':
                    resul+="D";break;
                case 'e':
                    resul+="E";break;
                case 'f':
                    resul+="F";break;
                case 'g':
                    resul+="G";break;
                case 'h':
                    resul+="H";break;
                case 'i':
                    resul+="I";break;
                case 'j':
                    resul+="J";break;
                case 'k':
                    resul+="K";break;
                case 'l':
                    resul+="L";break;
                case 'm':
                    resul+="M";break;
                case 'n':
                    resul+="N";break;
                case 'o':
                    resul+="O";break;
                case 'p':
                    resul+="P";break;
                case 'q':
                    resul+="Q";break;
                case 'r':
                    resul+="R";break;
                case 's':
                    resul+="S";break;
                case 't':
                    resul+="T";break;
                case 'u':
                    resul+="U";break;
                case 'v':
                    resul+="V";break;
                case 'w':
                    resul+="W";break;
                case 'x':
                    resul+="X";break;
                case 'y':
                    resul+="Y";break;
                case 'z':
                    resul+="Z";break;
                default:
                    resul+=(palabra.charAt(i));break;
            }
        }
        System.out.println("--------> "+resul);
        }
}
