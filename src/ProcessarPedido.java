public class ProcessarPedido {





    //precisa fazer método utilitário

    static public void enviaPedido(Computador[] computadores)
    {
        System.out.println("---Pedido Enviado!---");
        //imprimindo as posições do vetor.

        for (int i = 0; i < computadores.length; i++)
        {
            System.out.println("iten nº: " (i + 1) + ": ");
            computadores[i].mostraPCConfigs();
        }

    }



}

