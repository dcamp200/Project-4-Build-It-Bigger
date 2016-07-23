package com.davidcampbell.jokes;

public class JokeMachine {

    public static final String[] jokes = {"Q: What do you call a fake noodle? A: An Impasta!","Q: What do you call cheese that's not yours? A: Nacho cheese!"};



    public static String getJoke() {
        return jokes[0];
    }
}
