/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package revisao;

import java.text.DecimalFormat;
import java.util.Scanner;


/**
 *
 * @author Mirian Marcio Diogo
 */
public class Revisao {

    
    public static void main(String[] args) {
        /*
        double a, b, x, y;
        a = 8;
        b = 2;
        x = Math.pow(a,b) / (a+b)* -1;
        y = x / (a/b) * 2 *b;
        System.out.println("x: " +x + "-y: " + y);
       
        -6.4
*/
        
        Scanner scan = new Scanner(System.in);

        DecimalFormat f = new DecimalFormat ("0.00");
        double pao, broa, arrecadado, porcPoupanca;
        pao = 0.12;
        broa = 1.50;
        
        System.out.println("Digite a quantidade de paes vendidos: ");
        double quantPao = scan.nextDouble();
        
        System.out.println("Digite a quantidade de broas vendidas: ");
        double quantBroa = scan.nextDouble();
        
        arrecadado = (quantPao * pao) + (quantBroa * broa);
        porcPoupanca = arrecadado * 0.1;
        
        System.out.println("Arrecadacao do dia: R$" + f.format(arrecadado));
        System.out.println("Porcentagem da poupanca: R$" + f.format(porcPoupanca));
        
    }
    
}
