//Shorter Method (1434 ms)
function findUniq(arr) {
    for (var i = 0; i < arr.length; i++) {
      if (arr[i] == arr[i+1] || arr[i] == arr[i-1] || arr[i] == arr[i+2]) {
      } else {
      return arr[i];
      }
    }
  }



  //Longer Method (1283 ms)
  function findUniq(arr) {
    //getUniq(arr);
    for (var i = 0; i < arr.length; i++) {
      if (arr[i] != getUniq(arr)) {
        return arr[i];
        break;
      }
    }
  }
  
  
  function getUniq(arr) {
    for (var i = 0; i < arr.length; i++) {
      for (var j = 0; j < arr.length; j++) {
        if (i != j) {
          if (arr[i] == arr[j]) {
            return arr[i];
            break;
          }
        }
      }
    }
  }