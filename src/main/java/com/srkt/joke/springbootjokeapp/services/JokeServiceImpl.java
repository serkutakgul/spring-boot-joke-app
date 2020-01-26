package com.srkt.joke.springbootjokeapp.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class JokeServiceImpl implements JokeService {

    private final ChuckNorrisQuotes cNorrisQuotes;

    public JokeServiceImpl() {
        this.cNorrisQuotes = new ChuckNorrisQuotes();
    }

    @Override
    public String getJoke() {
        return cNorrisQuotes.getRandomQuote();
    }
}
