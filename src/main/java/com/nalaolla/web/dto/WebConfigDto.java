package com.nalaolla.web.dto;

import com.nalaolla.web.domain.WebConfig;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
public class WebConfigDto {
    private String title;
    private String contents;

    @Builder
    public WebConfigDto(String title, String contents) {
        this.title = title;
        this.contents = contents;
    }

    public WebConfig toEntity() {
        return WebConfig.builder()
                .title(title)
                .contents(contents)
                .build();
    }
}
