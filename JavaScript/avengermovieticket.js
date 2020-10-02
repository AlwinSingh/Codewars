//Avenger Movie Tickets Script

tickets([25, 25, 50, 100]);


function tickets(peopleInLine) {
  // ...
  var available = [];
  var change = [];
  var changeboolean;
  var totalchange = 0;
  var totalavailable = 0;

  for (var i = 0; i < peopleInLine.length; i++) {
    if (peopleInLine[i] > 25) {
      change.push(peopleInLine[i] - 25);
    }

    if (peopleInLine[i] == 25) {
      available.push(peopleInLine[i]);
    }


  }

  for (var k = 0; k < available.length; k++) {
    totalavailable += available[k];
  }

  for (var j = 0; j < change.length; j++) {
    totalchange += change[j];
  }

  console.log("Amount available: $" + totalavailable);
  console.log("Change needed: $" + totalchange);


  if (totalavailable >= totalchange) {
    changeboolean = "YES";
  } else {
    changeboolean = "NO";
  }

  return changeboolean;
}