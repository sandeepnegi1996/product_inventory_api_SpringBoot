package sandy.dao;
import java.util.Collection;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

import sandy.entity.Product;

@SuppressWarnings("serial")
@Repository
public class ProductDaoImpl implements ProductDao {
	
	private static Map<Integer,Product> products;
	
	static {
		
		products=new HashMap<Integer,Product>(){
			{
			
			 put(1, new Product(1,"apple juice",5));

			 put(2, new Product(2,"orange juice",5));

			 put(3, new Product(3,"banana juice",5));

			 put(4, new Product(4,"grape juice",5));
			}
		};
	}
	
	
	@Override
	public Collection<Product> getAllProducts(){
		
		return ProductDaoImpl.products.values();
		
	}
	
	@Override
	public Product getProductById(int id) {
		
		System.out.println("this is inside DAO ");
		return this.products.get(id);
	}
	
	
	@Override
	public Product delteProductById(int id) {
		System.out.println("inside the deleting DAO");
		return this.products.remove(id);
	}
	
	
	@Override
	public Product updateProduct(Product product) {
		System.out.println("updating the product details ");
		
		//so we are basically reading the values 
		//such as id,name,quantity
		// from the object which is sent to us 
		//and then we are going to update this 
		// details to object that we are having on the basis of id
		
		
		 Product p= products.get(product.getPid());
		 int id=product.getPid();
		 String pname=product.getpName();
		 int pQuant=product.getPQuantity();
		
		 p.setPid(id);
		 p.setpName(pname);
		 p.setPQuantity(pQuant);
		 return p; 
	}
	
	@Override
	public void addProduct(Product product) {
		System.out.println("inside the add product DAO ");
		
		//size will give us the total number of keys
		//so the json object that we get from the request 
		//we are injecting that in the last of the hashmap
		//just by calculating the size
		int lastkey=products.size();
		System.out.println(lastkey);
		products.put(++lastkey, product);
		
	}
	

}
