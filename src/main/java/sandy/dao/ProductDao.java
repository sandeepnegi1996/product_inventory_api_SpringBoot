package sandy.dao;

import java.util.Collection;

import sandy.entity.Product;

public interface ProductDao {

	Collection<Product> getAllProducts();

	Product getProductById(int id);

	Product delteProductById(int id);

	Product updateProduct(Product product);

	void addProduct(Product product);

}