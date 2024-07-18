package Assignment.json;

import java.text.ParseException;
import org.json.JSONArray;
import org.json.JSONObject;

public class UtilJson {

  public static JSONObject createJsonData() {
    /**
     * 모든 데이터를 담을 JSONObject 생성
     */

    JSONObject productInfo = new JSONObject();
    /**
     * value로 단순 값(string, int)를 가지는 프로퍼티 처리.
     * product_no
     * product_name
     */
    productInfo.put("product_no", 1);
    productInfo.put("product_name", "shirt");

    /**
     * value로 Json을 가지는 프로퍼티 처리.
     * extra_product_info JSONObject 생성
     */
    JSONObject extra_product_info = new JSONObject();

    /**
     * value로 Array를 가지는 프로퍼티 처리.
     * item_list JSONArray 생성
     */
    JSONArray item_list = new JSONArray();
    item_list.put("Tshirt");
    item_list.put("long shirt");
    item_list.put("short shirt");

    /**
     * value로 Json을 가지는 프로퍼티 처리.
     * item_list.* JSONObject 생성하세요
     */
    productInfo.put("item_list", item_list);
    productInfo.put("extra_product_info", extra_product_info);

    return productInfo;
  }

  public static void parseJsonData(JSONObject jsonObject) {

    /**
     * String 형태로 만들어져있는 JSON 데이터를 파싱해줄 객체 생성.
     */
    String product = jsonObject.toString();

    /**
     * JSON 데이터가 String 형태로 들어왔음을 가정하기 위해
     * Json 데이터를 생성하고 String 형태로 바꿔주었다.
     */
    JSONObject parsedJson = new JSONObject(product);

    /**
     * value로 단순 값(string, int)를 가지는 프로퍼티 조회.
     * product_no, product_name
     */
    parsedJson.getInt("product_no");
    parsedJson.getString("product_name");

    /**
     * value로 Json을 가지는 프로퍼티 조회.
     * extra_product_info를 꺼낼 때, JSONObject로 캐스팅.
     */
    parsedJson.getJSONObject("extra_product_info");

    /**
     * value로 Array를 가지는 프로퍼티 조회.
     * item_list를 꺼낼 때, JSONArray로 캐스팅.
     */
    parsedJson.getJSONArray("item_list");
  }

  public static void parseJsonDataUseIterator(JSONObject jsonObject) {
    /**
     * String 형태로 만들어져있는 JSON 데이터를 파싱해줄 객체 생성.
     */
    String product = jsonObject.toString();

    /**
     * JSON 데이터가 String 형태로 들어왔음을 가정하기 위해
     * Json 데이터를 생성하고 String 형태로 바꿔주었다.
     */
    JSONObject parsedJson = new JSONObject(product);

    /**
     * value로 단순 값(string, int)를 가지는 프로퍼티 조회.
     * product_no, product_name
     */
    int productNo = parsedJson.getInt("product_no");
    String productName = parsedJson.getString("product_name");
    /**
     * value로 Json을 가지는 프로퍼티 조회.
     * extra_product_info를 꺼낼 때, JSONObject로 캐스팅.
     */
    JSONObject extraProductInfo = parsedJson.getJSONObject("extra_product_info");
    /**
     * value로 Array를 가지는 프로퍼티 조회.
     * item_list를 꺼낼 때, JSONArray로 캐스팅.
     */
    JSONArray itemList = parsedJson.getJSONArray("item_list");
    /**
     * item_list의 각 원소를 JSONObject로 캐스팅 후, 변수의 키셋을 가져온다.
     * [참고] 각 원소의 키가 다를 경우 유용하다.
     */

    for (int i = 0; i < itemList.length(); i++) {
      JSONObject items = itemList.getJSONObject(i);
    }

  }

  public static String jsonToString(JSONObject jsonObject) {
    return jsonObject.toString();
  }


}
