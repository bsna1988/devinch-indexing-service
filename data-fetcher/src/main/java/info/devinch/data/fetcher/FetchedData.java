package info.devinch.data.fetcher;

import java.time.ZonedDateTime;
import java.util.Map;

public interface FetchedData {
    String getText();
    String[] getTags();
    byte[] getFirstImage();
    String getAuthor();
    ZonedDateTime getDateTime();
    int getCommentsCount();
    Map<String, Integer> getReactionsCounts();
}
