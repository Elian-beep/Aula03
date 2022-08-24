// USANDO O DATA-HORA-LOCAL

package app;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class Programa03 {

	public static void main(String[] args) {
		// Converter data-hora global para local
		Instant d01 = Instant.parse("2022-08-23T01:30:06Z");
		System.out.println("Horário Londres: " + d01);
		LocalDateTime r1 = LocalDateTime.ofInstant(d01, ZoneId.systemDefault()); // Conversão acontecendo
		System.out.println("Horário local: " + r1);

		LocalDateTime r2 = LocalDateTime.ofInstant(d01, ZoneId.of("America/Sao_Paulo"));
		System.out.println("Horário SP: " + r2);

		LocalDateTime r3 = LocalDateTime.ofInstant(d01, ZoneId.of("Europe/Monaco"));
		System.out.println("Horário Monaco: " + r3);

//		Códigos de fuso horários
//		for (String s : ZoneId.getAvailableZoneIds()) {
//			System.out.println(s);
//		}

		// Obter dados de uma data-hora local
		LocalDateTime d02 = LocalDateTime.parse("2022-08-23T01:30:06");
		System.out.println("Dia: "+d02.getDayOfMonth());
		System.out.println("Mês: "+d02.getMonth());
		System.out.println("Ano: "+d02.getYear());
		System.out.println("Hora: "+d02.getHour());
		System.out.println("Minuto: "+d02.getMinute());
		System.out.println(d02.getDayOfMonth()+"/"+d02.getMonth()+"/"+d02.getYear());

	}

}
