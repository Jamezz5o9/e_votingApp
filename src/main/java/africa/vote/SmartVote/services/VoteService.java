package africa.vote.SmartVote.services;

import africa.vote.SmartVote.datas.models.Vote;

import java.util.List;

public interface VoteService {
    void saveUserVote(Vote vote);
    Vote findVoteById(Long voteId);
    List<Vote> findAllVotes();
}

