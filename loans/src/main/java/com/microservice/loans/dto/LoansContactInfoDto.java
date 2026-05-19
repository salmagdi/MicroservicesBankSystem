package com.microservice.loans.dto;

import org.springframework.boot.context.properties.ConfigurationProperties;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.Map;
@Setter
@Getter
@ConfigurationProperties(prefix = "loans")
public class LoansContactInfoDto {

    private String message;
    private Map<String, String> contactDetails;
    private List<String> onCallSupport;

}