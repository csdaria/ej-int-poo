/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package posnet;

/**
 *
 * @author 1daw
 */
public class Ticket {
    String nombreApellido;
    double montoPorCuota;
    double montoTotal;
    
    /**
     * 
     * @param nombreApellido
     * @param montoTotal
     * @param montoPorCuota 
     */
    
    public Ticket(String nombreApellido, double montoTotal, double montoPorCuota){
        this.nombreApellido=nombreApellido;
        this.montoTotal=montoTotal;
        this.montoPorCuota=montoPorCuota;
    }
    
    /**
     * 
     * @return ticket con los detalles de la compra
     */
    
    @Override
    public String toString() {
        return "Ticket{" + "nombreApellido=" + nombreApellido + ", montoPorCuota=" + montoPorCuota + ", montoTotal=" + montoTotal + '}';
    }
   
}
