function arrayDiff(a, b) {
  //console.log(a);
  //console.log(b);
  for (var i = 0; i < a.length; i++) {

    for (var j = 0; j < b.length; j++) {
      console.log('inner loop')
      if (b[j] == a[i]) {
        delete a[i];
      }
    }

  }

  var filtered = a.filter(function (el) {
  return el != null;
  });


  console.log("A (Spliced): " +filtered);
  return filtered;
}