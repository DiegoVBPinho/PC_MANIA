public class ProcessarPedido {

    static public Computador[] promocoes; // aqui estarão as promocoes de computadores. Usado para aprendizado.
    private int quantidadePromocaoTipo1;
    private int quantidadePromocaoTipo2;
    private int quantidadePromocaoTipo3;


    ProcessarPedido ()
    {
        this.quantidadePromocaoTipo1 = 0;
        this.quantidadePromocaoTipo2 = 0;
        this.quantidadePromocaoTipo3 = 0;
    }



    //precisa fazer  utilitário

    static public void enviaPedido(Computador[] computadores)
    {

        System.out.println("---Pedido Enviado!---");
        //imprimindo as posições do vetor.

        for (int i = 0; i < computadores.length; i++)
        {
            System.out.println("Item nº " + (i + 1) + ":" );
            computadores[i].mostraPCConfigs();
            System.out.println(" ");
        }

    }

    public void adicionarPedido(int num) //Acumula os tipos informados no momento de aquisição.
    {
        if(num == 1)
        {
          quantidadePromocaoTipo1 ++;
        } else if (num==2)
        {
            quantidadePromocaoTipo2 ++;
        }
        else if (num== 3)
        {
            quantidadePromocaoTipo3 ++;
        }



    }

    public Computador[] finalizarPedido() // Retorna lista de computadores do pedido - solicitados pelo cliente
    {
        int numTotalDeComputadores = quantidadePromocaoTipo1 + quantidadePromocaoTipo2 + quantidadePromocaoTipo3;
        Computador[] computadores = new Computador[numTotalDeComputadores];

        for(int i = 0; i<quantidadePromocaoTipo1;i++) {
            computadores[i] = promocoes[0];
        }


        for(int i = quantidadePromocaoTipo1; i<quantidadePromocaoTipo1+quantidadePromocaoTipo2;i++) {
            computadores[i] = promocoes[1];
        }

        for(int i = quantidadePromocaoTipo1+quantidadePromocaoTipo2; i<numTotalDeComputadores;i++) {
            computadores[i] = promocoes[2];
        }

        return computadores;

    }

}

