package Assignment.Class_Practice.Practice01;

public class Movie {

  //제목 title 장르 genre
  private String title;

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getGenre() {
    return genre;
  }

  public void setGenre(String genre) {
    this.genre = genre;
  }

  private String genre;

  public void play() {
    System.out.println(title + "(" + genre + ") 상영중입니다.");
  }
}
