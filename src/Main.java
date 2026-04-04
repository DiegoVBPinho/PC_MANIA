public class Main {
    static void main(String[] args) {
        int matricula = 537;
        ProcessarPedido.promocoes = new Computador[3];

        HardwareBasico[] hardware = new HardwareBasico[3];
        hardware[0] = new HardwareBasico("Pentium Core i3", 220);
        hardware[1] = new HardwareBasico("Memória RAM", 8);
        hardware[2] = new HardwareBasico("HD", 500);

        ProcessarPedido.promocoes[0] = new Computador("Apple", matricula, new SistemaOperacional("macOS Sequoia", 64),hardware);
        ProcessarPedido.promocoes[0].addMemoriaUSB(new MemoriaUSB("Pen-drive", 16));

        hardware = new HardwareBasico[3];
        hardware[0] = new HardwareBasico("Pentium Core i5", 220);
        hardware[1] = new HardwareBasico("Memória RAM", 16);
        hardware[2] = new HardwareBasico("HD", 1);


        ProcessarPedido.promocoes[1] = new Computador("SAMSUNG", matricula+1234, new SistemaOperacional("Windows 8", 64),hardware);
        ProcessarPedido.promocoes[1].addMemoriaUSB(new MemoriaUSB("Pen-drive", 32));


        hardware = new HardwareBasico[3];
        hardware[0] = new HardwareBasico("Pentium Core i7", 4500);
        hardware[1] = new HardwareBasico("Memória RAM", 32);
        hardware[2] = new HardwareBasico("HD", 2);


        ProcessarPedido.promocoes[2] = new Computador("Dell", matricula+5678, new SistemaOperacional("Windows 10", 64),hardware);
        ProcessarPedido.promocoes[2].addMemoriaUSB(new MemoriaUSB("Pen-drive", 32));


        ProcessarPedido processa = new ProcessarPedido();


        processa.adicionarPedido(1);
        processa.adicionarPedido(2);
        processa.adicionarPedido(3);
        processa.adicionarPedido(2);
        processa.adicionarPedido(2);
        processa.adicionarPedido(1);
        processa.adicionarPedido(3);

        Computador[] computadors = processa.finalizarPedido();
        ProcessarPedido.enviaPedido(computadors);

        Cliente client = new Cliente("Diego Victor", "0900");
        client.setComputadores(computadors);


        System.out.println(client.calculaTotalCompra());



    }

}
