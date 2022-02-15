package SeasonExample;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class SeasonExample {
  enum Season {
    AUTUMN,
    SPRING,
    SUMMER,
    WINTER,
  }
  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    System.out.println("enter a month");

    String input = br.readLine();

    Season seasons;

    switch (input.toLowerCase()) {
      case "december":
      case "january":
      case "february":
        seasons = Season.WINTER;
        System.out.println(seasons);
        break;

      case "march":
      case "april":
      case "may":
        seasons = Season.SPRING;
        System.out.println(seasons);
        break;

      case "june":
      case "july":
      case "august":
        seasons = Season.SUMMER;
        System.out.println(seasons);
        break;

      case "september":
      case "october":
      case "november":
        seasons = Season.AUTUMN;
        System.out.println(seasons);
        break;

      default:
        System.out.println("No this month");
    }
  }
}
