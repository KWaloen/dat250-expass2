package com.example.demo;

import org.springframework.stereotype.Component;

import java.util.*;

@Component
public class PollManager {
    private final HashMap <UUID, Poll> polls = new HashMap<>();
    private final HashMap <UUID, User> users = new HashMap<>();
    private final HashMap <UUID, Vote> votes = new HashMap<>();
    private final HashMap <UUID, VoteOption> voteOptions = new HashMap<>();

    public PollManager() {}

    public void addPoll(UUID uuid, Poll poll) {
        polls.put(uuid, poll);
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
            User user = eachUser.getValue();
            userList.add(user);
        }
        return userList;
    }

    public List<Poll> getAllPolls() {
        List<Poll> pollList = new ArrayList<Poll>();
        for (HashMap.Entry<UUID, Poll> eachPoll : polls.entrySet()) {
            Poll poll = eachPoll.getValue();
            pollList.add(poll);
        }
        return pollList;
    }

    public List<Vote> getAllVotes() {
        List<Vote> voteList = new ArrayList<Vote>();
        for (HashMap.Entry<UUID, Vote> eachVote : votes.entrySet()) {
            Vote vote = eachVote.getValue();
            voteList.add(vote);
        }
        return voteList;
    }

    public void addVote(UUID VoteID, Vote vote) {
        votes.put(vote.getVoteId(), vote);
    }

    public void deletePoll(UUID pollId) {
        polls.remove(pollId);
    }

    public void getVote(UUID voteID) {
        votes.get(voteID);
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
