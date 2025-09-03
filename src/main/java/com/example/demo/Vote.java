package com.example.demo;

import java.time.Instant;

public class Vote {
    private Instant publishedAt;

    public Vote(User user) {
        
    }

    private Instant getPublishedAt() {
        return publishedAt;
    }

    private void setPublishedAt(Instant publishedAt) {
        this.publishedAt = publishedAt;
    }
}
