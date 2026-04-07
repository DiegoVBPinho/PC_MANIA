package br.inatel.cdg.cliente;


import br.inatel.cdg.computador.Computador;

public class Cliente
{

    private String nome;
    private String cpf;
    private Computador[]computadores;


    public Cliente(String nome, String cpf)
    {
        this.nome = nome;
        this.cpf = cpf;
        this.computadores = null;

    }

    public float calculaTotalCompra()
    {
        float precoTotal = 0;
        for(int i = 0; i<this.computadores.length;i++)
        {
            precoTotal+=computadores[i].getPreco();
        }
        return precoTotal ;
    }



    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }




    public void setComputadores(Computador[] computadores) {
        this.computadores = computadores;
    }
}
