/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.polimorfismo;


/**
 *
 * @author sebac
 */
public class NotifEmail extends Notificacion {
        
    public NotifEmail(String destinatario){
        super(destinatario);
    }
    
        
    @Override
     public void enviar(String mensaje){
         System.out.println("Email enviado al usuario "+destinatario+": "+mensaje);}   
     
     public void enviar(String mensaje , String archivoAdjunto){
        System.out.println("Enviando Email a " + destinatario + ": " + mensaje);
        System.out.println("Archivo adjunto incluido: " + archivoAdjunto);
     }
    
}
