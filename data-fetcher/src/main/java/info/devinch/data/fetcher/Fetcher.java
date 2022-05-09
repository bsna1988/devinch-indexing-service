package info.devinch.data.fetcher;

import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.util.stream.Stream;

public interface Fetcher {
    Stream<FetchedData> fetchData(ZonedDateTime from, ZonedDateTime to);
}
