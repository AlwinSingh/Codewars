function formatDuration(seconds) {
console.log(seconds);
  // Complete this function
  var timearr = [];
  var finaltimearr = [];
  var timetype = "";
  var timestr = "";

  if (seconds == 0) {
    return 'now';
  } else if (seconds >= 10 && seconds < 60) {
    return seconds + " seconds"
  } else if (seconds < 10) {
        return seconds + " second"

  }

  var years = parseInt(seconds / 31536000);
  seconds = seconds - (years * 315360000);
  var days = parseInt(seconds / 86400);
  seconds = seconds - (days * 86400);
  var hour = parseInt(seconds / 3600);
  seconds = seconds - (hour * 3600);
  var minute = parseInt(seconds / 60);
  var seconds = seconds - (minute * 60);
  // seconds = seconds - (minute * 60);
  // var seconds = seconds - (60 * minute);

  timearr.push(years);
  timearr.push(days);
  timearr.push(hour);
  timearr.push(minute);
  timearr.push(seconds);

  console.log(timearr);

  for (var i = 0; i < timearr.length; i++) {

    if (i == 0) {
      timetype = "year";
      if (timearr[0] > 1) {
        timetype += "s";
      }
    } else if (i == 1) {
      timetype = "day";
      if (timearr[1] > 1) {
        timetype += "s";
      }
    } else if (i == 2) {
      timetype = "hour";
      if (timearr[2] > 1) {
        timetype += "s";
      }
    } else if (i == 3) {
      timetype = "minute";
      if (timearr[3] > 1) {
        timetype += "s";
      }
    }
    else if (i == 4) {
      timetype = "second";
      if (timearr[4] > 1) {
        timetype += "s";
      }
    }

    if (timearr[i] > 0) {
      finaltimearr.push(timearr[i] + " " + timetype);
    }
  }

  //console.log(finaltimearr);

  if (finaltimearr.length == 4) {
    return finaltimearr[0] + ", " + finaltimearr[1] + ", " + finaltimearr[2] + " and " + finaltimearr[3];
  } else if (finaltimearr.length == 3) {
    return finaltimearr[0] + ", " + finaltimearr[1] + " and " + finaltimearr[2];
  }
  else if (finaltimearr.length == 2) {
    return finaltimearr.join(" and ");
  } else {
    return finaltimearr.join("");
  }

}