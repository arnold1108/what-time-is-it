package org.example.time
import java.time.format.DateTimeFormatter
import java.time.{ZoneId, ZonedDateTime}

class TimePrinter(formatter: DateTimeFormatter) {
  private def currentDateTime(timezone: String): ZonedDateTime = {
    val zoneId = ZoneId.of(timezone)
    ZonedDateTime.now(zoneId)
  }
}
