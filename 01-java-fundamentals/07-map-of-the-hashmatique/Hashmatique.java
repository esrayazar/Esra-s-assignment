import java.util.HashMap;

public class Hashmatique {
    public static void main(String[] args) {
        HashMap<String, String> tracklist = new HashMap<>();
        tracklist.put("Baby One More Time","How was I supposed to know");
        tracklist.put("Can I Get It","Pave me a path to follow");
        tracklist.put("Blinding Lights","I've been on my own for long enough");
        tracklist.put("Easy on me","There ain't no gold in this river");

        String title = tracklist.get("Blinding Lights");
        System.out.println(title);
        
        for(String key : tracklist.keySet()) {
            System.out.println("Track: "+ key + "Lyrics"+ tracklist.get(key));    
        }
    }
    
}
