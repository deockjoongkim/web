package com.nalaolla.web.domain;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Entity
public class WebConfig extends BaseTimeEntity {

    @Id
    @GeneratedValue
    private Integer seq;

    @Column(length = 100, nullable = false)
    private String title;

    @Column(columnDefinition = "TEXT", nullable = true)
    private String contents;

    @Builder
    public WebConfig(String title, String contents) {
        this.title = title;
        this.contents = contents;
    }

}
