package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import model.Endereco;
import model.Pessoa;

public class EnderecoDAO {

	public void inserirEndereco(Endereco endereco, int pessoaId) throws SQLException {
		int id = -1;
		String sql = "insert into enderecos (cep, tipo_logradouro, endereco, numero, bairro, cidade, uf, pais, pessoa_id) values (?,?,?,?,?,?,?,?,?)";

		try (Connection conn = ConnectionFactory.getConnection(); PreparedStatement pst = conn.prepareStatement(sql);) {

			pst.setString(1, endereco.getCep());
			pst.setString(2, endereco.getTipoLogradouro());
			pst.setString(3, endereco.getEndereco());
			pst.setString(4, endereco.getNumero());
			pst.setString(5, endereco.getBairro());
			pst.setString(6, endereco.getCidade());
			pst.setString(7, endereco.getUf());
			pst.setString(8, endereco.getPais());
			pst.setInt(9, pessoaId);
			pst.execute();

			String query = "select LAST_INSERT_ID()";
			try (PreparedStatement pst1 = conn.prepareStatement(query); ResultSet rs = pst1.executeQuery();) {

				if (rs.next()) {
					id = rs.getInt(1);
				}
			}
		}
		
	}
		
		
	public void alterarEndereco(Endereco endereco, int pessoaId) throws SQLException {
		// int id = -1;
		String sql = "UPDATE enderecos SET cep = (?), tipo_logradouro = (?), endereco = (?), numero = (?), bairro = (?), cidade = (?), uf = (?), pais = (?) WHERE pessoa_id = " + pessoaId;

		try (Connection conn = ConnectionFactory.getConnection(); PreparedStatement pst = conn.prepareStatement(sql);) {

			pst.setString(1, endereco.getCep());
			pst.setString(2, endereco.getTipoLogradouro());
			pst.setString(3, endereco.getEndereco());
			pst.setString(4, endereco.getNumero());
			pst.setString(5, endereco.getBairro());
			pst.setString(6, endereco.getCidade());
			pst.setString(7, endereco.getUf());
			pst.setString(8, endereco.getPais());
			pst.execute();
		}
		
	}
	
	public void selecionarEndereco(int pessoaId) throws SQLException {
		String sql = "SELECT cep, tipo_logradouro, endereco, numero, bairro, cidade, uf, pais, pessoa_id from enderecos where pessoa_id = " + pessoaId;
		Connection conn = ConnectionFactory.getConnection();

		try {

			PreparedStatement ste = conn.prepareStatement(sql);
			// ste.setString(1, lo.getCodigo());

			ResultSet res = ste.executeQuery();

			String msg = null;

			while (res.next())
				
			
			
				msg = "\nCep: " + res.getString("cep")
					 + "\nTipo Logradouro: " + res.getString("tipo_logradouro")
					 + "\nEndereço:  " + res.getString("endereco") 
					 + "\nNumero: " + res.getString("numero")
					 + "\nBairro: " + res.getString("bairro")
					 + "\nCidade: " + res.getString("cidade")
					 + "\nUf: " + res.getString("uf")
					 + "\nPais: " + res.getString("pais");

			System.out.println(msg);

			
			ste.close();
			res.close();

		} catch (SQLException e) {
			System.out.println(e.toString());

		}
	}
	
	public void deletarEndereco(int pessoaId) throws SQLException {
		// int id = -1;
		String sql = "delete from enderecos where pessoa_id = " + pessoaId;

		try (Connection conn = ConnectionFactory.getConnection(); PreparedStatement pst = conn.prepareStatement(sql);) {

			pst.execute();
		}
	}


}
