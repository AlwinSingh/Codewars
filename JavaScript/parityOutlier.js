function findOutlier(integers) {
    console.log(arrayType(integers));
    
    if (arrayType(integers) == "even") {
      for (var i = 0; i < integers.length; i++) {
        if (integers[i] % 2 != 0) {
          return integers[i];
        }
      }
    } else if (arrayType(integers) == "odd") {
        for (var i = 0; i < integers.length; i++) {
      if (integers[i] % 2 == 0) {
        return integers[i];
          }
        }
      }
    }
    
    function arrayType(integers) {
      var oddArray = 0;
      var evenArray = 0;
      var arrayType = "";
    
      for (var i = 0; i < integers.length; i ++) {
        if (integers[i] % 2 == 0) {
          evenArray++;
        } else {
          oddArray++;
        }
    
        if (evenArray > 1) {
          arrayType = "even";
        } else if (oddArray > 1) {
          arrayType = "odd";
        }
      }
      return arrayType;
    }
    
    findOutlier([1, 2, 3]);