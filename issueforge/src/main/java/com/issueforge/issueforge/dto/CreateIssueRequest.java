package com.issueforge.issueforge.dto;

import jakarta.validation.constraints.NotBlank;

public record CreateIssueRequest(@NotBlank String title, @NotBlank String description){

}
