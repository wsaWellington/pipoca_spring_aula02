import javax.swing.JOptionPane;

public class Teste {

	public static void main(String args[]) {

		String teste;
		do {
			teste = JOptionPane.showInputDialog("Digite alguma coisa ou escreva 0 para sair");

			JOptionPane.showMessageDialog(null, teste);

		} while (teste != "a");

	}

}
