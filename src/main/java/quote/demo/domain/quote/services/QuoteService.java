package quote.demo.domain.quote.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import quote.demo.domain.quote.models.Quote;

@Service
public class QuoteService {
    private static Logger logger = LoggerFactory.getLogger(QuoteService.class);

    public Quote getQuoteFromApi(){
        RestTemplate restTemplate = new RestTemplate();
        Quote quote = restTemplate.getForObject("https://quoters.apps.pcfone.io/api/random", Quote.class);
        return quote;
    }

}
