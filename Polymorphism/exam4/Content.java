package Assignment.Polymorphism.exam4;

public abstract class Content {

  private String title;
  private int price;

  Content() {
  }

  Content(String title) {
    this.title = title;
  }

  abstract void totalPrice();

  public String getTitle() {
    return this.title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public int getPrice() {
    return this.price;
  }

  public void setPrice(int price) {
    this.price = price;
  }

  public void show() {
    System.out.println(title + " 비디오의 가격은 " + price + "원 입니다.");
  }
}
