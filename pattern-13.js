let pattern="";
let start=1
for(let i=1;i<=5;i++){
    // let end=start
    for(let j=1;j<=i;j++){
         pattern+=start+" "
         start=start+1
    }
    // start=start+i
    pattern+="\n"
}
console.log(pattern)


/*
1
2 3
4 5 6
7 8 9 10
11 12 13 14 15
*/