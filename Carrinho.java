// Importação do ArrayList para utilizar uma coleção de objetos na classe
import java.util.ArrayList;

// Objeto Carrinho
public class Carrinho {
    // Coleção de objetos abstratos, pode ser qualquer objeto do programa ou do Java
    //    private ArrayList<Object> produtos;

    // A coleção também pode ser feita com um tipo específico de objetos, por exemplo:
    private ArrayList<Celular> celulares;
    private ArrayList<Notebook> notebooks;
    private ArrayList<Amaciante> amaciantes;

    // A coleção foi criada utilizando o ArrayList do java, mas outros tipos de estrutura
    // também poderiam ser usados neste caso, como exemplo: List, Queue, Stack, etc..

    // Atributo para calcular o valor total da compra
    private float valorTotal;

    // Construtor responsável por instanciar (criar) o objeto Carrinho
    public Carrinho() {
        // inicializando as listas (precisamos fazer isso no Java se não dá erro)
        celulares = new ArrayList<>();
        notebooks = new ArrayList<>();
        amaciantes = new ArrayList<>();
        this.valorTotal = 0f;
    }

    // Aqui criamos três métodos que simulam a adição de produtos no carrinho

    // Método para adicionar amaciantes à coleção de amaciantes
    public void adicionaAmaciante(Amaciante amaciante) {
        amaciantes.add(amaciante);
        System.out.println("O " + amaciante.getNome() + " foi adicionado com sucesso!");
    }

    // Método para adicionar notebooks à coleção de notebooks
    public void adicionaNotebook(Notebook notebook) {
        notebooks.add(notebook);
        System.out.println("O " + notebook.getModelo() + " foi adicionado com sucesso!");
    }

    // Método para adicionar celulares à coleção de celulares
    public void adicionaCelular(Celular celular) {
        celulares.add(celular);
        System.out.println("O " + celular.getMarca() + " foi adicionado com sucesso!");
    }

    // Método para calcular o valor total da compra, considerando todos os tipos de ítens adicionados
    public void calculaValorTotal() {
        // Para cada amaciante na coleção amaciantes
        for (var amaciante: amaciantes) {
            // Soma o valor do amaciante ao valor total
            valorTotal += amaciante.getValor();
        }

        // Para cada celular na coleção celulares
        for (var celular: celulares) {
            // Soma o valor do amaciante ao valor total
            valorTotal += celular.getValor();
        }

        // Para cada notebook na coleção notebooks
        for (var notebook: notebooks) {
            // Soma o valor do amaciante ao valor total
            valorTotal += notebook.getValor();
        }
    }

    // Método para mostrar um feedback ao usuário
    public void imprimirRecibo() {
        // Imprime cabeçalho
        System.out.println("\n--------------------- RECIBO ---------------------");
        // Se a coleção de amaciantes não estiver vazia
        if(amaciantes.size() != 0) {
            // calcula o valor total por produto
            float total = amaciantes.get(0).getValor() * amaciantes.size();
            // imprime a quantidade, o valor por unidade e o valor total por produto
            System.out.println(amaciantes.size() + "x Amaciante - Valor Unidade: R$ " + amaciantes.get(0).getValor() + " - Valor Total: R$ " + total);
        }

        // Se a coleção de notebooks não estiver vazia
        if(notebooks.size() != 0) {
            // calcula o valor total por produto
            float total = notebooks.get(0).getValor() * notebooks.size();
            // imprime a quantidade, o valor por unidade e o valor total por produto
            System.out.println(notebooks.size() + "x Notebook - Valor Unidade: R$ " + notebooks.get(0).getValor() + " - Valor Total: R$ " + total);
        }

        // Se a coleção de celulares não estiver vazia
        if(celulares.size() != 0) {
            // calcula o valor total por produto
            float total = celulares.get(0).getValor() * celulares.size();
            // imprime a quantidade, o valor por unidade e o valor total por produto
            System.out.println(celulares.size() + "x Celular - Valor Unidade: R$ " + celulares.get(0).getValor() + " - Valor Total: R$ " + total);
        }

        System.out.println("\n\n\n--------------------------------------------------");
        // Imprime o valor total da compra considerando todos os ítens
        System.out.println("VALOR TOTAL DA COMPRA: R$ " + valorTotal);
    }
}
