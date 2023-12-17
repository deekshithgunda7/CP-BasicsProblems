let pattern="";
for(let i=1;i<=4;i++){
    let start=1
    let end=i
    for(let s=0;s<i;s++){
        pattern+=start;
        start=start+1
    }
    for(let j=0;j<2*(4-i);j++){
        pattern+=" ";
    }
    for(let s=0;s<i;s++){
        pattern+=end;
        end=end-1
       
    }

    pattern+="\n"
}
console.log(pattern)

// 1      1
// 12    21
// 123  321
// 12344321
