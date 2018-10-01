package teste;
import java.sql.SQLException;

import br.usjt.pi.pessoa.dao.PessoaDAO;
import br.usjt.pi.pessoa.model.Pessoa;

public class TesteBanco {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub

		PessoaDAO pessoa = new PessoaDAO();
		Pessoa pessoaModel = new Pessoa();

		pessoaModel.setNome("Wellington");
		pessoaModel.setCpf("42757326856");
		pessoaModel.setRg("388985616");
		pessoaModel.setTelefone("22404266");
		pessoaModel.setEmail("wellington.95@outlook.com");

		Pessoa pessoaModel2 = new Pessoa();

		pessoaModel2.setNome("Anacleto");
		pessoaModel2.setCpf("0221231234");
		pessoaModel2.setRg("123456789");
		pessoaModel2.setTelefone("22412166");
		pessoaModel2.setEmail("welln.95@outlook.com");
		
		pessoa.inserirPessoa(pessoaModel);
		pessoa.alterarPessoa(pessoaModel2, 4);
		
		//pessoa.deletarPessoa(4);
		
		pessoa.selecionarPessoa(6);
		
		

	}
}