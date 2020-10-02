//SHORT SOLUTION
function firstNonRepeatingLetter(s) {

    var word = s.toLowerCase();

    for (var i = 0; i < word.length; i++) {
      var currentletter = word[i];

      var currentword = word.replace(currentletter, '');

      if (currentword.indexOf(word[i]) === -1) {
        return s[i];
      }
    }

    return '';
}






  //LONG SOLUTION
  function firstNonRepeatingLetter(s) {

    if (s.length < 1) {
      return "";
    }
  
    var originalword = s;
    s = s.toLowerCase();
    var word = s.split("");
    var delword = "";
  
    for (var i = 0; i < word.length; i++) {
      for (var j = 0; j < word.length; j++) {
        if (i != j) {
          if (word[i] == word[j]) {
            delword = word[i];
            //console.log(word);
            //console.log("Match found");
            for (var k = 0; k < word.length; k++) {
              if (word[k] == delword) {
                delete word[k];
                //console.log(word);
              }
            }
          }
        }
      }
    }
  
    var filtered = word.filter(function (elements) { //uses the array filter
      return elements != null; //if the elements are not null, return them to the array
    });
  
    if (filtered.length > 0) {
      var index = s.search(filtered[0]);
      return originalword.charAt(index);
    } else {
      return "";
    }
  }



  firstNonRepeatingLetter("stress");