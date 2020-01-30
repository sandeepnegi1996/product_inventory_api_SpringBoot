package sandy.services;

import java.util.Collection;

import sandy.entity.Product;

public interface ProductService {

	Collection<Product> getAllProducts();

	Product getProductById(int id);

	Product deleteProductById(int id);

	Product updateProduct(Product product);

	void addProduct(Product product);

}