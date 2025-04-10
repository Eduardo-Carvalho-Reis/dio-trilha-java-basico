package DesafioControleFluxo;

import java.util.Scanner;

public class Contadador {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um parametro");
        int paramentroUm = scanner.nextInt();
        System.out.println("Digite outro parametro");
        int paramrtroDois = scanner.nextInt();

        try {
            contar(paramentroUm, paramrtroDois);

        } catch (ParametrosInvalidosException e) {
            System.out.println(e.getMessage());
        }
    }
    public static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        if(parametroUm>parametroDois){
            throw new ParametrosInvalidosException();
        }
        int contagem=parametroDois-parametroUm;
        for (int i=0;i<contagem;i++){
            System.out.println(i+1);
        }

    }
}
