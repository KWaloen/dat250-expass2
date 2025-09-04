package com.example.demo;

import java.time.Instant;
import java.util.UUID;

public class Vote {
    private UUID voteId;
    private UUID userId;
    private UUID pollId;
    private Instant votedTime;
    private UUID voteOptionId;

    public Vote(UUID voteID, UUID userId, UUID pollId, UUID voteOptionId) {
        this.voteId = voteID;
        this.userId = userId;
        this.pollId = pollId;
        this.voteOptionId = voteOptionId;
    }

    public Vote() {}

    public UUID getVoteId() {
        return voteId;
    }

    public Instant getVotedTime() {
        return votedTime;
    }

    public void setVotedTime(Instant votedTime) {
        this.votedTime = votedTime;
    }

    public UUID getPollId() {
        return pollId;
    }

    public void setPollId(UUID pollId) {
        this.pollId = pollId;
    }

    public UUID getUserId() {
        return userId;
    }

    public void setUserId(UUID userId) {
        this.userId = userId;
    }

    public void setVoteId(UUID voteId) {
        this.voteId = voteId;
    }

    public UUID getVoteOptionId() {
        return voteOptionId;
    }

    public void setVoteOptionId(UUID voteOptionId) {
        this.voteOptionId = voteOptionId;
    }
}
