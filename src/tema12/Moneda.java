/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema12;

import java.text.NumberFormat;


public class Moneda {

    public static void main(String[] args) {
        NumberFormat moneda = NumberFormat.getCurrencyInstance();
        String monedaFormateada = moneda.format(1000);
        System.out.println(monedaFormateada);
        // TODO code application logic here
    }
    
}
