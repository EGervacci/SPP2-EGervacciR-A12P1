/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp2.imc;

import java.util.Scanner;
import javax.swing.JOptionPane;
/**
 *
 * @author usuario
 */
public class SPP2IMC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double estatura = solicitaDouble("Introduzca su estatura (m)");
        double peso = solicitaDouble("Introduzca su peso (kg)");
        
        double imc = peso / Math.pow(estatura,2);
        
        JOptionPane.showMessageDialog (null, "Su IMC es igual a: " + imc);
    }
    public static double solicitaDouble(String mensaje){
        Scanner kb = new Scanner (System.in);
        String dato;
        double num = 0;
        boolean flag;
        do{
            try{
            dato = JOptionPane.showInputDialog (null, mensaje);
            num = Double.parseDouble(dato);
            flag=false;
            }catch (Exception ex) {
                JOptionPane.showMessageDialog (null, "Error");
                flag=true;
                } 
        } while (flag); 
        return num;
    }
}
