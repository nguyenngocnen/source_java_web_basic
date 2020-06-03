package nongsan.webmvc.service;

import nongsan.webmvc.model.Product;
import java.util.List;
public interface ProductService {
	void insert(Product product);

	void edit(Product product);

	void delete(String id);

	Product get(int id);
	
	Product get(String name);

	List<Product> getAll();

}

