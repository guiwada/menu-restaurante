import java.util.*;
public class menurestaurante {
static double valorMaior=0;

	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		menu c1=new menu();
			
		System.out.println("Digite o codigo do produto:\n1-Refrigerante\n2-Cachorro Quente,\n3-Batata Frita");
		c1.setCodigoProduto(entrada.nextInt());
		System.out.println("Digite a quantidade desejada:");
		c1.setQuantidade(entrada.nextInt());
		System.out.println("Quantidade de clientes:");
		c1.setPessoas(entrada.nextInt());
System.out.println("Forma de pagamento:\n1-Dinheiro\n2-Cheque\n3-Cartão");
c1.setPagamento(entrada.nextInt());
System.out.println("Valor da conta final para cada pessoa da mesa 1:"+c1.Pagarconta());
menu c2=new menu();
System.out.println("Digite o codigo do produto:\n1-Refrigerante\n2-Cachorro Quente,\n3-Batata Frita");
c2.setCodigoProduto(entrada.nextInt());
System.out.println("Quantidade de clientes:");
c2.setPessoas(entrada.nextInt());
System.out.println("Digite a quantidade desejada:");
c2.setQuantidade(entrada.nextInt());
System.out.println("Forma de pagamento:\n1-Dinheiro\n2-Cheque\n3-Cartão");
c2.setPagamento(entrada.nextInt());
System.out.println("Valor da conta final para cada pessoa da mesa 2:"+c2.Pagarconta());
if(c1.Pagarconta()>c2.Pagarconta()) {
	 valorMaior=c1.Pagarconta();
	 System.out.println("A mesa 1 gastou mais do que a mesa 2");
}if(c2.Pagarconta()>c1.Pagarconta()) {
	valorMaior=c2.Pagarconta();
	System.out.println("A mesa 2 gastou mais do que a mesa 1");
}
	}

}
