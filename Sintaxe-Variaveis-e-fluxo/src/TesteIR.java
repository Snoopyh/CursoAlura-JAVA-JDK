public class TesteIR {

  public static void main(String[] args) {
    double salario = 3800.00;
    if (salario >= 1900.00 && salario <= 2800.00) {
      System.out.println("A sua aliquota é de 7,5%");
      System.out.println("Você pode deduzir até R$ 142");
    }
    if (salario >= 2800.01 && salario <= 3751.0) {
      System.out.println("A sua aliquota é de 15%");
      System.out.println("Você pode deduzir até R$ 350");
    }
    if (salario >= 3751.01 && salario <= 4664.00) {
      System.out.println("A sua aliquota é de 22.5%");
      System.out.println("Você pode deduzir até RR$ 636");
    }
    if (salario > 4664.00) {
      System.out.println("seu imposto está acima dos 22.5% ");
    } else {
      System.out.println("sem imposto para pagar.");
    }

  }
}
