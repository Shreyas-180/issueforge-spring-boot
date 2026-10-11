package com.issueforge.issueforge.service;

import org.springframework.stereotype.Service;

import com.issueforge.issueforge.dto.IssueResponse;
import com.issueforge.issueforge.repository.IssueRepository;
import jakarta.websocket.server.ServerEndpoint;

@Service 
public class IssueService {
    private final IssueRepository repository;

    public IssueService(IssueRepository issueRepository) {
        this.repository = issueRepository;
    }

    public void createIssue() {
        repository.save();
    }

    public IssueResponse getIssue(long id){
        return new IssueResponse(
            id,
            "Login button broken",
            "OPEN"
        );
    }

}
