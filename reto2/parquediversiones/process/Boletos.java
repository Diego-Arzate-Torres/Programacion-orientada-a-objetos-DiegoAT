/**
 * Este se encarga de crear la informacion de los boletos, asi como se encarga de realizar la suma de los boletos
 *
 * Bnino se encarga de dar el precio del boleto para ninos
 * BAdulto se encarga de dar el precio del boleto para adultos
 * BINAPAM se encarga de dar el precio del boleto para abuelos con credencial inapam
 * Para los adultos mayores sin credencial se uso el mismo que el BNino, ya que estos tienen el mismo precio
 *
 */


package edu.diego.arzate.torres.reto2.parquediversiones.process;

public class Boletos {

 public static double BNiño = 70;

 public static double BAdulto = 100;

 public static double BINAPAM = 50;

 public static double CalCosto(int numNiño,int numAdulto,int numINAPAM,int numAdultoMayor){

  return (numNiño*BNiño)+(numAdulto*BAdulto)+(numINAPAM*BINAPAM)+(numAdultoMayor*BNiño);
 }



}
