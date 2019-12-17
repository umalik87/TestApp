import org.socialsignin.spring.data.dynamodb.repository.EnableScan;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

@EnableScan
public interface BookRepository extends CrudRepository<Book, String> {

    List<Book> findById(String id);
}