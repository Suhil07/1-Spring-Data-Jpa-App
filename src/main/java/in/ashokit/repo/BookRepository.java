package in.ashokit.repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import in.ashokit.entity.Book;

public interface BookRepository extends CrudRepository<Book, Integer>
{
	
	public List<Book> findByBookPriceGreaterThan(Double price);
	
	public List<Book> findByBookPriceLessThan(Double price);
	
	public List<Book> findByBookName(String name);
}

