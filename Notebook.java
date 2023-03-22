// Objeto Notebook
public class Notebook {
    // Usando encapsulamento nossos atributos sempre serão privados
    // Atributos privados não aparecem para outros objetos, somente para a classe Notebook
    private String modelo;
    private String marca;
    private int tamanhoTela;
    private int memoria;
    private String processador;

    private float valor;

    // Construtor responsável por instanciar (criar) um Notebook
    public Notebook(String modelo, String marca, int tamanhoTela, int memoria, String processador, float valor) {
        this.modelo = modelo;
        this.marca = marca;
        this.tamanhoTela = tamanhoTela;
        this.memoria = memoria;
        this.processador = processador;
        this.valor = valor;
    }

    // No encapsulamento criamos Getters para poder acessar a variável modelo
    // Um getter dá acesso a variável apenas para "leitura" do valor, não podendo ser alterada por ele
    // Get para modelo, retorna o valor de modelo
    public String getModelo() {
        return modelo;
    }

    // Get para marca, retorna o valor de marca
    public String getMarca() {
        return marca;
    }

    // Get para tamanho de tela, retorna o tamanho de tela
    public int getTamanhoTela() {
        return tamanhoTela;
    }

    // No encapsulamento também criamos Setters para poder atribuir um novo valor ao atributo
    // Esse método não possui retorno (void) e recebe como parâmetro o novo valor que será atribuído
    // Set para o tamanho da tela, atribuir um novo valor ao tamanho de tela
    public void setTamanhoTela(int tamanhoTela) {
        this.tamanhoTela = tamanhoTela;
    }

    // Get para memória que retorna o valor de memória
    public int getMemoria() {
        return memoria;
    }

    // Set para memória que atribui um novo valor para memória
    public void setMemoria(int memoria) {
        this.memoria = memoria;
    }

    // Get para processador que retorna o valor de processador
    public String getProcessador() {
        return processador;
    }

    // Set para processador que atribui um novo valor ao processador
    public void setProcessador(String processador) {
        this.processador = processador;
    }

    // Get para valor que retorna o valor de valor
    public float getValor() {
        return valor;
    }
}
