package Models;

import Helpers.*;
import java.util.*;

public class Movie{
  //init proprities  
  private static Map<String,Movie> movieMap;
  private static ArrayList<Movie> movieList;
  private static Set<Movie> movieSet;//list or hashmap or hashset
  private String title;
  private String description;
  private Genre genre;
  private String imgPath;
  private float rating;

  public Movie(String title, String description, String ImgPath, Genre genre, float rating) {
    this.title = title;
    this.description = description;
    this.imgPath = ImgPath;
    this.genre = genre;
    this.rating = rating;
    this.init();
    this.addMovie();
  }
  
  //adding Movie to static sets and maps
  private void addMovie(){
      movieMap.put(this.title, this);
      movieSet.add(this);
      movieList.add(this);
  }
  
  private void init(){
    movieList = new ArrayList<>();
  }
  
  //setters & getters
  public static Map<String, Movie> getMovieMap() {
    return movieMap;
  }
  public static ArrayList<Movie> getMovieList() {
    return movieList;
  }
  public static Set<Movie> getMovieSet() {
    return movieSet;
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
  public String getImgPath() {
    return imgPath;
  }
  public void setImgPath(String ImgPath) {
    this.imgPath = ImgPath;
  }
  public Genre getGenre() {
    return genre;
  }
  public void setGenre(Genre genre) {
    this.genre = genre;
  }
  public float getRating() {
    return rating;
  }
  public void setRating(float rating) {
    this.rating = rating;
  }
}