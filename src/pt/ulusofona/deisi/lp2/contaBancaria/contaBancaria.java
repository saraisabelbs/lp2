package pt.ulusofona.deisi.lp2.contaBancaria;

class ContaBancaria {
    // Atributo privado para armazenar o saldo
    private int saldo;

    // Construtor
    public ContaBancaria(int saldoInicial) {
        this.saldo = saldoInicial;
    }

    // Método para depositar
    public void deposita(int valor) {
        if (valor > 0) {
            saldo += valor;
        }
    }

    // Método para levantar
    public boolean levanta(int valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            return true;
        }
        return false;
    }

    // Método para obter o saldo como String
    public String getSaldoComoString() {
        return String.valueOf(saldo);
    }
}
