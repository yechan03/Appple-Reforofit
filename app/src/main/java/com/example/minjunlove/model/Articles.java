package com.example.minjunlove.model;

import java.util.List;

public class Articles {

    private List<Article> articles;

    public List<Article> getArticles() {
        return articles;
    }

    public void setArticles(List<Article> articles) {
        this.articles = articles;
    }

    public int getArticlesCount() {
        return articlesCount;
    }

    public void setArticlesCount(int articlesCount) {
        this.articlesCount = articlesCount;
    }

    public Articles(List<Article> articles, int articlesCount) {
        this.articles = articles;
        this.articlesCount = articlesCount;
    }

    private int articlesCount;
}
