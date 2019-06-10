package edu.cnm.deepdive.atthemovies.model;

import androidx.annotation.NonNull;

public class Movie {

  private String title;

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  @NonNull
  @Override
  public String toString() {
    return title;
  }

}
