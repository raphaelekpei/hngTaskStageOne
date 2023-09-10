package com.raphael.hng.hngtaskstageone.controller;

import com.raphael.hng.hngtaskstageone.dto.ApiResponse;
import com.raphael.hng.hngtaskstageone.service.ApiService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class ApiController {

    private final ApiService apiService;

    @GetMapping("/api")
    public ResponseEntity<ApiResponse> getInfo(
            @RequestParam("slack_name") String slackName,
            @RequestParam("track") String track
    ){
        ApiResponse apiResponse = apiService.getInfo(slackName, track);
        return ResponseEntity.ok(apiResponse);

    }
}
