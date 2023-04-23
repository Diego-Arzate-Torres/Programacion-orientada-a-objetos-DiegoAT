package reto11.process;
import reto11.ui.Interviewer;

public class HR extends Employee implements Interviewer {

    /**Atributos
     * Este atributo se encarga de brindar una caracteristica tipo int a "numOfEmployesHired"
     */
    private int numOfEmployesHired;

    /**Constructores
     * Este es similar a los anteriores, con la caracteristica de que este maneja el atributo "numOfEmployesHired"
     */
    public HR() {
    }

    public HR(String nombre, String apellido, int edad, int numeroTelefono, int numSeguroSocial, int numOfEmployesHired) {
        super(nombre, apellido, edad, numeroTelefono, numSeguroSocial);
        this.numOfEmployesHired = numOfEmployesHired;
    }

    //Metodos
    @Override
    public void work(){

    }

    @Override
    public void interview() {

    }


    /**Getters y Setters
     *Este se encarga de ofrecer e implantar el atributo anteriormente mencionado a todas aquellas clases que lo requieran
     */
    public int getNumOfEmployesHired() {
        return numOfEmployesHired;
    }

    public void setNumOfEmployesHired(int numOfEmployesHired) {
        this.numOfEmployesHired = numOfEmployesHired;
    }
}