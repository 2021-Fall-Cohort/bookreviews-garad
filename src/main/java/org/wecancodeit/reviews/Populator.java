package org.wecancodeit.reviews;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.wecancodeit.reviews.model.Book;
import org.wecancodeit.reviews.model.Genre;
import org.wecancodeit.reviews.repositories.BookRepository;
import org.wecancodeit.reviews.repositories.GenreRepository;
@Component
public class Populator implements CommandLineRunner {
    private GenreRepository genreRepository;
    private BookRepository bookRepository;

    public Populator(GenreRepository genreRepository, BookRepository bookRepository) {
        this.genreRepository = genreRepository;
        this.bookRepository = bookRepository;
    }

    @Override
    public void run(String... args) throws Exception{
        Genre nonFiction = new Genre("Non-Fiction","Writing about real things","https://tinyurl.com/yckkd3mx");
        Genre fiction = new Genre("Fiction","Writing dealing with thing that aren't real","https://tinyurl.com/2p8a6dhc");
        genreRepository.save(nonFiction);
        genreRepository.save(fiction);

        Book autoBioOfMalcolmX = new Book("Autobiography of Malcolm X","Malcolm X and Alex Haley","Grove Press","This book details the life of a Malcolm X who was an influental leader in the civil rights movement","10/10", "Assata an Autobiography","https://tinyurl.com/5cmtvfud","Garad Osman",nonFiction,"This book was an amazing book that led me through the life of a very impactful man who changed his life in prison to a life of leadership and helping people. I give it a 10/10");
        Book harryPotter = new Book("Harry Potter and the Sorcerer's Stone","J.K. Rowling","Scholastic Corporation","A Book of a young orphan who finds powers and a home","10/10","Harry Potter and the Chamber of Secrets ","https://tinyurl.com/ycyf5jht","Garad Osman",fiction,"An amazing book that leads you through the life of a young boy who's thought to be nothing but ends up finding a life of meaning through magic");
        bookRepository.save(autoBioOfMalcolmX);
        bookRepository.save(harryPotter);

    }
}
