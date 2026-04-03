public class MemoriaUSB {
    private String nome;
    private int capacidade;

    public MemoriaUSB(String nome, int capacidade) {
        this.nome = nome;
        this.capacidade = capacidade;
    }

    public String getNome() { // Foi necessário um Getter para revelar o nome na classe computador
        return nome;
    }

    public int getCapacidade() { // Foi necessário um Getter para revelar a Capacidade na classe computador
        return capacidade;
    }
}
