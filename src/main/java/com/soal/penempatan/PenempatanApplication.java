package com.soal.penempatan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class PenempatanApplication {

	public static void main(String[] args) {
		SpringApplication.run(PenempatanApplication.class, args);

		System.out.println("\nProjek Berjalan");

	//Soal 1
/*		Scanner a = new Scanner(System.in);
		while (true) {
			System.out.print("Silahkan Input Value N: ");
			int b = Integer.parseInt(a.next());

			System.out.println("Value String " + b);

			if (b < 2) {
				System.out.println("Nilai Terlalu Kecil\n");
			} else if (b > 9) {
				System.out.println("Nilai Telalu Besar\n");
			} else {
				String atasBawah = "=".repeat(b);
				String tengah = "| " + " || ".repeat(b - 3) + " |";
				System.out.println(atasBawah + tengah + atasBawah);
				break;
			}

		}*/
	}

}
