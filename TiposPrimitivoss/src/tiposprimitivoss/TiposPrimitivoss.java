/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiposprimitivoss;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class TiposPrimitivoss {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner (System.in);
        System.out.print("Digite o nome do aluno:");
        String nome = teclado.nextLine();
        System.out.println("Digite a nota do aluno:");
        float nota = teclado.nextFloat();
        System.out.format("  A nota de %s é %.1f \n" , nome, nota);
        teclado.next
    }
    
}
