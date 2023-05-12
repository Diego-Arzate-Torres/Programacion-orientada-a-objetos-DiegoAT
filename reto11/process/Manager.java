package reto11.process;
import reto11.ui.Interviewer;

public class Manager extends Employee implements Interviewer {

    /**Atributos
     * Este se encarga de brindarle caracteristicas al objeto "budget"
     */
    private int budget;

    /**Constructores
     * Este al igual que los anteriores se encarga de manejar los distintos datos que se brindan, cola especial diferencia de que en este caso se hace uso del atributa creado
     */
    public Manager() {
    }

    public Manager(String name, String lastName, int age, int phoneNum, int socialSecurityNum, int budget) {
        super(name, lastName, age, phoneNum, socialSecurityNum);
        this.budget = budget;
    }

    /**Metodos
     * Estos se hacen uso ya que estos son empleados
     */
    @Override
    public void work(){

    }

    @Override
    public void interview() {

    }

    /**Getters y Setters
     *Esos se encargan de brindar y ofrecer el atributo "budget" a las clases que lo usen
     */
    public int getBudget() {
        return budget;
    }

    public void setBudget(int budget) {
        this.budget = budget;
    }
}