package com.mycompany.conversorunidades;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author solgaleo
 */
public class longitudes{

    Map<String, Double> valores = new HashMap<>();
    
    /*
        Metros (m)
        Centrimetros (cm)
        Milimetros (mm)
        Kilometros (Km)
        Pulgadas (in)
        Pies (ft)
        Yardas (yd)
        millas (mi)
    
    */

    public longitudes() {
    this.valores.put("Metros (m)", 1.00);
    this.valores.put("Centimetros (cm)", 100.00);
    this.valores.put("Milimetros (mm)", 1000.00);
    this.valores.put("Kilometros (Km)", 0.001);
    this.valores.put("Pulgadas (in)",39.3701);
    this.valores.put("Pies (ft)", 3.28084);
    this.valores.put("Yardas (yd)", 1.094);
    this.valores.put("millas (mi)", 0.000621371);
    
    
    }  
    
    public double getValores(String unidad) {
        return valores.get(unidad);
    }

    public void setValores(String unidad, double valor) {
        this.valores.put(unidad,valor);
    }
    
    //                 convertir         x     unidad1   en     unidad2
    public double convertirEn(double valor, String unidad1 , String unidad2){
        return valor * this.valores.get(unidad2)/this.valores.get(unidad1);
    }
}
    
    
