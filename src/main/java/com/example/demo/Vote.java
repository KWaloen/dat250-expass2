package com.example.demo;

import java.time.Instant;
import java.util.UUID;

public class Vote {
    private UUID voteId;
    private User user;
    private Poll poll;
    private Instant publishedAt;
    private VoteOption voteOption;

    public Vote(UUID voteID, User user, Poll poll) {
        this.voteId = voteID;
        this.user = user;
        this.poll = poll;
        this.publishedAt = poll.getPublishedAt();
    }

    public Vote() {}

    public UUID getVoteId() {
        return voteId;
    }

    public void setVoteId(UUID voteId) {
        this.voteId = voteId;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Poll getPoll() {
        return poll;
    }

    public void setPoll(Poll poll) {
        this.poll = poll;
    }

    public Instant getPublishedAt() {
        return publishedAt;
    }

    public void setPublishedAt(Instant publishedAt) {
        this.publishedAt = publishedAt;
    }
}
