package org.wecancodeit.reviews.model;


import javax.persistence.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;

@Entity
public class Book {
    @Id
    @GeneratedValue
    private long id;
    private String nameOfBook;
    private String author;
    private String publisher;
    private String description;
    private String ratingOfReviewer;
    private String similarBooks;
    private String imageUrl;
    @Lob
    @ElementCollection
    private Collection<String> reviews;
    private String reviewBy;

    @ManyToOne
    private Genre genre;

    @ManyToMany
    private Hashtag hashtags;


    public Book(String nameOfBook, String author, String publisher, String description, String ratingOfReviewer, String similarBooks,String imageUrl,String reviewBy, String review, Hashtag... hashtag) {
        this.nameOfBook = nameOfBook;
        this.author = author;
        this.publisher = publisher;
        this.description = description;
        this.ratingOfReviewer = ratingOfReviewer;
        this.similarBooks = similarBooks;
        this.imageUrl = imageUrl;
        this.reviewBy = reviewBy;
        this.reviews = new ArrayList<String >();
        this.reviews.add(review);
        this.hashtags = (Hashtag) Arrays.asList(hashtag);
    }

    public Book(){

    }
    public void addHashtag(Hashtag hashtag){

    }

    public String getNameOfBook() {
        return nameOfBook;
    }

    public String getAuthor() {
        return author;
    }

    public String getPublisher() {
        return publisher;
    }

    public String getDescription() {
        return description;
    }

    public String getRatingOfReviewer() {
        return ratingOfReviewer;
    }

    public String getSimilarBooks() {
        return similarBooks;
    }

    public long getId() {
        return id;
    }
    public Genre getGenre(){
        return genre;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public Collection<Hashtag> getHashtag(){
        return (Collection<Hashtag>) hashtags;
    }

    public Collection<String> getReviews() {
        return reviews;
    }

    public String getReviewBy(){
        return reviewBy;
    }
    public void addReview(String review){
        reviews.add(review);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return id == book.id && Objects.equals(nameOfBook, book.nameOfBook) && Objects.equals(author, book.author) && Objects.equals(publisher, book.publisher) && Objects.equals(description, book.description) && Objects.equals(ratingOfReviewer, book.ratingOfReviewer) && Objects.equals(similarBooks, book.similarBooks) && Objects.equals(imageUrl, book.imageUrl) && Objects.equals(reviews, book.reviews) && Objects.equals(reviewBy, book.reviewBy) && Objects.equals(genre, book.genre) && Objects.equals(hashtags, book.hashtags);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nameOfBook, author, publisher, description, ratingOfReviewer, similarBooks, imageUrl, reviews, reviewBy, genre, hashtags);
    }
}

