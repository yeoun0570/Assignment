package Assignment.Polymorphism.exam4;

public class Video extends Content {

  private String genre;
  String title;

  Video() {
  }

  Video(String title, String genre) {
    super(title);
    this.genre = genre;
  }

  public String getGenre() {
    return this.genre;
  }

  public void setGenre(String genre) {
    this.genre = genre;
  }

  @Override
  void totalPrice() {
    if (genre.equals("new")) {
      setPrice(2000);
    } else if (genre.equals("comic")) {
      setPrice(1500);
    } else if (genre.equals("child")) {
      setPrice(1000);
    } else {
      setPrice(500);
    }
  }
}
