let pattern=""
let sp=8
for(let i=1;i<=5;i++){
    for(let j=0;j<i;j++){
        pattern+="*"
    }
    for(let s=0;s<sp;s++){
        pattern+=" "
    }
    for(let j=0;j<i;j++){
        pattern+="*"
    }
    sp=sp-2
    pattern+="\n"
}
let sp2=2
for(let i=1;i<=4;i++){
    for(let j=0;j<=4-i;j++){
        pattern+="*"
    }
    for(let s=0;s<sp2;s++){
        pattern+=" "
    }
    for(let j=0;j<=4-i;j++){
        pattern+="*"
    }
    sp2=sp2+2
    pattern+="\n"
}
console.log(pattern)

/*

*        *
**      **
***    ***
****  ****
**********
****  ****
***    ***
**      **
*        *

*/