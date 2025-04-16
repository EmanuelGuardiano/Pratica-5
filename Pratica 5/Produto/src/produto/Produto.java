package produto;

public class Produto {
    private String nome;
    private double preco;
    private int quantidade;

    
    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(double preco) {
        if (preco > 0) {
            this.preco = preco;
            
        } else {
            System.out.println("Preco invalido! Deve ser positivo.");
        }
    }

    public void setQuantidade(int quantidade) {
        if (quantidade >= 0) {
            this.quantidade = quantidade;
            
        } else {
            System.out.println("Quantidade invalida! Deve ser zero ou mais.");
        }
    }

    
    public static void main(String[] args) {
        Produto p = new Produto();
        
        p.setNome("Caneta");
        p.setPreco(2.50);
        p.setQuantidade(10);

        System.out.println("Produto: " + p.getNome());
        System.out.println("Preco: R$" + p.getPreco());
        System.out.println("Quantidade: " + p.getQuantidade());


        p.setPreco(-2.50);        
        p.setQuantidade(-3);     

        System.out.println("Apos tentativa de valores invalidos:");
        System.out.println("Preco: R$" + p.getPreco());
        System.out.println("Quantidade: " + p.getQuantidade());
    }
}
