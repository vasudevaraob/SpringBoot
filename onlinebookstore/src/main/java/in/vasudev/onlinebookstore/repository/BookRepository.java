package in.vasudev.onlinebookstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import in.vasudev.onlinebookstore.entity.Book;
//@Repository
@CrossOrigin("*")
public interface BookRepository extends JpaRepository<Book,Long>{
	

}
