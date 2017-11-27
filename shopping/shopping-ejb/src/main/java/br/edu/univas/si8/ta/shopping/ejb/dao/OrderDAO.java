package br.edu.univas.si8.ta.shopping.ejb.dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import br.edu.univas.si8.ta.shopping.ejb.entities.Product;

@Stateless
public class OrderDAO {

	@PersistenceContext(unitName = "shopping")
	private EntityManager em;
	
	public void insert(Product product){
		em.persist(product);
	}
	
	public List<Product> listAll(){
		return em.createQuery("from shopping_order s", Product.class).getResultList();
	}
	
}
