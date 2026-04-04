public class Main {
    static void main(String[] args) {
        int matricula = 537;
        Computador[] computadores = new Computador[2];


        HardwareBasico[] hardware = new HardwareBasico[3];
        hardware[0] = new HardwareBasico("Pentium Core i3", 220);
        hardware[1] = new HardwareBasico("Memória RAM", 8);
        hardware[2] = new HardwareBasico("HD", 500);

        computadores[0] = new Computador("Apple", matricula, new SistemaOperacional("macOS", 64),hardware);
        computadores[0].addMemoriaUSB(new MemoriaUSB("Pen-drive", 16));

        HardwareBasico[] hardware2 = new HardwareBasico[3];
        hardware2[0] = new HardwareBasico("Pentium Core i5", 220);
        hardware2[1] = new HardwareBasico("Memória RAM", 16);
        hardware2[2] = new HardwareBasico("HD", 1);


        computadores[1] = new Computador("SAMSUNG", matricula+1234, new SistemaOperacional("Windows", 64),hardware2);
        computadores[1].addMemoriaUSB(new MemoriaUSB("Pen-drive", 32));

        ProcessarPedido processa = new ProcessarPedido();
        ProcessarPedido processa2 = new ProcessarPedido();

               ProcessarPedido.enviaPedido(computadores);




    }

}
