import java.util.Scanner;

public class CalcJava {
    public static void main(String orgs[]){
    System.out.println("bem vindo a calculadora");

    Scanner scan = new Scanner(System.in);
    Numero n1 = new Numero();
    Numero n2 = new Numero();
    Numero res = new Numero();
    String Opcao;

    do
    {

    System.out.println("Digite o Valor 1: ");
    n1.setValor(scan.nextDouble());

    System.out.println("Digite o Valor 2: ");
    n2.setValor(scan.nextDouble());

    res.setValor(n1.getValor() + n2.getValor());
    System.out.println("Resultado: " + res.getValor());

    System.out.println("Deseja continuar? (s/n)");
    Opcao = scan.next();
    } while(Opcao.equals("s") || Opcao.equals("S"));

    scan.close();
    }
}