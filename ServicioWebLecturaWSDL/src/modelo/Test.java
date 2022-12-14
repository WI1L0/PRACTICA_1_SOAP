/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import sw.ConversionSW;
import sw.ConversionSW_Service;

/**
 *
 * @author MAWIL
 */
public class Test {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
        ConversionSW_Service service = new ConversionSW_Service();
        ConversionSW port = service.getConversionSWPort();
        
        System.out.println(port.hello("William") + "  -> hello \n");
        
        System.out.println(port.npotencia(5, 2) + " -> Potencia");
        System.out.println(port.parIMPAR(8) + " -> Par o Impar");
        System.out.println(port.diccionario("java") + " -> Diccionario \n");
        
        System.out.println(port.suma(5, 4) + "  -> suma ");
        System.out.println(port.resta(8, 4) + "  -> resta ");
        System.out.println(port.multiplicacion(6, 3) + "  -> multiplicacion ");
        System.out.println(port.division(10, 2) + "  -> division ");
        
    }
}
