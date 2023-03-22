// Objeto Celular
public class Celular {
    // Usando encapsulamento nossos atributos sempre serão privados
    // Atributos privados não aparecem para outros objetos, somente para a classe Celular
    private float tamanhoTela;
    private int memoria;
    private int volume;
    private String sistemaOperacional;
    private String marca;
    private String cor;

    private float valor;

    // Construtor responsável por instanciar (criar) um Celular
    public Celular(float tamanhoTela, int memoria, int volume, String sistemaOperacional, String marca, String cor, float valor) {
        this.tamanhoTela = tamanhoTela;
        this.memoria = memoria;
        this.volume = volume;
        this.sistemaOperacional = sistemaOperacional;
        this.marca = marca;
        this.cor = cor;
        this.valor = valor;
    }

    // Método para tocar música que recebe como parâmetro a música que será tocada
    public void TocarMusica(String musica) {
        System.out.println("A " + musica + " está tocando");
    }

    // Método para alterar o volume que recebe como parâmetro o volume que será atribuido
    public void AlterarVolume(int volume) {
        this.volume = volume;
        System.out.println("O volume atual é " + volume);
    }

    // Método que retorna uma String (texto) com uma mensagem para ser exibida como notificação
    public String ReceberNotificacao() {
        return "FBI: Oi sumido. Rsrs";
    }

    // Get para marca que retorna o valor de marca
    public String getMarca() {
        return marca;
    }

    // Get para valor que retorna o valor de valor
    public float getValor() {
        return valor;
    }
}