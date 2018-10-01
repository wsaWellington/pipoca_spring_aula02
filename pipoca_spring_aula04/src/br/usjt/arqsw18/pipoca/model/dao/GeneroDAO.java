package br.usjt.arqsw18.pipoca.model.dao;

import java.io.IOException;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import br.usjt.arqsw18.pipoca.model.entity.Genero;
@Repository
public class GeneroDAO {
	@PersistenceContext
	EntityManager manager;

	public Genero buscarGenero(int id) throws IOException {
		return manager.find(Genero.class, id);
	}

	public List<Genero> listarGeneros() throws IOException {
		return manager.createQuery("select g from Genero g").getResultList();
	}
}
