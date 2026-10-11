package com.issueforge.issueforge.controller;

import org.springframework.web.bind.annotation.RestController;

import com.issueforge.issueforge.dto.CreateIssueRequest;
import com.issueforge.issueforge.dto.IssueResponse;
import com.issueforge.issueforge.entity.Issue;
import com.issueforge.issueforge.service.IssueService;

import jakarta.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;


@RestController 
public class IssueController {

    private final IssueService issueService;
    
    public IssueController(IssueService issueService){
        this.issueService = issueService;
    }

   
    @GetMapping("/issues")
    public String getIssues(){
  
        return "Getting Issues!";
    }

    @GetMapping("/issues/{id}")
    public ResponseEntity<IssueResponse> getIssue(@PathVariable Long id){
        return ResponseEntity.ok(issueService.getIssue(id));
    }
    @GetMapping("/issues/search")
    public String getIssue(@RequestParam String status) {
        return "Getting issues with status: " + status;
    }
    
    @PostMapping("/issues")
    public ResponseEntity<String> createIssue(@Valid @RequestBody CreateIssueRequest request) {
        return ResponseEntity.status(HttpStatus.CREATED).body("Created issue: " + request.title());
    }

}