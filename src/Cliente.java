public class Cliente
{

    private String nome;
    private String cpf;
    private Computador []computadores;


    public Cliente(String nome, String cpf)
    {
        this.nome = nome;
        this.cpf = cpf;
        this.computadores = null;

    }

    public float calculaTotalCompra()
    {
        return 0 ;
    }



    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }


    public Computador[] getComputadores() {
        return computadores;
    }

    public void setComputadores(Computador[] computadores) {
        this.computadores = computadores;
    }
}
