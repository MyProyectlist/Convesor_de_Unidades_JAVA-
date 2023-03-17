/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.conversorunidades;



/**
 *
 * @author solgaleo
 */
public class temperatura {
    
    public double gradosCaF(double valor){
        return (valor * 9/5) + 32;
    }
    
    public double gradosCaK(double valor){
        return valor + 273.15 ;
    }
    
    public double gradosFaC(double valor){
        return (valor - 32) * 5/9  ;
    }
    
    public double gradosFaK(double valor){
        return (valor - 32) * 5/9 + 273.15 ;
    }
    
    public double gradosKaC(double valor){
        return valor - 273.15 ;
    }
    
    public double gradosKaF(double valor){
        return (valor - 273.15) * 9/5 + 32 ;
    }
    
    /*
    Celcius (°C)
    Farenheit (°F)
    Kelvin (°K)
    */
    
    public double selector(Double valor, String gradoEntrada, String GradoSalida){
        
        if("Celcius (°C)".equals(gradoEntrada) && "Farenheit (°F)".equals(GradoSalida) ){
            return this.gradosCaF(valor);
        }
        else if("Celcius (°C)".equals(gradoEntrada) && "Kelvin (°K)".equals(GradoSalida) ){
            return this.gradosCaK(valor);
        }
        else if("Farenheit (°F)".equals(gradoEntrada) && "Celcius (°C)".equals(GradoSalida) ){
            return this.gradosFaC(valor);
        }
        else if("Farenheit (°F)".equals(gradoEntrada) && "Kelvin (°K)".equals(GradoSalida) ){
            return this.gradosFaK(valor);
        }
        else if("Kelvin (°K)".equals(gradoEntrada) && "Celcius (°C)".equals(GradoSalida) ){
            return this.gradosKaC(valor);
        }
        else if("Kelvin (°K)".equals(gradoEntrada) && "Farenheit (°F)".equals(GradoSalida) ){
            return this.gradosKaF(valor);
        }
        return valor;
        
    }
    
}
