package com.example.demo.Handlers;

import com.example.demo.DomainManager.PollManager;
import com.example.demo.Models.Poll;
import com.example.demo.Models.VoteOption;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.Instant;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/polls")
public class PollHandler {

    private final PollManager pollManager;

    public PollHandler(PollManager pollManager) {
        this.pollManager = pollManager;
    }

    @PostMapping("/createPoll")
    public ResponseEntity<Poll> createPoll(@RequestBody Poll poll) {

        UUID uuid = UUID.randomUUID();

        poll.setPollId(uuid);

        poll.setPublishedAt(Instant.now());

        for (VoteOption option : poll.getVoteOptions()) {
            option.setVoteOptionId();
        }

        pollManager.addPoll(uuid, poll);

        return ResponseEntity.ok(poll);
    }

    @GetMapping("/allPolls")
    public ResponseEntity<List<Poll>> getAllPolls() {
        List<Poll> allPollList = pollManager.getAllPolls();
        return ResponseEntity.ok(allPollList);
    }

    @PostMapping("/deletePoll/{pollId}")
    public ResponseEntity<Poll> deletePoll(@PathVariable UUID pollId) {
        pollManager.deletePoll(pollId);
        return ResponseEntity.ok().build();
    }

}