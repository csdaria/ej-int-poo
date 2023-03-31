/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package posnet;

/**
 *
 * @author 1daw
 */

public class Persona {
    private String dni;
    private String nombre;
    private String apellido;
    private String telefono;
    private String mail;
 
/**
 * 
 * @param dni
 * @param nombre
 * @param apellido
 * @param telefono
 * @param mail 
 */ 
    public Persona(String dni, String nombre, String apellido, String telefono, String mail){
        this.dni=dni;
        this.nombre=nombre;
        this.apellido=apellido;
        this.telefono=telefono;
        this.mail=mail;
    }
/**
 * 
 * @return concatenación de nombre y apellido
 */
    public String nombreCompleto() {
        return nombre + " "+apellido;
    }

}
