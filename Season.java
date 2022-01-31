BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter full name of month (January, February, etc) : ");
String month = br.readLine();

public enum Season {
  WINTER, SPRING, SUMMER, AUTUMN
}

Season season;
switch (month) {
  case "December":
  case "January":
  case "February":
    season = Season.WINTER;
    System.out.println(season);
    break;
  case "March":
  case "April":
  case "May":
    season = Season.SPRING;
    System.out.println(season);
    break;
  case "June":
  case "July":
  case "August":
    season = Season.SUMMER;
    System.out.println(season);
    break;
  case "September":
  case "October":
  case "November":
    season = Season.AUTUMN;
    System.out.println(season);
    break;
  default:
    System.out.println("No this month");
}