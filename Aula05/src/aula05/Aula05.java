
package aula05;

public class Aula05 {

    public static void main(String[] args) {
        
        ContaBanco p1 = new ContaBanco();
        p1.setNumConta(111);
        p1.setDono("jubileu");
        p1.abrirConta("CC");
        
        ContaBanco p2 = new ContaBanco();
        p2.setNumConta(222);
        p2.setDono("creuza");
        
        
        p1.estadoAtual();
        p2.estadoAtual();
        
    }
    
}
