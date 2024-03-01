public static void main(String[] args) {
    ContaCorrente conta1 = new ContaCorrente("Vitor", "12345", 1000.00, 500.00, "001");
    ContaCorrente conta2 = new ContaCorrente("Gyovanna", "67890", 500.00, 300.00, "002");

    conta1.exibirSaldo();
    conta2.exibirSaldo();

    conta1.depositar(500.00);
    conta2.sacar(200.00);

    conta1.exibirSaldo();
    conta2.exibirSaldo();

    conta1.transferir(300.00, conta2);

    conta1.exibirSaldo();
    conta2.exibirSaldo();
}
