package com.example.demo;

import java.util.UUID;

public class VoteOption {
    private UUID voteOptionId;
    private String caption;
    private int presentationOrder;

    public VoteOption(UUID voteOptionId, String caption, int presentationOrder) {
        this.voteOptionId = voteOptionId;
        this.caption = caption;
        this.presentationOrder = presentationOrder;
    }

    public VoteOption() {}

    public UUID getVoteOptionId() {
        return voteOptionId;
    }

    public void setVoteOptionId() {
        this.voteOptionId = UUID.randomUUID();
    }

    public String getCaption() {
        return caption;
    }

    public void setCaption(String caption) {
        this.caption = caption;
    }

    public int getPresentationOrder() {
        return presentationOrder;
    }

    public void setPresentationOrder(int presentationOrder) {
        this.presentationOrder = presentationOrder;
    }

}
