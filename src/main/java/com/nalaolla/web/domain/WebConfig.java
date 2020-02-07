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
public class WebConfig {

    @Id
    @GeneratedValue
    private Integer seq;

    @Column(length = 100, nullable = false)
    private String title;

    @Builder
    public WebConfig(String title) {
        this.title = title;
    }

}
