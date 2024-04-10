package com.codedifferently.lesson16.web;

import java.util.List;
import lombok.Builder;
import lombok.Data;
import lombok.Singular;

@Data
@Builder
public class GetPatronResponse {
    @Singular private List<PatronResponse> patronResponses;
}
    

