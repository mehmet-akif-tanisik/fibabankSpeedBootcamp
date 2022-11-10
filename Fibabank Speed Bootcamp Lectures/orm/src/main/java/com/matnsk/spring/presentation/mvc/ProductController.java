package com.matnsk.spring.presentation.mvc;

import java.util.Optional;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.matnsk.spring.data.entity.Product;
import com.matnsk.spring.data.repository.ProductRepository;


@Controller
@RequestMapping("/inventory")
public class ProductController {
	
	//@Autowired
	private ProductRepository productRepository;
	
	public ProductController(ProductRepository productRepository) {
		this.productRepository = productRepository;
	}
	
	@GetMapping("/product/insert")
	@ResponseBody
	public String insertProduct()
	{
		Product product = new Product(0,"Cep telefonu",1430);
		productRepository.save(product);
		
		return "Added to db: " + product.getProductId();
	}
	
	@GetMapping("/product/find")
	@ResponseBody
	public String findProduct()
	{
		long productId =1;
		
		Optional<Product> optional = productRepository.findById(productId);
		
		if(optional.isPresent()) {
			Product product = optional.get();
			System.out.println(product.getProductId()+" "+
								product.getProductName() + " " +
								product.getSalesPrice());
			return "Found: "+ product.getProductName();
		}
		return "Product could not find.";
	}
	
	@GetMapping("/product/list")
	@ResponseBody
	public String listProducts()
	{
		Iterable<Product> products = productRepository.findAll();
		int count = 0;
		
		for(Product product: products) {
			System.out.println(product.getProductId()+" "+
					product.getProductName() + " " +
					product.getSalesPrice());
			count++;
		}
		
		return "Total products: " + count;
	}
	
	@GetMapping("/product/expensives")
	@ResponseBody
	public String listExpensiveProducts()
	{
		double minPrice = 700;
		Iterable<Product> products = productRepository.findAllBySalesPriceMin(minPrice);
		int count = 0;
		
		for(Product product: products) {
			System.out.println(product.getProductId()+" "+
					product.getProductName() + " " +
					product.getSalesPrice());
			count++;
		}
		
		return "Total products: " + count;
	}
	
	
	
	
	@GetMapping("/product/delete")
	@ResponseBody
	public String deleteProducts()
	{
		long productId = 11;
		if(productRepository.existsById(productId)) {
			productRepository.deleteById(productId);
			return "Deleted: " + productId;
		}
		return "This item is not in list.";
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

























