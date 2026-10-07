/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.polimorfismo;


/**
 *
 * @author sebac
 */
public class Polimorfismo {

    public static void main(String[] args) {
        
        Notificacion[] notificaciones = new Notificacion[4];
        
        
        notificaciones[0] = new NotifEmail("juan@gmail.com");
        notificaciones[1] = new NotifSms("3777-548574");
        notificaciones[2] = new NotifWhatsApp("377-548574");
        
        NotifEmail notif = new NotifEmail("marcos@gmail.com");
        
        notif.enviar("Producto x con bajo stock","reporte.pdf");
        
       
        /*        for (Notificacion n : notificaciones) {
            n.enviar("Producto x con bajo stock");
        } */       
        
    }
    
}
