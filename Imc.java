
import java.util.List;

public abstract class Imc {
    protected double peso_Persona;
    protected double altura_Persona;
    protected int edad_Persona;
    protected User Usuario_Name;
    protected String Date;
    List<User> Usuarios_Calculados;

    public abstract double  Calcularimc();
    
}
