import java.sql.SQLException;

import dao.EnderecoDAO;
import dao.PessoaDAO;
import model.Endereco;
import model.Pessoa;

public class TesteBanco {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub

		PessoaDAO pessoa = new PessoaDAO();
		Pessoa pessoaModel1 = new Pessoa();
		EnderecoDAO enderecoDao = new EnderecoDAO();
		Endereco enderecoModel1 = new Endereco();
		Pessoa pessoaModel2 = new Pessoa();
		Endereco enderecoModel2 = new Endereco();
		
		pessoaModel1.setNome("Oscar Oliveira");
		pessoaModel1.setCpf("42757326856");
		pessoaModel1.setRg("388985616");
		pessoaModel1.setTelefone("11 22404266");
		pessoaModel1.setEmail("oscar@hotmail.com");
		enderecoModel1.setCep("02226070");
		enderecoModel1.setTipoLogradouro("Avenida");
		enderecoModel1.setEndereco("Avenida Brasil");
		enderecoModel1.setNumero("39");
		enderecoModel1.setBairro("Copacabana");
		enderecoModel1.setCidade("Rio de Janeiro");
		enderecoModel1.setUf("RJ");
		enderecoModel1.setPais("Brasil");
		
		pessoaModel2.setNome("Marcela Oliveira");
		pessoaModel2.setCpf("12345678901");
		pessoaModel2.setRg("123456789");
		pessoaModel2.setTelefone("11 23123212");
		pessoaModel2.setEmail("renata@hotmail.com");
		enderecoModel2.setCep("02324050");
		enderecoModel2.setTipoLogradouro("Rua");
		enderecoModel2.setEndereco("Rua teste");
		enderecoModel2.setNumero("329");
		enderecoModel2.setBairro("Santana");
		enderecoModel2.setCidade("São Paulo");
		enderecoModel2.setUf("SP");
		enderecoModel2.setPais("Brasil");
		
		//pessoa.inserirPessoa(pessoaModel1,enderecoModel1,enderecoDao);
		//pessoa.alterarPessoa(pessoaModel2, 26);2
		//Pessoa p = pessoa.selecionarPessoa(26, enderecoDao);
		//pessoa.deletarPessoa(26, enderecoDao);
		enderecoDao.alterarEndereco(enderecoModel2,27);
		
	}
}