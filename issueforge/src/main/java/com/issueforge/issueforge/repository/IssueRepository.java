package com.issueforge.issueforge.repository;

import org.springframework.stereotype.Repository;

@Repository 
public class IssueRepository {
    public void save(){
        System.out.println("Issue Saved");
    }
}
