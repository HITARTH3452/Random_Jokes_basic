package com.geekster.RandomJokes.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class JokesController {

    static ArrayList<String> jokesList = new ArrayList<>();

    @PostMapping(value = "/jokes")
    public String saveJokes(@RequestBody String jokes){
        jokesList.add(jokes);

        return "jokes saved";
    }
    @GetMapping(value = "/jokes")
    public String getJokes(){


        jokesList.add("What do you call a boomerang that won’t come back?\n" +
                "A stick.");
        jokesList.add("What does a cloud wear under his raincoat?\n"+
                "Thunderwear.");
        jokesList.add("Two pickles fell out of a jar onto the floor. What did one say to the other?\n" +
                "Dill with it.");
        jokesList.add("What time is it when the clock strikes 13?\n" +
                "Time to get a new clock.");
        jokesList.add("How does a cucumber become a pickle?\n" +
                "It goes through a jarring experience.");
        int randomNumber = 0 + (int)(Math.random()*((4-0)+1));

        return jokesList.get(randomNumber);
    }

}
