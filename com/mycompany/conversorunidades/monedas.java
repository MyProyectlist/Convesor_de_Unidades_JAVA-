
package com.mycompany.conversorunidades;

import java.util.HashMap;

/**
 *
 * @author solgaleo
 */

public class monedas {
    
    HashMap<String, Double> monedas= new HashMap<>();

    public monedas() {
        this.monedas.put("Pesos Mexicanos - MXN", 1.00);
        this.monedas.put("Dolar Estadounidense - USD", 17.97);
        this.monedas.put("Euro - EUR", 19.14);
        this.monedas.put("Yen Japones - JPY", 0.13);
    }

    
    
    public void setMonedas(String moneda, Double valor) {
        if(valor >= 0){
            this.monedas.put(moneda, valor);
        }else{
            this.monedas.put(moneda, 0.00);
        }
        
    }
    
    public double getMonedas(String moneda){
        return this.monedas.get(moneda);
    }
    
    public double conversion(double valor, String divisa1, String divisa2){
        return valor * this.getMonedas(divisa1)/this.getMonedas(divisa2);
    }
        
    
}
