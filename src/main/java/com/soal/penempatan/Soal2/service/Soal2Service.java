package com.soal.penempatan.Soal2.service;

import org.springframework.stereotype.Service;

@Service
public class Soal2Service {
    public String menentukanHasil(int input) {
        if(input < 3){
            return "Nilai terlalu kecil";
        }
        else if(input > 9){
            return "Nilai terlalu besar";
        }
        else {
        String atasBawah = "=".repeat(input);
        String tengah = "| " + " || ".repeat(input - 3) + " |";
        return atasBawah + tengah + atasBawah;
        }
    }
}
