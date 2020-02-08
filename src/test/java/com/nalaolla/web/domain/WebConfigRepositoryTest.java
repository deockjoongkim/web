package com.nalaolla.web.domain;

import org.junit.After;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
public class WebConfigRepositoryTest {

    @Autowired
    WebConfigRepository webConfigRepository;

    @After
    public void cleanUp() {
        webConfigRepository.deleteAll();
    }

    @Test
    public void getWebConfig() {
        //given - 테스트 기반 환경을 구축하는 단계
        webConfigRepository.save(WebConfig.builder()
                .title("web config title").build()
        );

        //when - 테스트 하고자 하는 행위 선언
        List<WebConfig> webConfigList = webConfigRepository.findAll();

        //then - 테스트 결과 검증
        WebConfig webConfig = webConfigList.get(0);
        assertThat(webConfig.getTitle(), is("web config title"));


    }
}
