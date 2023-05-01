package reto12.process;

public class CEO extends Manager{

    /**Atributos
     * Este atributo se encarga de darle la caracteristicas al objeto "time in command"
     */
    private int timeInCommand;

    /**Constructores
     * Este constructor se encarga de traer todos los datos recolectados y organizarlo
     */
    public CEO() {
    }

    public CEO(String nombre, String apellido, int edad, int numeroTelefono, int numeroSeguroSocial, int presupuesto, int timeInCommand) {
        super(nombre, apellido, edad, numeroTelefono, numeroSeguroSocial, presupuesto);
        this.timeInCommand = timeInCommand;
    }

    /**Metodos
     * Esta clase tiene un nuevo metodo el cual tiene la peculiaridade hacer que aquellas clases con las que este relacionado puedan dar entrevistas
     */
    @Override
    public void work(){

    }

    @Override
    public void interview() {

    }


    /**Getters y Setters
     * Estos se encargan de establecer y brindar el valor de "time in command" a aquellas clases que lo necesiten
     *
     */
    public int getTimeInCommand() {
        return timeInCommand;
    }

    public void setTimeInCommand(int timeInCommand) {
        this.timeInCommand = timeInCommand;
    }
}