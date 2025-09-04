package com.example.demo;

import java.util.HashMap;
import java.util.UUID;

public class PollManager {
    private final HashMap <UUID, Poll> polls = new HashMap<>();
    private final HashMap <UUID, User> users = new HashMap<>();
    private final HashMap <UUID, Vote> votes = new HashMap<>();
    private final HashMap <UUID, VoteOption> voteOptions = new HashMap<>();

    public PollManager() {}

    public void addPoll(Poll poll) {
        polls.put(poll.getPollId(), poll);
    }

    public void addUser(User user) {
        users.put(user.getUserId(), user);
    }

    public void getPoll(Poll poll) {
        polls.get(poll.getPollId());
    }

    public void getUser(User user) {
        users.get(user.getUserId());
    }

    public void addVote(Vote vote) {
        votes.put(vote.getVoteId(), vote);
    }

    public void getVote(Vote vote) {
        votes.get(vote.getVoteId());
    }

    public void addVoteOption(VoteOption voteOption) {
        voteOptions.put(voteOption.getVoteOptionId(), voteOption);
    }

    public void getVoteOption(VoteOption voteOption) {
        voteOptions.get(voteOption.getVoteOptionId());
    }

    public HashMap<UUID, Poll> getPolls() {
        return polls;
    }

    public HashMap<UUID, User> getUsers() {
        return users;
    }

    public HashMap<UUID, Vote> getVotes() {
        return votes;
    }

    public HashMap<UUID, VoteOption> getVoteOptions() {
        return voteOptions;
    }
}
