/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package banco3;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author César
 */
public class Cliente implements Serializable{
     private String nombre, apellidos;  
     private String direccion, localidad;   
     private Date fNacimiento;
       Cliente(String aNombre, String aApellidos, String aDireccion, String aLocalidad, Date aFNacimiento){
         nombre = aNombre;   
         apellidos = aApellidos;     
         direccion = aDireccion;    
         localidad = aLocalidad;   
         fNacimiento = aFNacimiento;   
     }
    public  String nombreCompleto() { return nombre + " " + apellidos; }   
    public String direccionCompleta() { return direccion + ", " + localidad; }

}
