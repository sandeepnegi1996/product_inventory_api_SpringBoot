package sandy.services;
import java.util.Collection;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sandy.dao.ProductDao;
import sandy.entity.Product;
@Service
public class ProductServiceImpl implements ProductService {
	
	@Autowired
	private ProductDao productDao;
	
	@Override
	public  Collection<Product>	getAllProducts(){
		return this.productDao.getAllProducts();
	}
	
	@Override
	public Product getProductById(int id) {
		return this.productDao.getProductById(id);
	}
	
	@Override
	public Product deleteProductById(int id){
		return this.productDao.delteProductById(id);
	}
	
	@Override
	public Product updateProduct(Product product) {
		return this.productDao.updateProduct(product);
	}
	
	@Override
	public void addProduct(Product product) {
		 this.productDao.addProduct(product);
	}

}
