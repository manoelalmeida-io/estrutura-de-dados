/* Classe Node - representa um nó de uma árvore binária */
public class Node {

    // Atributos
    private int conteudo;		// conteúdo do nó
    private Node esq;			// endereço do filho esquerdo do nó
    private Node dir;			// endereço do filho direito do nó

    // Construtor
    // Recebe o conteúdo a ser colocado no nó, e inicializa esq e dir com null
    public Node(int conteudo) {
        this.conteudo = conteudo;
        esq= null;
        dir= null;
    }

    // Setters e Getters
    public int getConteudo() {
        return conteudo;
    }
    public void setConteudo(int conteudo) {
        this.conteudo = conteudo;
    }
    public Node getEsq() {
        return esq;
    }
    public void setEsq(Node esq) {
        this.esq = esq;
    }
    public Node getDir() {
        return dir;
    }
    public void setDir(Node dir) {
        this.dir = dir;
    }


}
