package org.wecancodeit.reviews.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.Collection;

@Entity
public class Genre {
    @Id
    @GeneratedValue
    private long id;
    private String name;
    private String description;
    private String imageUrl;

    @OneToMany(mappedBy = "genre")
    private Collection<Book> books;


    public Genre(String name, String description, String imageUrl) {
        this.name = name;
        this.description = description;
        this.imageUrl = imageUrl;
    }

    public Genre(){

    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public long getId(){
        return id;
    }
}
