package com.binaa.nafsi.binanafsi.service;

import com.binaa.nafsi.binanafsi.dto.DailyLogRequest;
import com.binaa.nafsi.binanafsi.entity.DailyLog;

public interface DailyLogService {
    DailyLog saveLog(DailyLogRequest request, String userEmail);
}