public class TestaCondicional2 {
  public static void main(String[] args) {
    System.out.println("testando condicionais.");
    int idade = 26;
    int quantidadeDePessoas = 3;
    boolean acompanhado = quantidadeDePessoas >= 2;

    if (idade >= 18 && acompanhado) {
      System.out.println("seja bem vindo!");
    } else {
      System.out.println("voce não pode entrar");
    }
    
  }
}
