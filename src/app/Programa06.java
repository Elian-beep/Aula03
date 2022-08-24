package app;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Programa06 {

	public static void main(String[] args) {
		// LocalDate
		LocalDate d01 = LocalDate.parse("2022-07-20");
		LocalDate pastWeekDate = d01.minusDays(7);
		LocalDate nextWeekDate = d01.plusDays(7);
		System.out.println("pastWeekDate = " + pastWeekDate);
		System.out.println("nextWeekDate = " + nextWeekDate);

		// LocalDateTime
		LocalDateTime d02 = LocalDateTime.parse("2022-07-20T01:30:26");
		LocalDateTime pastWeekDateTime = d02.minusDays(7);
		LocalDateTime nextWeekDateTime = d02.plusDays(7);
		System.out.println("pastWeekDateTime = " + pastWeekDateTime);
		System.out.println("nextWeekDateTime = " + nextWeekDateTime);

		// Instant
		Instant d03 = Instant.parse("2022-07-20T01:30:26Z");
		Instant pastWeekInstant = d03.minus(7, ChronoUnit.DAYS);
		Instant nextWeekInstant = d03.plus(7, ChronoUnit.DAYS);
		System.out.println("pastWeekInstant = " + pastWeekInstant);
		System.out.println("nextWeekInstant = " + nextWeekInstant);

		// Duration
		Duration t1 = Duration.between(pastWeekInstant, nextWeekInstant);
		System.out.println("t1 dias: " + t1.toDays());

		Duration t2 = Duration.between(pastWeekDateTime, nextWeekDateTime);
		System.out.println("t2 dias: " + t2.toDays());

		Duration t3 = Duration.between(pastWeekDate.atStartOfDay(), nextWeekDate.atStartOfDay());
		System.out.println("t3 dias: " + t3.toDays());

	}

}
