package org.example.time
import java.time.format.DateTimeFormatter
import java.time.{ZoneId, ZonedDateTime}

class TimePrinter(formatter: DateTimeFormatter) {
  private def currentDateTime(timezone: String): ZonedDateTime = {
    val zoneId = ZoneId.of(timezone)
    ZonedDateTime.now(zoneId)
  }
  private def countryToTimezone(country: String): String =
    country.toLowerCase match {
      case "italy"   => "Europe/Rome"
      case "uk"      => "Europe/London"
      case "kenya"   => "Africa/Nairobi"
      case "germany" => "Europe/Berlin"
      case "japan"   => "Asia/Tokyo"
      case _ =>
        val msg = s"$country is yet covered in this application"
        throw new IllegalArgumentException(msg)
    }

  private def dateTimeToString(datetime: ZonedDateTime): String = {
    formatter.format(datetime)
  }

  def now(timezone: String): String = {
    val datetime = currentDateTime(timezone)
    dateTimeToString(datetime)
  }
}
