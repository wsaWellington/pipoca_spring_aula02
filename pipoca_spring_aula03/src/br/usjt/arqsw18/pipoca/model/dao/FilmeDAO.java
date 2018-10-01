package br.usjt.arqsw18.pipoca.model.dao;

import java.util.ArrayList;

import javax.persistence.EntityManager;

import org.springframework.stereotype.Repository;

import br.usjt.arqsw18.pipoca.model.entity.Filme;

@Repository
public class FilmeDAO {
	EntityManager manager;
	
	public FilmeDAO(EntityManager manager) {
		this.manager = manager;
	}
	
	public void inserirFilme(Filme filme) {
		manager.persist(manager);
	}

	public Filme buscarFilme(int id){
		return manager.find(Filme.class, id);
	}

	@SuppressWarnings("unchecked")
	public ArrayList<Filme> listarFilmes(){
	return (ArrayList<Filme>) manager.createQuery("select f from Filme f").getResultList();
	}

}
