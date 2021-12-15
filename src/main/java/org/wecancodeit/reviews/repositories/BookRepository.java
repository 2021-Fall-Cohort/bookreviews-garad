package org.wecancodeit.reviews.repositories;
import org.springframework.data.repository.CrudRepository;

import org.wecancodeit.reviews.model.Book;

public interface BookRepository extends CrudRepository<Book,Long> {
    Book findByNameOfBookIgnoreCase(String nameOfBook);

}