package com.example.minjunlove.model;

public class User {
    String email;
    String token;
    String username;
    String bio;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    String image;
//    {
//        "user": {
//        "email": "jake@jake.jake",
//                "token": "jwt.token.here",
//                "username": "jake",
//                "bio": "I work at statefarm",
//                "image": null
//    }
//    }
}
