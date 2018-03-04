public class FP {
    public static void main (String [] args) {
        int summary = 489093353;
        int seconds = summary % 60;
        int sec = summary / 60;
        int minutes = sec % 60;
        int min = sec / 60;
        int hours = min / 60;
        System.out.println(hours + " часов, " + minutes + " минут, " + seconds + " секунд.");
    }
}


<!--
    public class HelloWorld {
  public static void main(String[] args) {
    int s = 3700;
    int sec;
    int m;
    int min, h;
    sec = s % 60;
    m = (s - sec) / 60;
    min = m % 60;
    h = (m - min) / 60;
    System.out.println(h+" часов " + min + " минут " + sec + " секунд");
  }
}
-->
