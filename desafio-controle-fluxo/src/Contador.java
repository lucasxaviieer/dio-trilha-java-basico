import java.util.Scanner;

import exceptions.ParametrosInvalidosException;

public class Contador {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        Integer parametroUm = sc.nextInt();
        System.out.print("Digite o segundo número: ");
        Integer parametroDois = sc.nextInt();

        try {
            contar(parametroUm, parametroDois);
        } catch (ParametrosInvalidosException e) {
            System.out.println(e.getMessage());
        } finally {
            sc.close();
        }

    }

    public static void contar(Integer parametroUm, Integer parametroDois) throws ParametrosInvalidosException {

        if (parametroUm > parametroDois) {
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
        }

        int contador = parametroDois - parametroUm;

        for (int i = 0; i < contador; i++) {
            System.out.println("Imprimindo o número: " + (i + 1));
        }
    }
}
