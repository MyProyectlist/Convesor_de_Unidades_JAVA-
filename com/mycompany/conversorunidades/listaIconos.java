/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.conversorunidades;

import java.util.ArrayList;
import javax.swing.ImageIcon;

/**
 *
 * @author solgaleo
 */
public class listaIconos {
    
    ArrayList<String> listaIconos = new ArrayList<>();

    public listaIconos() {
        listaIconos.add("/home/solgaleo/NetBeansProjects/conversorUnidades/src/main/java/imagenesApp/monedas1.png");
        listaIconos.add("/home/solgaleo/NetBeansProjects/conversorUnidades/src/main/java/imagenesApp/lapizRegla.png");
        listaIconos.add("/home/solgaleo/NetBeansProjects/conversorUnidades/src/main/java/imagenesApp/termometro.png");
    }
        
    
    public ImageIcon cambiarIcono(int index){
        switch (index) {
            case 0:
                ImageIcon icono1 = new ImageIcon(listaIconos.get(index));
                return icono1;
            case 1:
                ImageIcon icono2 = new ImageIcon(listaIconos.get(index));
               return icono2;
            case 2:
                ImageIcon icono3 = new ImageIcon(listaIconos.get(index));
                return icono3;
            default:
                break;
        }
        return null;
    }

    
}
