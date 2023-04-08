package reto10.process;
public abstract class Employee {

    /**
     *Atributos: estos se encargan de darle un significado a los objetos, asi como que tipo de datos van a manejar
     */

    private String name;
    private String lastName;
    private int age;
    private int telefoneNum;
    private int socialSecurityNum;
    private int timeInCompany;


    /**Constructores
     * Estos se encargan de administrar los datos que se le brindan al programa
     */
    public Employee() {
    }

    public Employee(String name, String lastName, int age, int telefoneNum, int socialSecurityNum) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.telefoneNum = telefoneNum;
        this.socialSecurityNum = socialSecurityNum;
    }

    /**Metodos
     * Este metodo se encarga de "trabajar" en todas aquellas clases en la que es llamado
     */
    public abstract void work();


    /**Getters y Setters
     *Estos se encargan de brindar y obtener los datos dependiendo de los atributos a los que se les asigna
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getTelefoneNum() {
        return telefoneNum;
    }

    public void setTelefoneNum(int telefoneNum) {
        this.telefoneNum = telefoneNum;
    }

    public int getSocialSecurityNum() {
        return socialSecurityNum;
    }

    public void setSocialSecurityNum(int socialSecurityNum) {
        this.socialSecurityNum = socialSecurityNum;
    }
    public int getTimeInCompany() {
        return timeInCompany;
    }

    public void setTimeInCompany(int timeInCompany) {
        this.timeInCompany = timeInCompany;
    }
}
