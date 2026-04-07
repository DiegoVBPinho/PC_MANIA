package br.inatel.cdg.computador;

public class Computador {

    private String marca;
    private float preco;
    private MemoriaUSB memoria;
    private SistemaOperacional os;
    private HardwareBasico[] hardware;


    public Computador(String marca, float preco, SistemaOperacional os, HardwareBasico[] hardware ) {
        this.marca = marca;
        this.preco = preco;
        this.memoria = null;   // começa vazio.
        this.os = os; // composição de SO.
        this.hardware = hardware; // composição de Hardware (0 ou +) //

    }

    public void mostraPCConfigs(){
        System.out.println("Marca: " + this.marca);
        System.out.println("Preco: R$ " + this.preco);

        for(int i = 0; i < this.hardware.length; i++) { // for para imprimir os itens dentro do vetor, conforme ele crescer.

            System.out.println(this.hardware[i].getNome() + " " + this.hardware[i].getCapacidade());
        }
        System.out.println("Sistema Operacional " + this.os.getNome() + " " + "(" + this.os.getTipo() + " bits)");


        if (this.memoria == null)
        {
            System.out.println("Nao acompanha MemoriaUSB. ");
        }
        else
        {
            System.out.println("Acompanha " + this.memoria.getNome() + " de " + this.memoria.getCapacidade());
        }

    }


    public void addMemoriaUSB(MemoriaUSB musb)
    {
        this.memoria = musb;
    }

    //criado get preço para ver os preços de cada computadores no cliente


    public float getPreco() {
        return preco;
    }
}


