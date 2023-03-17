/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.conversorunidades;

import java.util.ArrayList;


/**
 *
 * @author solgaleo
 */
public class listaOpciones {
    ArrayList<String> OpcionesDivisas = new ArrayList<>();
    ArrayList<String> OpcionesTemperatura= new ArrayList<>();
    ArrayList<String> OpcionesLongitud = new ArrayList<>();
    


    public void listaDivisas(){
        OpcionesDivisas.add( "Pesos Mexicanos - MXN");
        OpcionesDivisas.add("Dolar Estadounidense - USD");
        OpcionesDivisas.add("Euro - EUR");
        OpcionesDivisas.add( "Yen Japones - JPY");
    }
    
    public void listaTemperaturas(){
        OpcionesTemperatura.add( "Celcius (°C)");
        OpcionesTemperatura.add("Farenheit (°F)");
        OpcionesTemperatura.add("Kelvin (°K)");
    }
    
    public void listaLongitudes(){
        OpcionesLongitud.add("Metros (m)");
        OpcionesLongitud.add("Centimetros (cm)");
        OpcionesLongitud.add("Milimetros (mm)");
        OpcionesLongitud.add("Kilometros (Km)");
        OpcionesLongitud.add("Pulgadas (in)");
        OpcionesLongitud.add("Pies (ft)");
        OpcionesLongitud.add("Yardas (yd)");
        OpcionesLongitud.add("millas (mi)");
        

 
    }
    
    public ArrayList cambiarOpciones(int index){
        switch (index) {
            case 0:
                this.OpcionesDivisas.clear();
                this.listaDivisas();
                return OpcionesDivisas;
                
            case 1:
                this.OpcionesLongitud.clear();
                this.listaLongitudes();
                return OpcionesLongitud;
            case 2: 
                this.OpcionesTemperatura.clear();
                this.listaTemperaturas();
                return OpcionesTemperatura;

            default:
                return null;
        }
        
    }
    
    
    
}
