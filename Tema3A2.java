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
       
    //paises (S: España, F: Francia, A: Alemania    
    String España = "España";
    String Francia = "Francia";
    String Alemania = "Alemania";
    
    //hortaliza (T: Tomate, P: Patata, E: Espinaca
    String Tomate;
    String Patata;
    String Espinaca;
    
    //categorías
    String pais;
    String hortaliza;
    
    //Toneladas totales por pais
    int totalToneladaES = 0;
    int totalToneladaFR = 0;
    int totalToneladaAL = 0;
    
    boolean ganadorEspaña;
    boolean ganadorFrancia;
    boolean ganadorAlemania;
    
    
    //comprobadores de paises
    
    boolean pES = false;
    boolean pFR = false;
    boolean pAL = false;
    boolean noHortaliza = false;
    
    //control sobre el programa
    boolean terminar = false;
    
    //entrada de datos
    Scanner entPais = new Scanner(System.in);
    Scanner entHortaliza = new Scanner(System.in);
    Scanner entToneladasES = new Scanner(System.in);
    Scanner entToneladasFR = new Scanner(System.in);
    Scanner entToneladasAL = new Scanner(System.in);
    
    do{
    	do{
    noHortaliza = false;
    System.out.println("Introduce el país de referencia (España, Francia o Alemania). PARA ACABAR EL PROGRAMA, USA @");
    pais = entPais.nextLine();
    
    switch ( pais ){
        
        case "España":
            pES = true;
            break;
        case "Francia":
            pFR = true;
            break;
        case "Alemania":
            pAL = true;
            break;
        case "@":
            noHortaliza = false;
            terminar = true;
            System.out.println("Calculando el país que más ha vendido...");
           
            if (totalToneladaES > totalToneladaFR && totalToneladaES > totalToneladaAL){
                ganadorEspaña = true;
                System.out.println("El país que más ha venido ha sido " + España);
                System.exit(0);
            }
            
            else if (totalToneladaFR > totalToneladaES && totalToneladaFR > totalToneladaAL){
                ganadorFrancia = true;
                System.out.println("El país que más ha venido ha sido " + Francia);
                System.exit(0);
            }
            else if  (totalToneladaAL > totalToneladaES && totalToneladaAL > totalToneladaFR){
                ganadorAlemania = true;
                System.out.println("El país que más ha venido ha sido " + Alemania);
                System.exit(0);
             
            }
            else if (noHortaliza == false && totalToneladaAL == 0 && totalToneladaFR == 0 && totalToneladaES == 0) {
            	System.out.println("Terminando programa sin resultados...");
            	System.exit(0);	
            }
          
            default:
            System.out.println("Ese país no existe.");
            }
 
    } while (pES == false && pFR == false && pAL == false); 
   
        do{
    noHortaliza = true;
    System.out.println("Introduce la hortaliza a contar (Tomate, Patata, Espinaca)");
    hortaliza = entHortaliza.nextLine();
    
        switch ( hortaliza ){
            case "Tomate":
                if (pES == true){
                    System.out.println("Introduce el número de toneladas. SOLO NÚMEROS");
                    totalToneladaES = totalToneladaES + entToneladasES.nextInt();
                    noHortaliza = false;
                    pES = false;
                }
                else if (pFR == true){
                    System.out.println("Introduce el número de toneladas. SOLO NÚMEROS");
                    totalToneladaFR = totalToneladaFR + entToneladasFR.nextInt();
                    noHortaliza = false;
                    pFR = false;
                }
                
                else if (pAL == true){
                    System.out.println("Introduce el número de toneladas. SOLO NÚMEROS");
                    totalToneladaAL = totalToneladaAL + entToneladasAL.nextInt();
                    noHortaliza = false;
                    pAL = false;
                }
             
                break;
            case "Patata":
                  if (pES == true){
                    System.out.println("Introduce el número de toneladas. SOLO NÚMEROS");
                    totalToneladaES = totalToneladaES + entToneladasES.nextInt();
                    noHortaliza = false;
                    pES = false;
                }
                else if (pFR == true){
                    System.out.println("Introduce el número de toneladas. SOLO NÚMEROS");
                    totalToneladaFR = totalToneladaFR + entToneladasFR.nextInt();
                    noHortaliza = false;
                    pFR = false;
                }
                
                else if (pAL == true){
                    System.out.println("Introduce el número de toneladas. SOLO NÚMEROS");
                    totalToneladaAL = totalToneladaAL + entToneladasAL.nextInt();
                    noHortaliza = false;
                    pAL = false;
                }
                
                break;
            case "Espinaca":
                   if (pES == true){
                    System.out.println("Introduce el número de toneladas. SOLO NÚMEROS");
                    totalToneladaES = totalToneladaES + entToneladasES.nextInt();
                    noHortaliza = false;
                    pES = false;
                }
                else if (pFR == true){
                    System.out.println("Introduce el número de toneladas. SOLO NÚMEROS");
                    totalToneladaFR = totalToneladaFR + entToneladasFR.nextInt();
                    noHortaliza = false;
                    pFR = false;
                }
                
                else if (pAL == true){
                    System.out.println("Introduce el número de toneladas. SOLO NÚMEROS");
                    totalToneladaAL = totalToneladaAL + entToneladasAL.nextInt();
                    noHortaliza = false;
                    pAL = false;
                }
                break;
            default:
                noHortaliza = false;
                System.out.println("Esa hortaliza no existe.");
        }
        }while (noHortaliza == false && (pES == true || pFR == true || pAL == true));
    	}while (noHortaliza == false && (pES == false || pFR == false || pAL == false)); 
    } 
}
