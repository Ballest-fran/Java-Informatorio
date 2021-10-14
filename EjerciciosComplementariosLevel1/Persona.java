package EjerciciosComplementariosLevel1;
public class Persona{
    //Declaracion de atributos, fijarse que se los pone como privados para que no se pueda acceder a ellos directamente
    private String nomYApell;
    private int edad;
    private String direc;
    private String ciudad;

    //creacion de seteres de los atributos
    public String getnomYApell(){
        return nomYApell;
    }    
    public int getedad(){
        return edad;
    }
    public String getdirec(){
        return direc;
    }
    public String getciudad(){
        return ciudad;
    }

    //creacion de seteres de los atributos
    public void setnomYApell(String nomYApell){
        this.nomYApell=nomYApell;
    }
    public void setedad(int edad){
        this.edad=edad;
    }
    public void setdirec(String direc){
        this.direc=direc;
    }
    public void setciudad(String ciudad){
        this.ciudad=ciudad;
    }
}
//Recordar que para acceder a cualquiera de estos tenemos que hacer: ObjetoInstanciado.metodo();