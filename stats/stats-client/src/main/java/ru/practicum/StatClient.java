package ru.practicum;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestClient;

@Component
public class StatClient {
    final RestClient restClient;
    final String statUrl;

    public StatClient(@Value("${client.url}") String statUrl) {
        this.restClient = RestClient.create();
        this.statUrl = statUrl;
    }

    public static void main(String[] args) {
    }
}