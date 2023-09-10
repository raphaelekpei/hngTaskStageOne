package com.raphael.hng.hngtaskstageone.service;

import com.raphael.hng.hngtaskstageone.dto.ApiResponse;

public interface ApiService {
    ApiResponse getInfo(String slackName, String track);
}
