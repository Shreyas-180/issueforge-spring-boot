package com.issueforge.issueforge.dto;

import jakarta.validation.constraints.NotBlank;

public record IssueResponse(@NotBlank Long id, @NotBlank String title, @NotBlank  String status) {
    
}
