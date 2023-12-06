
import javax.swing.JOptionPane;


public class Vendedor {
    private String Nome;
    private double salarioBase;
    private double valorVendido;
    private double novoSalario;

    public Vendedor() {
        this ("", 0.0, 0.0, 0.0);
    }

    public Vendedor(String Nome, double salarioBase, double valorVendido, double novoSalario) {
        this.Nome = Nome;
        this.salarioBase = salarioBase;
        this.valorVendido = valorVendido;
        this.novoSalario = novoSalario;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public double getValorVendido() {
        return valorVendido;
    }

    public void setValorVendido(double valorVendido) {
        this.valorVendido = valorVendido;
    }

    public double getNovoSalario() {
        return novoSalario;
    }

    public void setNovoSalario(double novoSalario) {
        this.novoSalario = novoSalario;
    }
    
    public double CalculoComissao (double valorVendido){
        this.setNovoSalario(getValorVendido()*10/100 + getSalarioBase());
        return this.salarioBase;
    }
    
    public void entrarNome(){
      setNome(JOptionPane.showInputDialog("Digite  Nome:"));
      
     
    }
    
    public void EntrarsalarioBase(){
         setSalarioBase(Double.parseDouble(JOptionPane.showInputDialog("Digite salario:")));
        
        
    }
    
}
