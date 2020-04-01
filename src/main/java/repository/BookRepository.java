package repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository;

import beans.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Long>{
	
	
	
	
}
