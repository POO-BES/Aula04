// Objeto Amaciante
public class Amaciante {
    // Usando encapsulamento nossos atributos sempre serão privados
    // Atributos privados não aparecem para outros objetos, somente para a classe Amaciante
    private String nome;
    private String marca;
    private float litros;
    private String fragrancia;

    private float valor;
    private int quantidade;

    // Construtor responsável por instanciar (criar) um Amaciante
    public Amaciante(String nome, String marca, float litros, String fragrancia, float valor) {
        this.nome = nome;
        this.marca = marca;
        this.litros = litros;
        this.fragrancia = fragrancia;
        this.valor = valor;
    }

    // No encapsulamento criamos Getters para poder acessar a variável modelo
    // Um getter dá acesso a variável apenas para "leitura" do valor, não podendo ser alterada por ele
    // Get para nome, retorna o valor de nome
    public String getNome() {
        return nome;
    }

    // Get para marca que retorna o valor de marca
    public String getMarca() {
        return marca;
    }

    // Get para litros que retorna o valor de litros
    public float getLitros() {
        return litros;
    }

    // No encapsulamento também criamos Setters para poder atribuir um novo valor ao atributo
    // Esse método não possui retorno (void) e recebe como parâmetro o novo valor que será atribuído
    // Set para o litros, atribuir um novo valor para litros
    public void setLitros(float litros) {
        this.litros = litros;
    }

    // Get para fragrancia que retorna o valor de fragrancia
    public String getFragrancia() {
        return fragrancia;
    }

    // Set para fragrancia que atribui um novo valor a fragrancia
    public void setFragrancia(String fragrancia) {
        this.fragrancia = fragrancia;
    }

    // Get para valor que retorna o valor de valor (haha)
    public float getValor() {
        return valor;
    }
}
