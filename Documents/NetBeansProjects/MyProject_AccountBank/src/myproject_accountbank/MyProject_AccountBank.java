package myproject_accountbank;

/**
 *
 * @author Alexssandro
 */
public class MyProject_AccountBank {


    public static void main(String[] args) {
        AccountBank p1 = new AccountBank();
        p1.setNumConta (1111);
        p1.setDono ("Alexssandro");
        p1.abrirConta("CC");
        p1.depositar(100);
        p1.sacar(100);
        
        
        
        AccountBank p2 = new AccountBank();
        p2.setNumConta (2222);
        p2.setDono ("Valdemir");
        p2.abrirConta ("CP");
        p2.depositar(300);
        p2.sacar(450);
        
  
        p1.estadoAtual();
        p2.estadoAtual();
        
        
        
 }
    
}
