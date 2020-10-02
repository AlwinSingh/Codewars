var fibonacci = function() { //Standard JS Syntax for delcaring a function in a variable
    //However, you cannot pass the value through the function declaration above, hence return function (n) is used below
    //It has to be in that syntax otherwise function in a variable will not work
    
    
      const cache = {}; //Cache object to store the values to prevent excessive recursion of the fibonacci sequence
      
      return function(n){
      
        //Standard fibonacci rule, no need to explain this
        if (n == 0 || n == 1 ) {
          return n;
        }
        
        
        //If the cache does not exist for that value, load it in and then return it
        //The formula is fibonacci(n-1) + fibonacci(n-2);
        
        if (!cache[n]) cache[n] = fibonacci(n-1) + fibonacci(n-2);
        
        //Return the value through the cache's index
        return cache[n]
      };
      
    }();
    
    
    //Added () to the end to return the function's content
  

  fibonacci(50);