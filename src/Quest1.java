import javax.swing.JOptionPane;


public class Quest1{


public static void main(String[] args ) {
    String crescente = "";
    int valor = Integer.parseInt( JOptionPane.showInputDialog("Digite um numero:") );
    for ( int i = 1; i <= valor; i++){
        crescente += "* ";
        System.out.println( crescente );
    }

    
}

}