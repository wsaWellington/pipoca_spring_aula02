package br.usjt.pi.pessoa.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import br.usjt.pi.pessoa.model.Pessoa;

public class PessoaDAO {

	public int inserirPessoa(Pessoa pessoa) throws SQLException {
		int id = -1;
		String sql = "insert into pessoa (nome, cpf, rg, telefone, email) values (?,?,?,?,?)";

		try (Connection conn = ConnectionFactory.getConnection(); PreparedStatement pst = conn.prepareStatement(sql);) {

			pst.setString(1, pessoa.getNome());
			pst.setString(2, pessoa.getCpf());
			pst.setString(3, pessoa.getRg());
			pst.setString(4, pessoa.getTelefone());
			pst.setString(5, pessoa.getEmail());
			pst.execute();

			String query = "select LAST_INSERT_ID()";
			try (PreparedStatement pst1 = conn.prepareStatement(query); ResultSet rs = pst1.executeQuery();) {

				if (rs.next()) {
					id = rs.getInt(1);
				}
			}
		}
		return id;
	}

	public int alterarPessoa(Pessoa pessoa, int id) throws SQLException {
		// int id = -1;
		String sql = "UPDATE pessoa SET nome = (?), cpf = (?), rg = (?), telefone = (?), email = (?) WHERE id = " + id;

		try (Connection conn = ConnectionFactory.getConnection(); PreparedStatement pst = conn.prepareStatement(sql);) {

			pst.setString(1, pessoa.getNome());
			pst.setString(2, pessoa.getCpf());
			pst.setString(3, pessoa.getRg());
			pst.setString(4, pessoa.getTelefone());
			pst.setString(5, pessoa.getEmail());
			pst.execute();
		}
		return id;
	}

	public void selecionarPessoa(int id) throws SQLException {
		String sql = "SELECT nome, cpf, rg, telefone, email from pessoa where id = " + id;
		Connection conn = ConnectionFactory.getConnection();

		try {

			PreparedStatement ste = conn.prepareStatement(sql);
			// ste.setString(1, lo.getCodigo());

			ResultSet res = ste.executeQuery();

			String msg = null;

			while (res.next())
				
			
			
				msg = "Nome: " + res.getString("nome")
					 + "\nCpf: " + res.getString("cpf")
					 + "\nRg:  " + res.getString("rg") 
					 + "\nTelefone: " + res.getString("telefone")
					 + "\nEmail: " + res.getString("email");

			System.out.println(msg);

			
			ste.close();
			res.close();

		} catch (SQLException e) {
			System.out.println(e.toString());

		}
	}
	/*
	 * public static String selecionarPessoa(int id) throws SQLException {
	 * ArrayList<Pessoa> pessoa = new ArrayList<Pessoa>(); Statement stmt = null;
	 * Connection conn = ConnectionFactory.getConnection(); String result = "";
	 * 
	 * 
	 * 
	 * try { String sql =
	 * "SELECT nome, cpf, rg, telefone, email from pessoa where id = " + id; stmt =
	 * (Statement) conn.createStatement(); ResultSet rs = stmt.executeQuery(sql);
	 * while (rs.next()) { String nome = rs.getString("nome"); String cpf =
	 * rs.getString("cpf"); String rg = rs.getString("rg"); String telefone =
	 * rs.getString("telefone"); String email = rs.getString("email");
	 * 
	 * Pessoa p = new Pessoa(nome, cpf, rg, telefone, email); pessoa.add(p); result
	 * = "Nome: " + p.getNome() + "\nCpf: " + p.getCpf() + "\nRg: " + p.getRg() +
	 * "\nTelefone: " + p.getTelefone() + "\nEmail: " + p.getEmail();
	 * 
	 * } } catch (SQLException ex) { System.out.println(ex.toString()); } catch
	 * (Exception ex) { System.out.println(ex.toString()); } return result; }
	 * 
	 */

	public int deletarPessoa(int id) throws SQLException {
		// int id = -1;
		String sql = "delete from pessoa where id = " + id;

		try (Connection conn = ConnectionFactory.getConnection(); PreparedStatement pst = conn.prepareStatement(sql);) {

			pst.execute();
		}
		return id;
	}
}
