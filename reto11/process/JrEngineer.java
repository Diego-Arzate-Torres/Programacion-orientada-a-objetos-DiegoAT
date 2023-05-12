package reto11.process;
import reto11.ui.Programmer;

public class JrEngineer extends Employee implements Programmer {

    /**Atributos
     * Este se encarga de darle las caracteristicas al objeto "lenguages"
     */
    private String lenguages;
    private String RFC;
    /**Constructores
     * Este constructor se encarga al igual que los anteriores de manejar distintos datos, con la diferencia de que este maneja el atributo "lenguages" asi como de darle un uso, el cual es dar a conocer los lenguajes que maneja
     */
    public JrEngineer() {
    }

    public JrEngineer(String name, String lastname, String RFC_ ,int age, int telefoneNum, int socialSecurityNum, String lenguages_, int timeInCompany) {
        super(name, lastname, age, telefoneNum, socialSecurityNum);
        lenguages = lenguages_;
        RFC = RFC_;
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


    public String getRFC() {
        return getRFC();
            }
            public void setRFC(String RFC1) { this.RFC = RFC1;}

    @Override
    public int getTimeInCompany() {
        return super.getTimeInCompany();
    }
}