public class menu {
private int codigoProduto;
private int quantidade;
private int pessoas;
private double pagamento;
public menu() {
	codigoProduto=0;
	quantidade=0;
	pessoas=0;
pagamento= 0;
}
public menu(int codigoProduto,int quantidade,int pessoas,Double pagamento) {
	this.codigoProduto=codigoProduto;
	this.quantidade=quantidade;
	this.pessoas=pessoas;
	this.pagamento=pagamento;
}
public int getCodigoProduto() {
	return codigoProduto;
}
public void setCodigoProduto(int codigoProduto) {
	this.codigoProduto = codigoProduto;
}
public int getQuantidade() {
	return quantidade;
}
public void setQuantidade(int quantidade) {
	this.quantidade = quantidade;
}
public int getPessoas() {
	return pessoas;
}
public void setPessoas(int pessoas) {
	this.pessoas = pessoas;
}
public double getPagamento() {
	return pagamento;
}
public void setPagamento(double pagamento) {
	this.pagamento = pagamento;
}
public double Pagarconta() {
	double desconto=0;
	double valorParcial=0;
	double contaFinal=0;
	{
	if(codigoProduto==1) {
		valorParcial=2.0*quantidade;
	}else if(codigoProduto==2) {
		valorParcial=5.0*quantidade;
	}else if(codigoProduto==3) {
		valorParcial=4.0*quantidade;
	}else if(codigoProduto==1&&codigoProduto==2) {
		valorParcial=2.0*quantidade+5.0*codigoProduto;
	}else if(codigoProduto==1&&codigoProduto==3) {
		valorParcial=2.0*quantidade+4.0*quantidade;
	}else if(codigoProduto==2||codigoProduto==3) {
		valorParcial=5.0*quantidade+4.0*quantidade;
	}else if(codigoProduto==1&&codigoProduto==2&&codigoProduto==3) {
		valorParcial=2.0*quantidade+5.0*quantidade+4.0*quantidade;
	}
	if(pagamento==1) {
		desconto=valorParcial*10.0/100.0;
	}else if(pagamento==2) {
	desconto=0;
	}else if(pagamento==3) {
		desconto=valorParcial*5.0/100.0;
	}else {
		System.out.println("Tipo de pagamento invalido!!");
	}
	contaFinal=(valorParcial-desconto)/pessoas;
	return(contaFinal);
	}	
	}
}
