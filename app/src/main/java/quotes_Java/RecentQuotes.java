package quotes_Java;

import java.util.ArrayList;
import java.util.List;

public class RecentQuotes {
//    private List<String> tags = new ArrayList<String>();
    private String author;
//    private String likes;
    private String text;



    public String getAuthor() {
        return author;
    }



    public String getText() {
        return text;
    }


    @Override
    public String toString() {
        return "Today's Quote: \n" +
                "Quote: " + text + "\n" +
                "author: " + author ;
    }
}
