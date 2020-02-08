package com.nalaolla.web.restController;

import com.nalaolla.web.domain.WebConfig;
import com.nalaolla.web.domain.WebConfigRepository;
import com.nalaolla.web.dto.WebConfigDto;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class WebConfigRestController {
    private WebConfigRepository webConfigRepository;

    @GetMapping("/webcofig")
    public  void saveWebConfig(@RequestBody WebConfigDto webConfigDto) {
        webConfigRepository.save(webConfigDto.toEntity());
    }

}
