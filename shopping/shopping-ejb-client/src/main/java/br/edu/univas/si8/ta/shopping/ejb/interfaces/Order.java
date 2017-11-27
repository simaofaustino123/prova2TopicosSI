package br.edu.univas.si8.ta.shopping.ejb.interfaces;

public interface Order {
	
void createNewProduct(String productDescription);
	
	String[] listProductDescription();

}
