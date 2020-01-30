package sandy.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import sandy.entity.Product;
import sandy.services.ProductService;
import sandy.entity.*;



@CrossOrigin
@Controller
@RequestMapping("/api/v1")
public class ProductController {
	
	@Autowired
	private ProductService productService;
	
	
	//Read all the products
	@RequestMapping(value="/getallproducts",method=RequestMethod.GET)
	public @ResponseBody Iterable<Product> getAllProducts(){
		System.out.println("inside the getAllProducts");
		return this.productService.getAllProducts();
	}
	
	
	//Read products by given Id
	@RequestMapping(value="/getproductbyid/{id}",method=RequestMethod.GET)
	public @ResponseBody Product getProductById(@PathVariable("id") int id) {
		System.out.println("inside the getProductById");
		return this.productService.getProductById(id);
	}
	
	//Delete the product with given Id
	
	@RequestMapping(value="/deletebyid/{id}",method=RequestMethod.DELETE)
	public Product deleteProductById(@PathVariable("id") int id) {
	  System.out.println("inside the delete by id controller ");
	  return this.productService.deleteProductById(id);
	}
	
	//Update the Product Record 
	//for this we will be sending the complete object in the request 
	//and we will update the details of the student 
	
	
	@RequestMapping(method=RequestMethod.PUT,consumes=MediaType.APPLICATION_JSON_VALUE)
	public Product updateProduct(@RequestBody Product product ) {
		
		return this.productService.updateProduct(product);
	}
	
	//Insert the new Record in the Database
	//we will receive the json object from the POST request all we need to do is to store that record in the database
	
	
	
	@RequestMapping(method=RequestMethod.POST,consumes=MediaType.APPLICATION_JSON_VALUE)
	public void addProduct(@RequestBody Product product) {
			this.productService.addProduct(product);
	}
	
	
	
	
}
