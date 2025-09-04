package com.example.demo;

import java.time.Instant;
import java.util.Set;
import java.util.UUID;

public class Poll {
    private String question;
    private UUID pollId;
    private Set<VoteOption> voteOptions;
    private Instant publishedAt;
    private Instant validUntil;

    public Poll() {}

    public Poll(String question, Set<VoteOption> voteOptions, UUID pollId) {
        this.question = question;
        this.voteOptions = voteOptions;
        this.pollId = pollId;
    }

    public UUID getPollId() {
        return pollId;
    }

    public void setPollId(UUID pollId) {
        this.pollId = pollId;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public Instant getPublishedAt() {
        return publishedAt;
    }

    public void setPublishedAt(Instant publishedAt) {
        this.publishedAt = publishedAt;
    }

    public Instant getValidUntil() {
        return validUntil;
    }

    public void setValidUntil(Instant validUntil) {
        this.validUntil = validUntil;
    }

    public void setVoteOptions(Set<VoteOption> voteOptions) {
        this.voteOptions = voteOptions;
    }
}
