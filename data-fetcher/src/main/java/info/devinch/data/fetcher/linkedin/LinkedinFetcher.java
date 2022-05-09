package info.devinch.data.fetcher.linkedin;

import java.time.ZonedDateTime;
import java.util.stream.Stream;

import info.devinch.data.fetcher.FetchedData;
import info.devinch.data.fetcher.Fetcher;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LinkedinFetcher implements Fetcher {
    private static final Logger logger = LoggerFactory.getLogger(LinkedinFetcher.class);

    @Override
    public Stream<FetchedData> fetchData(ZonedDateTime from, ZonedDateTime to) {
        logger.info("Going to fetch data from Linkedin from {} to {}", from, to);
        return Stream.empty();
    }
}
