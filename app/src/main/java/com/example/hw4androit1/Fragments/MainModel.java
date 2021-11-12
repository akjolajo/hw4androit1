package com.example.hw4androit1.Fragments;

public class MainModel {
   private String nameofsinger;
   private String nameofsong;
   private String namberofsong;
   private String timeofsong;

    public String getNameofsinger() {
        return nameofsinger;
    }

    public void setNameofsinger(String nameofsinger) {
        this.nameofsinger = nameofsinger;
    }

    public String getNameofsong() {
        return nameofsong;
    }

    public void setNameofsong(String nameofsong) {
        this.nameofsong = nameofsong;
    }

    public String getNamberofsong() {
        return namberofsong;
    }

    public void setNamberofsong(String namberofsong) {
        this.namberofsong = namberofsong;
    }

    public String getTimeofsong() {
        return timeofsong;
    }

    public void setTimeofsong(String timeofsong) {
        this.timeofsong = timeofsong;
    }

    public MainModel(String nameofsinger, String nameofsong, String namberofsong, String timeofsong) {
        this.nameofsinger = nameofsinger;
        this.nameofsong = nameofsong;
        this.namberofsong = namberofsong;
        this.timeofsong = timeofsong;
    }
}
