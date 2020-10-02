function duplicateCount(text) {
  //...
  var repetition = 0;

  for (var i = 0; i < text.length; i++) {
    if (i == text.length - 1) {

    } else {

      for (var j = 0; j < text.length; j++) {
        if (i == j) {

        } else {
          if (text[i].toLowerCase() == text[j].toLowerCase()) {
            repetition++;
            break;
          }
        }
      }


      // if (text[i].toLowerCase() == text[i + 1].toLowerCase()) {
      //   console.log(text[i]);
      //   repetition++;
      // }



    }

    // for (var j = 0; j < text.length; j++) {

    //   if (i == j) {
    //   } else {
    //     if (text[i] == text[j]) {
    //       //console.log(text[i]);
    //       repetition++;
    //       break;
    //     }
    //   }
    // }

  }

  console.log(repetition);
}

duplicateCount("Indivisibilities")