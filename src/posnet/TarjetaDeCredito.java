/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package posnet;

/**
 *
 * @author 1daw
 */


public class TarjetaDeCredito {
    private String numero;
    private double saldo;
    private String entidadBancaria;
    private EntidadFinanciera entidadFinanciera;
    private Persona titular;
    
    /**
     * 
     * @param numero
     * @param entidadBancaria
     * @param par
     * @param titular
     * @param entidadFinanciera 
     */
    
    public TarjetaDeCredito(String numero, String entidadBancaria, int par, Persona titular, EntidadFinanciera entidadFinanciera) {
        this.numero = numero;
        this.saldo = saldo;
        this.entidadBancaria = entidadBancaria;
        this.entidadFinanciera = entidadFinanciera;
        this.titular = titular;
    }
    
    /**
     * 
     * @return información sobre la tarjeta de crédito
     */

    @Override
    public String toString() {
        return "TarjetaDeCredito{" + "numero=" + numero + ", saldo=" + saldo + ", entidadFinanciera=" + entidadFinanciera + ", titular=" + titular + '}';
    }
    
    /**
     * 
     * @param montoFinal
     * @return comprueba si hay saldo disponible
     */
    
    public boolean tieneSaldoDisponible(double montoFinal){
        return saldo>=montoFinal;
    }
    
    /**
     * 
     * @param monto descuenta de la tarjeta la cantidad a cobrar
     */
    
    public void descontar(double monto){
        saldo=saldo-monto;
    }
    
    /**
     * 
     * @return devuelve el nombre completo del titular de la tarjeta
     */
    
    public String nombreCompletoDelTitular(){
        return titular.nombreCompleto();
    }
}
