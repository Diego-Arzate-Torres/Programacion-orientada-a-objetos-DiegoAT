package reto12.process;

import java.util.Objects;

public abstract class Employee {

    /**
     *Atributos: estos se encargan de darle un significado a los objetos, asi como que tipo de datos van a manejar
     */

    private String name;
    private String lastName;
    private int age;
    private int phoneNum;
    private int socialSecurityNum;
    private int timeInCompany;


    /**Constructores
     * Estos se encargan de administrar los datos que se le brindan al programa
     */
    public Employee() {
    }

    public Employee(String name, String lastName, int age, int phoneNum, int socialSecurityNum) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.phoneNum = phoneNum;
        this.socialSecurityNum = socialSecurityNum;
    }

    /**Metodos
     * Este metodo se encarga de "trabajar" en todas aquellas clases en la que es llamado
     */
    public abstract void work();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return age == employee.age && phoneNum == employee.phoneNum && socialSecurityNum == employee.socialSecurityNum && timeInCompany == employee.timeInCompany && Objects.equals(name, employee.name) && Objects.equals(lastName, employee.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, lastName, age, phoneNum, socialSecurityNum, timeInCompany);
    }

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

    public int getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(int phoneNum) {
        this.phoneNum = phoneNum;
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
