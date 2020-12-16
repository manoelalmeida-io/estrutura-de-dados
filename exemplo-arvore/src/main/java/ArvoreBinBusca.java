/* Classe ArvoreBinBusca - representa uma árvore binária de busca
 * ou seja, uma árvore em que os valores que estão à esquerda de um
 * nó são menores ou iguais ao valor do nó, e os valores que estão à
 * direita de um nó são maiores do que o valor do nó
 */
public class ArvoreBinBusca {

    // Atributo
    private Node raiz;

    // Construtor
    public ArvoreBinBusca() {
        raiz = null;
    }

    // getRaiz()
    public Node getRaiz() {
        return raiz;
    }

    // Método insere - recebe o valor do conteúdo do novo nó
    public void insere(int conteudo) {
        if (raiz == null) {				// se a árvore está vazia
            raiz = new Node(conteudo);	// então cria a raiz com o conteúdo recebido
        }
        else {			//senão
            Node noDaVez = raiz;	// começa a percorrer a árvore a partir da raiz

            // enquanto não inseriu o novo nó
            while (noDaVez != null && noDaVez.getConteudo() != conteudo) {
                // cria um novo nó com o conteúdo recebido
                Node noNovo = new Node(conteudo);
                // conteúdo novo é menor ou igual ao conteúdo do nó da vez ?
                if (conteudo <= noDaVez.getConteudo()) {
                    // sim... então tem que prosseguir para o lado esquerdo
                    if (noDaVez.getEsq() == null) {	// se nó da vez não tem filho esquerdo
                        noDaVez.setEsq(noNovo);		// insere novo nó aí, como filho esquerdo do nó da vez
                    }
                    noDaVez = noDaVez.getEsq();		// nó da vez passa a ser o filho esq do nó da vez
                }
                else {
                    // não... então tem que prosseguir para o lado direito
                    if (noDaVez.getDir() == null) {	// se nó da vez não tem filho direito
                        noDaVez.setDir(noNovo);		// insere novo nó aí, como filho direito do nó da vez
                    }
                    noDaVez = noDaVez.getDir();		// nó da vez passa a ser o filho dir do nó da vez
                }
            }
        }
    }

    // exibe percurso em pré-ordem
    public void preOrdem(Node noDaVez) {
        if (noDaVez != null) {
            System.out.print(noDaVez.getConteudo() + "\t");
            preOrdem(noDaVez.getEsq());
            preOrdem(noDaVez.getDir());
        }
    }



}
