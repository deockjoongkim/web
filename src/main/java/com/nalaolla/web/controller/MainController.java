package com.nalaolla.web.controller;

import com.nalaolla.web.domain.WebConfig;
import com.nalaolla.web.dto.WebConfigResponseDto;
import com.nalaolla.web.service.WebConfigService;
import lombok.AllArgsConstructor;
import lombok.val;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
@AllArgsConstructor
public class MainController {

    private WebConfigService webConfigService;

    @GetMapping("/main")
    public String main() {
        return "nalaolla web main";
    }

    @GetMapping("/")
    public String main(Model model){
        List<WebConfigResponseDto> list = webConfigService.findAllDesc();
        model.addAttribute("webconfig", list);
        model.addAttribute("object", "1");
        return "main";
    }


}
