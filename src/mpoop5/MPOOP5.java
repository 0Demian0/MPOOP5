/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mpoop5;

/**
 *
 * @author A2
 */
public class MPOOP5 {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Circulos cir1 = new Circulos();
    //cir1.radio=5;
    cir1.setRadio(5);
    System.out.println(cir1.getRadio());
    cir1.area();
    cir1.perimetro();
    System.out.println(cir1.toString());
    System.out.println(cir1); 
    
        System.out.println("###############");
    Circulos cir2=new Circulos();
    cir2.setRadio(-15);
        System.out.println(cir2);
        
    System.out.println("#########");    
    Coche coche=new Coche();    
    System.out.println(coche);
        
    System.out.println("##########");
    Persona per1=new Persona();
    per1.setNombre("Panchito");
    per1.setApellido("Lopez");
    //per1.setNacimiento(fNacimiento);
    System.out.println(per1);
    Fecha fecha=new Fecha(6,07,2001);
    per1.setfNacimiento(fecha);
    System.out.println(per1);
    
        System.out.println("############");
    Persona per2=new Persona();
    per2.setNombre("Juanito");
    per2.setApellido("Aguilar");
    per2.setfNacimiento(new Fecha(15,06,2002));
    System.out.println(per2);
    
    System.out.println("#########");
    Persona per3=new Persona("Alan","Matinez",new Fecha(16,02,2002));
    System.out.println(per3);
    
    System.out.println("###########");
    Persona per4=new Persona("Sofia","Vazquez",12,9,1999);
    System.out.println(per4);
    }
}
