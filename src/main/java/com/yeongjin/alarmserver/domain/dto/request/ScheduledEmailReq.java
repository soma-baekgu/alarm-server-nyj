package com.yeongjin.alarmserver.domain.dto.request;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
public class ScheduledEmailReq {
    @Size(min = 1, message = "at least one recipient must be selected")
    private List<String> recipients;

    @NotEmpty(message = "subject is required")
    private String subject;

    @NotEmpty(message = "content is required")
    private String content;

    @NotEmpty(message = "sendTime is required")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime sendTime;
}
