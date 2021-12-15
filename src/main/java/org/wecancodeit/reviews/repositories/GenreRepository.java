package org.wecancodeit.reviews.repositories;

import org.springframework.data.repository.CrudRepository;
import org.wecancodeit.reviews.model.Genre;

public interface GenreRepository extends CrudRepository<Genre, Long> {
    Genre findByNameIgnoreCase(String name);
}
