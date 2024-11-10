package com.portglint.first.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import java.util.Date;

@Document(collection = "products")
@Data
public class Product {
    @Id
    private String id;

    @Field(name = "name")
    private String name;

    @Field(name = "description")
    private String description;

    @Field(name = "price")
    private Double price;

    @Field(name = "created_at")
    private Date createdAt;

    @Field(name = "updated_at")
    private Date updatedAt;

    // Methods to automatically set timestamps
    public void prePersist() {
        this.createdAt = new Date();
        this.updatedAt = new Date();
    }

    public void preUpdate() {
        this.updatedAt = new Date();
    }
}
