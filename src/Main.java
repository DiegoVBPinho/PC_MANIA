public class Main {
    static void main(String[] args) {
        int matricula = 537;
        HardwareBasico[] hardware = new HardwareBasico[3];
        hardware[0] = new HardwareBasico("Pentium Core i3", 220);
        hardware[1] = new HardwareBasico("Memória RAM", 8);
        hardware[2] = new HardwareBasico("HD", 500);

        Computador computador = new Computador("Apple", matricula, new SistemaOperacional("macOS", 64),hardware);

        computador.addMemoriaUSB(new MemoriaUSB("Pen-drive", 16));
        computador.mostraPCConfigs();

        System.out.println(" ");


        HardwareBasico[] hardware2 = new HardwareBasico[3];
        hardware2[0] = new HardwareBasico("Pentium Core i5", 220);
        hardware2[1] = new HardwareBasico("Memória RAM", 16);
        hardware2[2] = new HardwareBasico("HD", 1);


        Computador computador2 = new Computador("SAMSUNG", matricula+1234, new SistemaOperacional("Windows", 64),hardware2);

        computador2.addMemoriaUSB(new MemoriaUSB("Pen-drive", 32));
        computador2.mostraPCConfigs();



    }

}
