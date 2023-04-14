package reto10.process;
import reto10.ui.Programmer;

public class JrEngineer extends Employee implements Programmer {

    /**Atributos
     * Este se encarga de darle las caracteristicas al objeto "lenguages"
     */
    private String lenguages;

    /**Constructores
     * Este constructor se encarga al igual que los anteriores de manejar distintos datos, con la diferencia de que este maneja el atributo "lenguages" asi como de darle un uso, el cual es dar a conocer los lenguajes que maneja
     */
    public JrEngineer() {
    }

    public JrEngineer(String name, String lastname, int age, int telefoneNum, int socialSecurityNum, String lenguages, int timeInCompany) {
        super(name, lastname, age, telefoneNum, socialSecurityNum);
        this.lenguages = lenguages;
    }

    /**Metodos
     * Estos a diferencia de los anteriores, si le da uso a los metodos, el cual en este caso es imprimir dos textos
     */
    @Override
    public void work(){
        System.out.println("Se estresa trabajando");
    }

    @Override
    public void program() {
        System.out.println("bip boop beep boooop");
    }


    /**Getters y Setters
     * Estos se encargan de ofrecer y dar los valores de Lenguages
     * @return
     */
    public String getKnownLenguages() {
        return lenguages;
    }

    public void setKnownLenguages(String lenguajesConocidos) {
        this.lenguages = lenguajesConocidos;
    }

    @Override
    public int getTimeInCompany() {
        return super.getTimeInCompany();
    }
}