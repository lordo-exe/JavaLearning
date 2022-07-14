package com.company;

public class Main {
  // First time creating a constant value, used for invalid values
  private static final String INVALID_VALUE_MESSAGE = "Invalid Value";

  public static void main(String[] args) {
    // Hello World - Lord.
    System.out.println(getDurationString(51, 54));
  }
  // Method for converting minutes to hours, and printing results including left over minutes.
  private static String getDurationString(long minutes, long seconds) {
    if ((minutes < 0) || (seconds < 0) || (seconds > 59)) {
      return INVALID_VALUE_MESSAGE;
    }

    // Converting 'minutes' values over 60 to hours
    long hours = minutes / 60;

    // Finding remaining minutes after conversion via long 'remainingMinutes'
    long remainingMinutes = minutes % 60;

    //Prepending a '0' before 'hours' value, and appending "h"
    String hoursString = hours + "h ";
    if (hours < 10) {
      hoursString = "O" + hoursString;
    }

    //Prepending a '0' before 'minutes' value, and appending "m"
    String minutesString = remainingMinutes + "m ";
    if (remainingMinutes < 10) {
      minutesString = "O" + minutesString;
    }

    //Appending a '0' before 'seconds' value, and appending "s"
    String secondsString = seconds + "s";
    if (seconds < 10) {
      secondsString = "O" + secondsString;
    }

    return hoursString + minutesString + secondsString;
  }

  private static String getDurationString(long seconds) {
    if (seconds <= 0) {
      return INVALID_VALUE_MESSAGE;
    }

    // Converting 'seconds' values over 60 to minutes
    long minutes = seconds / 60;

    // Finding remaining seconds after conversion via long 'remainingSeconds'
    long remainingSeconds = seconds % 60;
    return getDurationString(minutes, remainingSeconds);
  }
}
