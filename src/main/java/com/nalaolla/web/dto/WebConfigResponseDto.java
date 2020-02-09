package com.nalaolla.web.dto;

import com.nalaolla.web.domain.WebConfig;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Optional;

public class WebConfigResponseDto {

    private Integer seq;
    private String title;
    private String contents;
    private String regDate;
    private String modDate;

    public WebConfigResponseDto(WebConfig entity) {
        seq = entity.getSeq();
        title = entity.getTitle();
        contents = entity.getContents();
        modDate = toStringDateTime(entity.getModDate());
        regDate = toStringDateTime(entity.getRegDate());
    }

    /**
     * Java 8 버전
     */
    private String toStringDateTime(LocalDateTime localDateTime){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        return Optional.ofNullable(localDateTime)
                .map(formatter::format)
                .orElse("");
    }

    /**
     * Java 7 버전
     */
    private String toStringDateTimeByJava7(LocalDateTime localDateTime){
        if(localDateTime == null){
            return "";
        }

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        return formatter.format(localDateTime);
    }
}
