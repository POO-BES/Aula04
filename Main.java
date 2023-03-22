public class Main {
    public static void main(String[] args) {
        // Cria dois celulares
        Celular celular = new Celular(7, 64, 50, "Android", "Samsung", "Roxo", 3000);
        Celular celular1 = new Celular(7, 64, 50, "Android", "Samsung", "Roxo", 3000);
        // Cria um notebook
        Notebook notebook = new Notebook("XTZ", "Avell", 15, 2, "i3", 2000);
        // Cria 3 amaciantes
        Amaciante amaciante = new Amaciante("Downy", "Downy", 2, "Lavanda", 30);
        Amaciante amaciante1 = new Amaciante("Downy", "Downy", 2, "Lavanda", 30);
        Amaciante amaciante2 = new Amaciante("Downy", "Downy", 2, "Lavanda", 30);

        // Cria o carrinho
        Carrinho carrinho = new Carrinho();
        // Adiciona todos os ítens criados ao carrinho
        carrinho.adicionaCelular(celular);
        carrinho.adicionaCelular(celular1);
        carrinho.adicionaNotebook(notebook);
        carrinho.adicionaAmaciante(amaciante);
        carrinho.adicionaAmaciante(amaciante1);
        carrinho.adicionaAmaciante(amaciante2);

        // Chamada do método para calcular o valor total da compra
        carrinho.calculaValorTotal();
        // Chamada do método para imprimir o "recibo" da compa ao usuário
        carrinho.imprimirRecibo();
    }
}