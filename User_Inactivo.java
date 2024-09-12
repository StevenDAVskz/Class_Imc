public class User_Inactivo extends User, Imc{
    protected int Calorias_Consumidas_Dias;

    public User_Inactivo(){

    }

    public User_Inactivo(int Calorias_Consumidas_Dias, int ID, String email, String gener, String last_name, String name) {
        super(ID, email, gener, last_name, name);
        this.Calorias_Consumidas_Dias = Calorias_Consumidas_Dias;
    }


}
