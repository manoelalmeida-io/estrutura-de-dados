/* Classe ArvoreBin - representa uma árvore binária */
public class ArvoreBin {
    // Atributo
    private Node raiz;		// raiz da árvore binária

    // Construtor - inicializa raiz com null
    public ArvoreBin() {
        raiz = null;
    }

    // Método getRaiz()
    public Node getRaiz() {
        return raiz;
    }

    // Método criaRaiz(int conteudo)
    public void criaRaiz(int conteudo) {
        raiz = new Node(conteudo);
    }

    /* Método insereDir - recebe o endereço de um nó pai e o conteúdo do novo nó
     * que será criado e inserido como filho direito do nó pai
     * Retorna o endereço do novo nó inserido
     */
    public Node insereDir(Node pai, int conteudo) {
        /* Se a árvore for vazia ou se o pai já tem filho direito, então não insere */
        if (raiz == null || pai.getDir() != null) {
            return null;
        }
        /* cria um novo nó com o conteúdo recebido como argumento */
        Node noNovo = new Node(conteudo);
        /* atribui endereço do novo nó para filho direito do pai */
        pai.setDir(noNovo);
        /* retorna endereço do novo nó */
        return(noNovo);
    }

    /* Método insereEsq - recebe o endereço de um nó pai e o conteúdo do novo nó
     * que será criado e inserido como filho esquerdo do nó pai
     * Retorna o endereço do novo nó inserido
     */
    public Node insereEsq(Node pai, int conteudo) {
        /* Se a árvore for vazia ou se o pai já tem filho esquerdo, então não insere */
        if (raiz == null || pai.getEsq() != null) {
            return null;
        }
        /* cria um novo nó com o conteúdo recebido como argumento */
        Node noNovo = new Node(conteudo);
        /* atribui endereço do novo nó para filho direito do pai */
        pai.setEsq(noNovo);
        /* retorna endereço do novo nó */
        return(noNovo);
    }

    /* Método exibeArv - percorre a árvore recursivamente, exibindo o conteúdo
     * de cada nó, o conteúdo do filho esquerdo e o conteúdo do filho direito de
     * cada nó
     */
    public void exibeArv(Node noDaVez) {
        if (noDaVez != null) {
            System.out.print("Conteúdo: "+ noDaVez.getConteudo());
            if (noDaVez.getEsq() == null) {
                System.out.print(" | Esq: -");
            }
            else {
                System.out.print(" | Esq: " +
                        noDaVez.getEsq().getConteudo());
            }
            if (noDaVez.getDir() == null) {
                System.out.println(" | Dir: -");
            }
            else {
                System.out.println(" | Dir: " +
                        noDaVez.getDir().getConteudo());
            }
            exibeArv(noDaVez.getEsq());		// chama recursivamente para exibir a subárvore esquerda
            exibeArv(noDaVez.getDir());		// chama recursivamente para exibir a subárvore direita
        }
    }

    /* Método preOrdem - percorre recursivamente a árvore, exibindo seu percurso
     * em pré-ordem
     */
    public void preOrdem(Node noDaVez) {
        if (noDaVez != null) {
            System.out.print(noDaVez.getConteudo() + "\t");
            preOrdem(noDaVez.getEsq());
            preOrdem(noDaVez.getDir());
        }
    }

    /* Método emOrdem - percorre recursivamente a árvore, exibindo seu percurso
     * em em-ordem
     */
    public void emOrdem(Node noDaVez) {
        if (noDaVez != null) {
            emOrdem(noDaVez.getEsq());
            System.out.print(noDaVez.getConteudo() + "\t");
            emOrdem(noDaVez.getDir());
        }
    }

    /* Método posOrdem - percorre recursivamente a árvore, exibindo seu percurso
     * em pós-ordem
     */
    public void posOrdem(Node noDaVez) {
        if (noDaVez != null) {
            posOrdem(noDaVez.getEsq());
            posOrdem(noDaVez.getDir());
            System.out.print(noDaVez.getConteudo() + "\t");
        }
    }
}
