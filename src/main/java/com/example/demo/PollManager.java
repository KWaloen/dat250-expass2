package com.example.demo;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;

@Component
public class PollManager {
    private final HashMap <UUID, Poll> polls = new HashMap<>();
    private final HashMap <UUID, User> users = new HashMap<>();
    private final HashMap <UUID, Vote> votes = new HashMap<>();
    private final HashMap <UUID, VoteOption> voteOptions = new HashMap<>();

    public PollManager() {}

    public void addPoll(Poll poll) {
        polls.put(poll.getPollId(), poll);
    }

    public void addUser(UUID uuid, User user) {
        users.put(uuid, user);
    }

    public void getPoll(Poll poll) {
        polls.get(poll.getPollId());
    }

    public User getUser(UUID uuid) {
        return users.get(uuid);
    }

    public List<User> getAllUsers() {
        List<User> userList = new ArrayList<User>();
        for (HashMap.Entry<UUID, User> eachUser : users.entrySet()) {
            UUID userID = eachUser.getKey();
            User user = eachUser.getValue();
            userList.add(user);
        }
        return userList;
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
