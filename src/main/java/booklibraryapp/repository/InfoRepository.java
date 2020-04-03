package booklibraryapp.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import booklibraryapp.beans.BookInfo;

@Repository
public interface InfoRepository extends JpaRepository<BookInfo, Long>{

}
