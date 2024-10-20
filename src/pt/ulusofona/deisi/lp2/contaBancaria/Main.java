
package pt.ulusofona.deisi.lp2.contaBancaria;


public class Main {
    public static void main(String[] args) {
        // Testar a classe ContaBancaria
        ContaBancaria conta = new ContaBancaria(1000); // Saldo inicial de 1000
        System.out.println("Saldo inicial: " + conta.getSaldoComoString());

        conta.deposita(500); // Depositar 500
        System.out.println("Saldo após depósito: " + conta.getSaldoComoString());

        if (conta.levanta(300)) { // Levantar 300
            System.out.println("Levantamento de 300 realizado.");
        } else {
            System.out.println("Levantamento de 300 falhou.");
        }

        System.out.println("Saldo final: " + conta.getSaldoComoString());
    }
}

