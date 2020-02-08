package com.nalaolla.web.dto;

import com.nalaolla.web.domain.WebConfig;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
public class WebConfigDto {
    private String title;

    @Builder
    public WebConfigDto (String title) {
        this.title = title;
    }

    public WebConfig toEntity() {
        return WebConfig.builder()
                .title(title)
                .build();
    }
}
