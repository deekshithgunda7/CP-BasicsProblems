let pattern=""
for(let i=0;i<5;i++){
    for(let j=0;j<=4-i;j++){
        pattern+="*"
    }
    for(let ch=0;ch<2*i;ch++){
        pattern+=" "
    }
    for(let j=0;j<=4-i;j++){
        pattern+="*"
    }
    pattern+="\n"
}
for(let i=0;i<5;i++){
    for(let j=0;j<=i;j++){
        pattern+="*"
    }
    for(let ch=0;ch<8-2*i;ch++){
        pattern+=" "
    }
    for(let j=0;j<=i;j++){
        pattern+="*"
    }
    pattern+="\n"
}
  
console.log(pattern)


/*

**********
****  ****
***    ***
**      **
*        *
*        *
**      **
***    ***
****  ****
**********

*/