package com.example.kodilla.good.patterns.challenges;

public class ConsoleInformationService implements InformationService {
    @Override
    public void inform(User user) {
        System.out.println("Informing user: " + user.getUsername());
    }
}
