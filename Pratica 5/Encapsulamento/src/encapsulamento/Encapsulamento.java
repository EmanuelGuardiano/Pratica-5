package encapsulamento;
import encapsulamento.model.Pessoa;
public class Encapsulamento {

 
    public static void main(String[] args) {
        Pessoa conta= new Pessoa("99132-123",80.90);

        System.out.println("Numero da conta: "+ conta.getNumeroConta());
        System.out.println("Saldo da conta: "+conta.getSaldo());
        conta.depositar(12);
        System.out.println("Saldo da conta: "+conta.getSaldo());
    }

}