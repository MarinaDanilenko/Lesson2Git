public class Lesson2Git_6 {
    public static void main(String[] rags) {
        int playingTimeInSeconds = 4567;
        int days = playingTimeInSeconds / (60 * 60 * 24);
        int hours = playingTimeInSeconds / (60 * 60);
        int minutes = playingTimeInSeconds / 60;
        int seconds = playingTimeInSeconds - days - hours - minutes;
        String playingTime = days hours : minutes : seconds;
        System.out.println(playingTime);
    }

}
