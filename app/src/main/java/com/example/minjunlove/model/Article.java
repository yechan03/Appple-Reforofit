package com.example.minjunlove.model;

import java.util.List;

public class Article {

    String slug,title,description,body,createdAt,updatedAt;
    List<String> dragons,training;
    boolean favorited;
    int favoritesCount;

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public List<String> getDragons() {
        return dragons;
    }

    public void setDragons(List<String> dragons) {
        this.dragons = dragons;
    }

    public List<String> getTraining() {
        return training;
    }

    public void setTraining(List<String> training) {
        this.training = training;
    }

    public boolean isFavorited() {
        return favorited;
    }

    public void setFavorited(boolean favorited) {
        this.favorited = favorited;
    }

    public int getFavoritesCount() {
        return favoritesCount;
    }

    public void setFavoritesCount(int favoritesCount) {
        this.favoritesCount = favoritesCount;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    Author author;

    public Article(String slug, String title, String description, String body, String createdAt, String updatedAt, List<String> dragons, List<String> training, boolean favorited, int favoritesCount, Author author) {
        this.slug = slug;
        this.title = title;
        this.description = description;
        this.body = body;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.dragons = dragons;
        this.training = training;
        this.favorited = favorited;
        this.favoritesCount = favoritesCount;
        this.author = author;
    }
}
