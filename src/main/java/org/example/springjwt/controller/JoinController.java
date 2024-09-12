package org.example.springjwt.controller;


import lombok.AllArgsConstructor;
import org.example.springjwt.dto.JoinDTO;
import org.example.springjwt.service.JoinService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@ResponseBody
@AllArgsConstructor
@Controller
public class JoinController {

    private final JoinService joinService;
    @PostMapping("/join")
    public String joinP(JoinDTO joinDTO){
        joinService.joinProcess(joinDTO);
        return "ok";
    }
}
