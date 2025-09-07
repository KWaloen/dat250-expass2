package com.example.demo.Handlers;

import com.example.demo.Models.Vote;
import com.example.demo.DomainManager.PollManager;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.Instant;
import java.util.List;
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
        UUID voteId = null;
        UUID userId = vote.getUserId();
        UUID pollId = vote.getPollId();
        List<Vote> allVotes = pollManager.getAllVotes();

        for (Vote eachVote : allVotes) {
            if (userId.equals(eachVote.getUserId()) && pollId.equals(eachVote.getPollId())) {
                 voteId = eachVote.getVoteId();
                 break;
            }
        }
        if (voteId == null) {
            voteId = UUID.randomUUID();
        }

        vote.setVoteId(voteId);
        vote.setVotedTime(Instant.now());

        pollManager.addVote(voteId, vote);
        System.out.println(allVotes);

        return ResponseEntity.ok(vote);
    }

    @GetMapping("/allVotes")
    public ResponseEntity<List<Vote>> getAllVotes() {
        List<Vote> allVoteList = pollManager.getAllVotes();
        return ResponseEntity.ok(allVoteList);
    }
}
