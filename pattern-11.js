let pattern=""
let start=1
for(let i=0;i<5;i++){
    if(i%2 == 0) start=1
    else start=0
    for(let j=0;j<=i;j++){
         pattern+=start
         start=1-start
    }
    pattern+="\n"
}
console.log(pattern)

// 1
// 01
// 101
// 0101
// 10101