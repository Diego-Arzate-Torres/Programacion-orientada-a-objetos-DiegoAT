package reto12.process;
import reto12.ui.Interviewer;

/**
 * Esta clase hace de la clase Jr e Inteviewer
 */
public class SrEnginner extends JrEngineer implements Interviewer {
    /**
     * Este hace uso de los siguientes atributos
     * @param name
     * @param lastName
     * @param age
     * @param phoneNum
     * @param socialSecurityNum
     * @param lenguages
     * @param timeInCompany
     */
    public SrEnginner( String name, String lastName , String RFC,int age, int phoneNum, int socialSecurityNum, String lenguages, int timeInCompany){
           super(name, lastName, RFC,age, phoneNum, socialSecurityNum, lenguages, timeInCompany);


            }

    /**
     * Este a diferencia de las anteriores si hace uso de los metodos, haciendo que estos tengan que imprimir un texto personalizado, exepto en getter, el cual se encarga de obtener el dato del tiempo en la compañia
     */
    @Override
    public void work(){
        System.out.println("trabajo duro, como un esclavo");
     }
     @Override
    public void program(){
        System.out.println("*bibup bibup nosie*");
     }
     @Override
    public void interview(){
         System.out.println("Te hace preguntas con respecto a programacion, y si le sabes entras :O");
     }
     @Override
     public int getTimeInCompany() {
         return super.getTimeInCompany();
     }
}