package com.nalaolla.web.domain;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.stream.Stream;

public interface WebConfigRepository extends JpaRepository<WebConfig, Long> {

    @Query("select p from WebConfig p order by p.seq desc")
    Stream<WebConfig> findAllDesc();
}
