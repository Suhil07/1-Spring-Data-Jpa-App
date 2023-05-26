package in.ashokit;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.ashokit.entity.Book;
import in.ashokit.repo.BookRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) 
	{
		ConfigurableApplicationContext ctxt = SpringApplication.run(Application.class, args);
		BookRepository repo = ctxt.getBean(BookRepository.class);
	
		/*
		 Book b1 = new Book(); 
		 
		b1.setBookId(104);
		b1.setBookName("React-Js");
		b1.setBookPrice(2800.00);
		
		Book b2 = new Book(); 
		b2.setBookId(105);
		b2.setBookName("Vue-Js");
		b2.setBookPrice(4500.00);
		repo.saveAll(Arrays.asList(b1,b2));
		
		System.out.println("Record inserted.....");
	*/
		
		/*
		  Optional<Book> findById = repo.findById(101);
		   System.out.println(findById.get());	
		 */
		/*
		List<Book> books = repo.findByBookPriceGreaterThan(3000.00);
		for(Book b : books)
		{
			System.out.println(b);
		}
		*/
		/*
		List<Book> books = repo.findByBookPriceLessThan(3000.00);
		for(Book b : books)
		{
			System.out.println(b);
		}
		*/
		List<Book> books = repo.findByBookName("Spring");
		for(Book b : books)
		{
			System.out.println(b);
		}
		
		
		
		
	}

}
