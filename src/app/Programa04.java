// USANDO A DATA-HORA GLOBAL

package app;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Programa04 {

	public static void main(String[] args) {
		// Data-hora local
		LocalDate d01 = LocalDate.now();
		LocalDateTime d02 = LocalDateTime.now();
		System.out.println("d01 = " + d01);
		System.out.println("d02 = " + d02);

		// Data-hora global
		Instant d03 = Instant.now();
		System.out.println("d03 = " + d03);

		// (agora) ➞ Data-hora
		LocalDate d04 = LocalDate.parse("2022-08-20");
		System.out.println("d04 = " + d04);

		// Texto ISO 8601 ➞ Data-hora
		LocalDateTime d05 = LocalDateTime.parse("2022-08-20T23:12:26");
		System.out.println("d05 = " + d05);

		// Texto ISO 8601 ➞ Data-hora global
		Instant d06 = Instant.parse("2022-08-20T23:12:26Z");
		System.out.println("d06 = " + d06);

		// Texto ISO 8601 (Brazil) ➞ Data-hora global
		Instant d07 = Instant.parse("2022-08-20T23:12:26-03:00");
		System.out.println("d07 = " + d07);

		// Texto formato customizado ➞ Data-hora
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate d08 = LocalDate.parse("20/07/2022", fmt1);
		System.out.println("d08 = " + d08);

		// Texto formato customizado ➞ Data-hora time
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		LocalDateTime d09 = LocalDateTime.parse("20/07/2022 20:50", fmt2);
		System.out.println("d09 = " + d09);

		// dia, mês, ano ➞ Data-hora local
		LocalDate d10 = LocalDate.of(2022, 8, 20);
		System.out.println("d10 = " + d10);

		// dia, mês, ano, horário ➞ Data-hora local
		LocalDateTime d11 = LocalDateTime.of(2022, 8, 20, 23, 50);
		System.out.println("d11 = " + d11);
	}

}
