/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.polimorfismo;

/**
 *
 * @author sebac
 */
public abstract class Notificacion {
    
    protected String destinatario;

    public Notificacion(String destinatario) {
        this.destinatario = destinatario;
    }

    public abstract void enviar(String mensaje);

}
