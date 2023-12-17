let pattern="";
for(let i=0;i<5;i++){
    for(let s=0;s<5-i-1;s++){
        pattern+=" ";
    }
    for(let j=0;j<2*i+1;j++){
        pattern+="*";
    }
    for(let l=0;l<5-i-1;l++){
        pattern+=" ";
    }
    pattern+="\n"
}
for(let i=0;i<5;i++){
    for(let s=0;s<i;s++){
        pattern+=" ";
    }
    for(let j=0;j<2*(5-i)-1;j++){
        pattern+="*";
    }
    for(let l=0;l<i;l++){
        pattern+=" ";
    }

    pattern+="\n"
}
console.log(pattern)


//     *    
//    ***   
//   *****  
//  ******* 
// *********
// *********
//  ******* 
//   *****  
//    ***   
//     *    

