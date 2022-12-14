/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package servicioweblecturawsdl;

import sw.ConversionSW_Service;
import sw.ConversionSW;

/**
 *
 * @author MAWIL
 */
public class ServicioWebLecturaWSDL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
        ConversionSW_Service conversionSW_Service = new ConversionSW_Service();
        ConversionSW conversionSW = conversionSW_Service.getConversionSWPort();
        System.out.println(conversionSW.hello("William") + "  -> hello ");
        
        //System.out.println(conversionSW.suma(5, 4) + "  -> suma ");
        //System.out.println(conversionSW.resta(8, 4) + "  -> resta ");
        //System.out.println(conversionSW.multiplicacion(6, 3) + "  -> multiplicacion ");
        //System.out.println(conversionSW.division(10, 2) + "  -> division ");
        
        
    }
    
}
