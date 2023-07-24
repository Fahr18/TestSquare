package com.soal.penempatan.Soal2.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.soal.penempatan.Soal2.model.BodyRequest;
import com.soal.penempatan.Soal2.model.BodyResponse;
import com.soal.penempatan.Soal2.service.Soal2Service;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
@RequestMapping
public class Soal2Controller {
    private Soal2Service soal2Service;
    
    @PostMapping("/kotak")
    public BodyResponse getInput(@RequestBody BodyRequest bodyRequest){
        int input = bodyRequest.getInput();
        String output = soal2Service.menentukanHasil(input);

        BodyResponse response = new BodyResponse(output);
        return response;

    }
}
