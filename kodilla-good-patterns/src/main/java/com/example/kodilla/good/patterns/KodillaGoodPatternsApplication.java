package com.example.kodilla.good.patterns;

import com.example.kodilla.good.patterns.challenges.MovieStore;

import java.util.List;
import java.util.Map;

public class KodillaGoodPatternsApplication {

    public static void main(String[] args) {
        MovieStore movieStore = new MovieStore();
        Map<String, List<String>> movies = movieStore.getMovies();

        String result = movies.values().stream()
                .flatMap(List::stream)
                .reduce((s1, s2) -> s1 + "!" + s2)
                .orElse("");

        System.out.println(result);
    }
}
