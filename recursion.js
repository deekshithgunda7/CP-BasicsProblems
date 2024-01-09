// Recursion is defined as a function calling itself until it meets a base condition or specified condition is met
function factorial(num){
    if(num === 0){  // base condition
        return 1;
    }
    // if we don't have a base condition then call stack size will be exceeded
    return num * factorial(num-1) 
}

console.log(factorial(5));