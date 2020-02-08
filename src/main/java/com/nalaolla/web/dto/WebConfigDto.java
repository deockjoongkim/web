package com.nalaolla.web.dto;

import com.nalaolla.web.domain.WebConfig;
import lombok.Getter;

@Getter
public class WebConfigDto {
    private String title;

    public WebConfig toEntity() {
        return WebConfig.builder()
                .title(title)
                .build();
    }
}
