import java.util.Scanner;


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

        Cliente client = new Cliente("Diego Victor", "0900");

        ProcessarPedido processa = new ProcessarPedido(); // instacia de Pedidos

        Scanner input = new Scanner(System.in);
        while(true)
        {

            System.out.println("Digite a Promocao que voce deseja adquirir(1, 2 ou 3): ");
            System.out.println("Digite 0, caso deseje finalizar sua compra! ");

            int opcao = input.nextInt();
            if(opcao == 0)
            {
                break;
            }

            processa.adicionarPedido(opcao); //Acumulativo de computadores que foram comprados pelo cliente

        }

        //Momento de enviar o pedido e escrever na tela o total de compra, os dados do Cliente e as promoções adquiridas.

        System.out.println();
        System.out.println(client.getNome());
        System.out.println(client.getCpf());
        Computador[] computadors = processa.finalizarPedido();
        ProcessarPedido.enviaPedido(computadors);
        client.setComputadores(computadors);
        System.out.println("Total de Compra R$: " + client.calculaTotalCompra());




















    }

}
