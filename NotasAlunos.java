package br.com.aluno;

import java.util.Scanner;

/**
 * @author marcelo
 */

public class NotasAlunos {

    public static void main(String args[]){

        Scanner input = new Scanner(System.in);
        double nota1, nota2, nota3, nota4, media;

        System.out.printf("Informe a primeira nota: ");
        nota1 = input.nextDouble();

        System.out.printf("Informe a segunda nota: ");
        nota2 = input.nextDouble();

        System.out.printf("Informe a terceira nota: ");
        nota3 = input.nextDouble();

        System.out.printf("Informe a quarta nota: ");
        nota4 = input.nextDouble();

        media = ( nota1 + nota2 + nota3 + nota4)/4;

        if ( media >= 7){
            System.out.printf("APROVADO");
        }else if (media >= 5){
            System.out.printf("RECUPERAÇÃO");
        } else {
            System.out.printf("REPROVADO");
        }

    }


}
