public class Teste {

    public static void main(String[] args) {
        // Cria objeto da classe ArvoreBin
        ArvoreBin arv = new ArvoreBin();

        // Estamos construindo a árvore que está no slide (material sobre árvore)
        // Cria a raiz com valor 6
        arv.criaRaiz(6);

        // Insere os filhos da raiz
        Node no4= arv.insereEsq(arv.getRaiz(), 4);
        Node no8= arv.insereDir(arv.getRaiz(), 8);

        // Insere os filhos do nó 4
        Node no2= arv.insereEsq(no4, 2);
        Node no5= arv.insereDir(no4, 5);

        // Insere os filhos do nó 2
        Node no1= arv.insereEsq(no2, 1);
        Node no3= arv.insereDir(no2, 3);

        // Insere os filhos do nó 8
        Node no7= arv.insereEsq(no8, 7);
        Node no9= arv.insereDir(no8, 9);

        // Exibe a árvore
        arv.exibeArv(arv.getRaiz());

        // Exibe a árvore - percurso em pré-ordem
        System.out.println("\nPercurso em pré-ordem:");
        arv.preOrdem(arv.getRaiz());
        System.out.println();

        // Exibe a árvore - percurso em em-ordem
        System.out.println("\nPercurso em em-ordem:");
        arv.emOrdem(arv.getRaiz());
        System.out.println();

        // Exibe a árvore - percurso em pós-ordem
        System.out.println("\nPercurso em pós-ordem:");
        arv.posOrdem(arv.getRaiz());
        System.out.println();

        // Cria árvore binária de busca
        ArvoreBinBusca arvBusca = new ArvoreBinBusca();
        // Insere os valores (árvore binária que está no slide do material de árvore)
        arvBusca.insere(6);
        arvBusca.insere(4);
        arvBusca.insere(2);
        arvBusca.insere(1);
        arvBusca.insere(5);
        arvBusca.insere(3);
        arvBusca.insere(8);
        arvBusca.insere(7);
        arvBusca.insere(9);

        System.out.println("\nPercurso em pré-ordem da árvore bin de busca:");
        arvBusca.preOrdem(arvBusca.getRaiz());
        System.out.println();


    }

}
