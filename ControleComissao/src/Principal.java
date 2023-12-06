
import javax.swing.JOptionPane;


public class Principal {

    
    public static void main(String[] args) {
      Vendedor vend = new Vendedor();
      
      int op;
      double a,b;
      
      do{
          op = Integer.parseInt(JOptionPane.showInputDialog("Digite a opcao \n" + "\n 1- Nome \n 2- Salario Base \n 3- Calcular Comissao \n 0- Sair" ));
      
      
      switch (op)
      {
          case 1:
              vend.entrarNome();
              break;
          case 2:
              vend.EntrarsalarioBase();
              break;
          case 3:
             double valorVendido;
             valorVendido= Double.parseDouble(JOptionPane.showInputDialog("Digite valor vendido:"));
             vend.CalculoComissao(valorVendido);
             JOptionPane.showMessageDialog(null,"O vendedor"+ vend.getNome()+"Teve o salario:"+ vend.CalculoComissao(valorVendido));
              break;
          case 0:
            JOptionPane.showMessageDialog(null,"A Finalizar Programa");
              break;
          default:
           JOptionPane.showMessageDialog(null,"Opcao Invalida");
              break;
      }     
      } while(op!= 0);
    }
    
}
