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
public class Movimiento implements Serializable {
    private    Date fecha;    
    private char tipo;    
    private float importe;    
    private float saldo;
    public Movimiento(Date aFecha, char aTipo, float aImporte, float aSaldo) {  
        fecha = aFecha; 
        tipo = aTipo; 
        importe = aImporte; 
        saldo = aSaldo;     
    }    
    public void verMovimiento(){
        if (tipo =='I')
            System.out.println(fecha + " Ingreso de " + importe + " saldo: " + saldo);
        else
              System.out.println(fecha + " Reintegro de " + importe + " saldo: " + saldo);
    }
}


