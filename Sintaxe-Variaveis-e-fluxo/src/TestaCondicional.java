public class TestaCondicional {

  public static void main(String[] args) {
    System.out.println("testando condicionais.");
    int idade = 20;
    int quantidadeDePessoas = 3 ;
    if (idade >= 18) {
      System.out.println("voce tem mais de 18 anos.");
      System.out.println("seja bem vindos");
    }
    else{
      if(quantidadeDePessoas >= 2){
        System.out.println("voce pode entrar, pois está acompanhado!");
      }else{System.out.println("infelizmente voce não pode entrar");}
      
    }
  }

}
