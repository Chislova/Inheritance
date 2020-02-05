public class Audio extends Media implements Play {
 private int numberOfTheSong;
 private String song;

 public String getSong() {
  return song;
 }

 public String favSong() {
  return "New favorite Song is" + song;
}

 @Override
 public void toPlay() {
  System.out.println(favSong());
 }
}
