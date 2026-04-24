public class Produto {
   private String nome;
   private double preco;

   public Produto(String nome, double preco) {
       this.nome = nome;
       this.preco = preco;
   }

   public void exibirInfo() {
       System.out.println("Produto: " + nome + " - Preço: " + preco);
   }

<<<<<<< HEAD
   public void aplicarDescontoPercentualCRUD(double percentual) {
   this.preco -= this.preco * percentual / 100;
}
=======
   public void aplicarDescontoPercentualCerto(double percentual) {
        this.preco -= this.preco * percentual / 100;
   }

   public void imprimir(double percentual) {
        System.out.println("Perc: " + percentual);
   }
>>>>>>> crud-aluno-andre

}
