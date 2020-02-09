package com.nalaolla.web.restController;

import com.nalaolla.web.domain.WebConfigRepository;
import com.nalaolla.web.dto.WebConfigRequestDto;
import com.nalaolla.web.service.WebConfigService;
import lombok.AllArgsConstructor;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import java.util.Arrays;

@RestController
@AllArgsConstructor
public class WebConfigRestController {
    private WebConfigService webConfigService;
    private Environment env;

    @PostMapping("/webconfig")
    public Integer saveWebConfig(@RequestBody WebConfigRequestDto webConfigDto) {
        //webConfigRepository.save(webConfigDto.toEntity());
        Integer result = webConfigService.save(webConfigDto);
        System.out.println("result : " + result);
        return result;
    }

    @GetMapping("/profile")
    public String getProfile () {
        return Arrays.stream(env.getActiveProfiles())
                .findFirst()
                .orElse("none");
    }

}
