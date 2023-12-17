let pattern="";
for(let i=0;i<5;i++){
    for(let j=0;j<i+1;j++){
        pattern+="*";
    }
    pattern+="\n"
}
for(let i=0;i<4;i++){
    for(let j=0;j<(5-i)-1;j++){
        pattern+="*";
    }
    pattern+="\n"
}
console.log(pattern)


// *    
// **   
// ***  
// **** 
// *****
// **** 
// ***  
// **   
// * 

