/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vetor_soma;


import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Humb3rt0 F0rt3s
 */

/**
 * CRIAR UM PROGRAMA QUE RECEBA 5 VALORES E 4 OPERADORES
 * E APRESENTE O RESULTADO DA SOMA ENTRE ELES
 * 
 * @author Humb3rt0 F0rt3s
 */
public class Vetor_soma {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //DECLARAÇÃO DOS VETORES
        int [] valores = new int[5];
        String [] operadores = new String [4];
        float  resultado = 0;
        
        //VARIAVEL PARA ENTRADA DE DADOS
        Scanner entrada = new Scanner(System.in);
        
        //float soma = 0;
        System.out.println("====================================");
        System.out.println("===== INSIRA OS NÚMEROS NO VETOR =====");
        System.out.println("====================================");
        System.out.println("");
        
        //CICLO PARA O PREENCHIMENTO DO VETOR VALORES
        
        for (int i = 0; i < valores.length; i++) {
            
            System.out.print("Insira o "+ (i + 1) + "º número: ");
            valores [i] = entrada.nextInt();
        }
        System.out.println("====================================");
        System.out.println("======= INSIRA OS OPERADORES =======");
        System.out.println("====================================");
        System.out.println("");
        
        //PREENCHENDO OS OPERADORES
        
        for (int j = 0; j < operadores.length; j++){
            
            System.out.print("Insira o "+ (j + 1)+"º  Operador: ");
            operadores[j] = entrada.next();
        } 
        
        //TRABALHANDO COM A PRIMEIRA POSIÇÃO DO VETOR
        if (operadores[0].equalsIgnoreCase("*")) {
            resultado = valores[0] * valores[1];
            }else if (operadores[1].equalsIgnoreCase("*")){
                resultado = valores[1] * valores[2];
            }else if(operadores[3].equalsIgnoreCase("*")){
                resultado = valores[2] * valores [3];
            }else if(operadores[4].equalsIgnoreCase("*")){
                resultado = valores[3] * valores [4];
            }
        if (operadores[0].equalsIgnoreCase("/")) {
                resultado = valores[0] / valores[1];
            }else if (operadores[1].equalsIgnoreCase("/")){
                resultado = valores[1] / valores[2];
            }else if(operadores[3].equalsIgnoreCase("/")){
                resultado = valores[2] / valores [3];
            }else if(operadores[4].equalsIgnoreCase("/")){
                resultado = valores[3] / valores [4];
            }else if(operadores [0].equalsIgnoreCase("+")){
                resultado = valores[0] + valores [1];
            }else if (operadores[0].equalsIgnoreCase("-")){
                resultado = valores[0] - valores [1];
            }else if (operadores [1].equalsIgnoreCase("+")){
                resultado += valores[2];
            }else if (operadores [1].equalsIgnoreCase("-")){
                resultado -= valores[2];
            }else if(operadores [2].equalsIgnoreCase("-")){
                resultado -= valores[3];
            } else if(operadores [2].equalsIgnoreCase("+")){
                resultado += valores[3];
            } else if (operadores [3].equalsIgnoreCase("+")){
                resultado += valores[4];
            }else if (operadores [3].equalsIgnoreCase("-")){
                resultado -= valores[4];
            }
        
        //30 LINHAS DE CÓDIGO PARA AS CONDIÇÕES, OU SEJA, LÓGICA DO PROGRAMA
     
        //Mostrando os valores inseridos e o resultado da soma dos valores do vetor
        System.out.println("==========================================");
        System.out.println("==========================================");
        System.out.println("INSERIO OS SEGUINTES VALORES: "+ Arrays.toString(valores));
        System.out.println("");
        System.out.println("INSERIO OS SEGUINTES OPERADORES: "+ Arrays.toString(operadores));
        System.out.println("==========================================");
        System.out.println("==========================================");
        System.out.println("RESULTADO DA SOMA DOS 5 VALORES SEM PRIORIDADE DE OPERAÇÃO: "+ resultado);
    }
}
