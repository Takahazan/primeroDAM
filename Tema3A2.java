/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tema3a2;

import java.util.Scanner;

/**
 *
 * @author Takahazan
 */
public class Tema3A2 {
    public static void main(String[] args) {
    
        //entrada de datos
        Scanner entPais = new Scanner(System.in);
        Scanner entHortaliza = new Scanner(System.in);
    
        int spainTons = 0;
        int franceTons = 0;
        int germanyTons = 0;
        String pais = "";
    
        while(!pais.equals("@") {
            System.out.println("Introduce el país de referencia (España, Francia o Alemania). PARA ACABAR EL PROGRAMA, USA @");
            pais = entPais.nextLine();
    
            switch(pais) {
                case "España":
                    System.out.println("Introduce la hortaliza a contar (Tomate, Patata, Espinaca)");
                    spainTons += entHortaliza.nextLine();
                    break;

                case "Francia":
                    System.out.println("Introduce la hortaliza a contar (Tomate, Patata, Espinaca)");
                    franceTons += entHortaliza.nextLine();
                    break;

                case "Alemania": 
                    System.out.println("Introduce la hortaliza a contar (Tomate, Patata, Espinaca)");
                    germanyTons += entHortaliza.nextLine();
                    break;

                case "@"
                    break;

                default:
                    System.out.println("Ese país no existe");                    
            }        
        }

        System.out.println("Calculando el país que más ha vendido...");
       
        if (spainTons > franceTons && spainTons > germanyTons) {
            System.out.println("El país que más ha venido ha sido " + España + " con " + spainTons + " toneladas.");
            System.exit(0);
            
        } else if (franceTons > spainTons && franceTons > germanyTons) {
            System.out.println("El país que más ha venido ha sido " + Francia + " con " + franceTons + " toneladas.");
            System.exit(0);
            
        } else if  (totalToneladaAL > spainTons && germanyTons > franceTons) {
            System.out.println("El país que más ha venido ha sido " + Alemania + " con " + germanyTons + " toneladas.");
            System.exit(0);     
            
        } else if (noHortaliza == false && germanyTons == 0 && franceTons == 0 && spainTons == 0) {
            System.out.println("Terminando programa sin resultados...");
            System.exit(0);	
        }
    } 
}
