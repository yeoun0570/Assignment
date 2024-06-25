package Assignment.Class_Practice.Practice03;

public class Sparrow {

  //이름
  String name = "참새";
  //다리의 수
  int legs = 2;
  //몸길이
  int length;


  //날다
  public String fly() {
    return "날아다닙니다.";
  }

  //울다
  public String sing() {
    return "소리내어 웁니다.";
  }

  //이름 기록하기
  public String setName(String alias) {
    String setName = alias;
    return setName;
  }

  //문자열 출력하기
  public String toString() {
    return name + "(" + setName("짹짹") + ")" + "는" + " " + fly() + "\n" + name + "(" + setName(
        "짹짹") + ")" + "가" + " "
        + sing() + "\n" + name + "의 이름은" + " " + setName("짹짹") + " 입니다.";
  }

}
