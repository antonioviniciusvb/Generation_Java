package pharmacy.repository;

import java.util.Optional;

import pharmacy.model.Product;

public interface ProductRepository {
	
	public void register(Product product);
	public void listAll();
	public void findById(int productId);
	public void delete(int productId);
	public void update(Optional<Product> product);

}
