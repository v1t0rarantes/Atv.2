class ContaCorrente {
    String titular;
    Long cpf;
    String cidade;
    String agência;
    Double saldo;

    public void sacar(double valor) {
        if (valor <= 0) {
            System.out.println("Valor inválido para saque.");
            return;
        }
        if (valor > saldo + limite) {
            System.out.println("Saldo insuficiente para saque.");
            return;
        }
        saldo -= valor;
        System.out.println("Saque de R$" + valor + " realizado com sucesso.");
    }

    public void depositar(double valor) {
        if (valor <= 0) {
            System.out.println("Valor inválido para depósito.");
            return;
        }
        saldo += valor;
        System.out.println("Depósito de R$" + valor + " realizado com sucesso.");
    }

    public void transferir(double valor, ContaCorrente destino) {
        if (valor <= 0) {
            System.out.println("Valor inválido para transferência.");
            return;
        }
        if (valor > saldo + limite) {
            System.out.println("Saldo insuficiente para transferência.");
            return;
        }
        saldo -= valor;
        destino.depositar(valor);
        System.out.println(
                "Transferência de R$" + valor + " para a conta " + destino.numeroConta + " realizada com sucesso.");
    }

    public void exibirSaldo() {
        System.out.println("Saldo atual: R$" + saldo);
    }
}