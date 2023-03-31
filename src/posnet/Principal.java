/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package posnet;

/**
 *
 * @author 1daw
 */




/**
 * 
 * clase principal con los tests de prueba para comprobar que todo funciona correctamente
 */
public class Principal {
     public static void main(String[] args) {
        // TODO code application logic here
        Posnet posnet=new Posnet();
        Persona p = new Persona("45678123", "Pepa", "Gomez", "111111111", "pepe@fakemail.com");
        TarjetaDeCredito t= new TarjetaDeCredito("FakeBank", "1222222222", 15000, p , EntidadFinanciera.BIRZA);
       
         System.out.println("Tarjeta antes del pago: ");
         System.out.println(t);
         
         System.out.println("Ticket tras pagar... ");
         Ticket ticketGenerado=posnet.efectuarPago(t, -10000, 5);
         System.out.println(ticketGenerado);
        
         System.out.println("Tarjeta después del pago");
         System.out.println(t);
         
    }
}
