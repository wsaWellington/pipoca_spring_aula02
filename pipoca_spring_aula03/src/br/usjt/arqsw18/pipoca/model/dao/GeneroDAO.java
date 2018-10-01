package br.usjt.arqsw18.pipoca.model.dao;

import java.util.ArrayList;

import javax.persistence.EntityManager;

import br.usjt.arqsw18.pipoca.model.entity.Genero;

public class GeneroDAO {

	EntityManager manager;

	public GeneroDAO(EntityManager manager) {
		this.manager = manager;
	}

	public Genero buscarGenero(int id){
		return manager.find(Genero.class, id);
	}

	
	@SuppressWarnings("unchecked")
	public ArrayList<Genero> listarGeneros(){
	return (ArrayList<Genero>) manager.createQuery("select g from Genero g").getResultList();
	}
	
}
