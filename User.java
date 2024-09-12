public class User extends Imc {
    private String name;
    private String last_name;
    private int ID;
    private String email;
    private  String gener;

    public User(){

    }

    public User(int ID, String email, String gener, String last_name, String name) {
        this.ID = ID;
        this.email = email;
        this.gener = gener;
        this.last_name = last_name;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGener() {
        return gener;
    }

    public void setGener(String gener) {
        this.gener = gener;
    }

    @Override
    public double Calcularimc() {
       double resultado = peso_Persona / (altura_Persona * altura_Persona);
       return resultado;
    }

    

}
