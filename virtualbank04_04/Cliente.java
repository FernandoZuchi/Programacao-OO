import java.util.ArrayList;

public class Cliente
{
   private String nome;
   private ArrayList<ContaBancaria> contas;
    
   public Cliente(String nome){
       this.nome = nome;
       contas = new ArrayList<>();
   }
    
   public double saldoContas(){
       double total = 0;
       for ( ContaBancaria cb : contas){
           total += cb.getSaldo();
       }
       /*for (int i =0 ; i < contas.size(); i++){
           total += contas.get(i).getSaldo();
       }*/
       return total;
   }
   
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return this.nome;
    }
    
    public void addConta(ContaBancaria conta){
        contas.add(conta);
    }
    public ArrayList<ContaBancaria> getContas(){
        return contas;
    }
   
}
