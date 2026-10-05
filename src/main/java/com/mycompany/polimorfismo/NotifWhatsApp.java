/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.polimorfismo;

/**
 *
 * @author sebac
 */
public class NotifWhatsApp extends Notificacion {
    
    public  NotifWhatsApp(String destinatario){
        super(destinatario);
    }
    
        
    @Override
     public void enviar(String mensaje){
          System.out.println("Mensaje de whatsapp enviado al usuario "+destinatario+": "+mensaje);
     }   
    
}
