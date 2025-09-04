package com.example.demo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.Instant;
import java.util.UUID;

@RestController
@RequestMapping("/votes")
public class VoteHandler {

    private final PollManager pollManager;

    public VoteHandler(PollManager pollManager) {
        this.pollManager = pollManager;
    }

    @PostMapping("/castVote")
    public ResponseEntity<Vote> castVote(@RequestBody Vote vote) {
        UUID voteID = UUID.randomUUID();

        if (vote.getVoteId() != null && vote.getUserId() != null) {
            if (pollManager.getVotes().containsKey(vote.getVoteId())){
                voteID = vote.getVoteId();
            }
        }

        vote.setVoteId(voteID);
        vote.setVotedTime(Instant.now());

        pollManager.addVote(voteID, vote);

        return ResponseEntity.ok(vote);
    }
}
