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
        
        Notificacion notifEmail = new NotifEmail("Juan");
        Notificacion notifSms = new NotifSms("Juan");
        Notificacion notifWhatsApp = new NotifWhatsApp("Juan");
        
        
        notifEmail.enviar("Producto x con bajo stock");
        notifSms.enviar("Producto x con bajo stock");
        notifWhatsApp.enviar("Producto x con bajo stock");
        
    }
}
