package com.company;

public class Main {

  private static final String INVALID_VALUE_MESSAGE = "Invalid Value";

  public static void main(String[] args) {
    // Hello World - Lord.
  }

  private static String getDurationString(long minutes, long seconds) {
    if ((minutes < 0) || (seconds < 0) || (seconds > 59)) {
      return INVALID_VALUE_MESSAGE;
    }

    long hours = minutes / 60;
    long remainingMinutes = minutes % 60;

    String hoursString = hours + "h";
    if (hours < 10) {
      hoursString = "O" + hoursString;
    }

    String minutesString = remainingMinutes + "m";
    if (remainingMinutes < 10) {
      minutesString = "O" + minutesString;
    }

    String secondsString = seconds + "s";
    if (seconds < 10) {
      secondsString = "O" + secondsString;
    }

    return hoursString + " " + minutesString + " " + secondsString + " ";
  }

  private static String getDurationString(long seconds) {
    if (seconds <= 0) {
      return INVALID_VALUE_MESSAGE;
    }

    long minutes = seconds / 60;
    long remainingSeconds = seconds % 60;
    return getDurationString(minutes, remainingSeconds);
  }
}
