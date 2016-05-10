/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package banco3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Date;

/**
 *
 * @author César
 */
public class Banco3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
      /*  Cliente unCliente = new Cliente("Jesús", "López", "Libertad", "Villamuriel",new Date(10,12,1986) ); 
       Cuenta unaCuenta = new Cuenta(654321l, unCliente, 0.25f);
       
       unaCuenta.ingreso(2345);
       unaCuenta.reintegro(321);
         
       unaCuenta.ingreso(145);
       unaCuenta.reintegro(320);
         
       unaCuenta.ingreso(1550);
       unaCuenta.reintegro(210);
       
       
       System.out.println(unCliente.nombreCompleto() + " tiene la cuenta: ");
       unaCuenta.verCuenta();
       
       unaCuenta.salvar();
       */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long nc;
        float mi; 
        try {  
            System.out.println("Introduzca núm. de de cuenta: ");  
            nc = Long.parseLong(br.readLine());
            System.out.println("Introduzca importe a retirar:");   
            mi = Float.parseFloat(br.readLine());
        } 
        catch(Exception e) {    
            System.out.println("Error al leer datos");   
            return;
        }
        Cuenta c; 
        try {   
            c = new Cuenta(nc);
        }
        catch(Exception e) {   
            System.out.println("Imposible recuperar cuenta");    
            return;
        }
        if (c.leerSaldo() < mi)   
            System.out.println("Saldo insuficiente");
        else     
            c.reintegro(mi); 
        c.salvar();
        c.verCuenta();
         System.out.println("\nPesetas: "+Cuenta.eurosAPesetas(c.leerSaldo()));
    }
    
}
