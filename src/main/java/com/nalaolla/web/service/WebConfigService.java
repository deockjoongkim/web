package com.nalaolla.web.service;

import com.nalaolla.web.domain.WebConfigRepository;
import com.nalaolla.web.dto.WebConfigRequestDto;
import com.nalaolla.web.dto.WebConfigResponseDto;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;


@AllArgsConstructor
@Service
public class WebConfigService {

    private WebConfigRepository webConfigRepository;

    @Transactional
    public Integer save(WebConfigRequestDto dto) {
        return webConfigRepository.save(dto.toEntity()).getSeq();
    }

    @Transactional(readOnly = true)
    public List<WebConfigResponseDto> findAllDesc() {
        return webConfigRepository.findAllDesc()
                .map(WebConfigResponseDto::new)
                .collect(Collectors.toList());
    }

}
