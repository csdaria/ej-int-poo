/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package posnet;

/**
 *
 * @author 1daw
 */
public class Posnet {
     public static final double RECARGO_POR_CUOTA = 0.04;
     public static final int MIN_CANT_CUOTAS = 1;
     public static final int MAX_CANT_CUOTAS = 12;
    /**
     * @param args the command line arguments
     */
     
     /**
      * 
      * @param tarjeta
      * @param montoAAbonar
      * @param cantCuotas
      * @return genera ticket con los detalles del pago
      */
     
     public Ticket efectuarPago(TarjetaDeCredito tarjeta, double montoAAbonar, int cantCuotas){
         
         Ticket ticket=null;
         if(datosValidos(tarjeta, montoAAbonar, cantCuotas)){
             double montoFinal=montoAAbonar+montoAAbonar*recargoSegunCuotas(cantCuotas);
             if(tarjeta.tieneSaldoDisponible(montoFinal)){
                 tarjeta.descontar(montoFinal);
                 String nomApe=tarjeta.nombreCompletoDelTitular();
                 double montoPorCuota=montoFinal/cantCuotas;
                 ticket = new Ticket(nomApe, montoFinal, montoPorCuota);
             }
         }
         
         return ticket;
     }
     
     
     /**
      * 
      * @param tarjeta
      * @param monto
      * @param cant
      * @return booleano indicando si la tarjeta ha sido aprobada o no
      */
         private boolean datosValidos(TarjetaDeCredito tarjeta, double monto, int cant){
             boolean esTarjetaValida=tarjeta!=null;
             boolean esMontoValido=monto>0;
             boolean cantCuotaValida=cant>=MIN_CANT_CUOTAS&&cant<=MAX_CANT_CUOTAS;
             return esTarjetaValida&&esMontoValido&&cantCuotaValida;
             
         }
         
         /**
          * 
          * @param cantCuotas
          * @return recargo a cobrar según el número de cuotas
          */
         
         private double recargoSegunCuotas(int cantCuotas){
             return (cantCuotas-1)*RECARGO_POR_CUOTA;
             /*double calculoSegunCuota=0; //si es 1
                     calculoSegunCuota=1*0.03; //si es 2
                     calculoSegunCuota=2*0.03;*/
         }
     }
    
   
