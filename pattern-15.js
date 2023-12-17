let pattern=""
for(let i=5;i>0;i--){
    for(let ch=65;ch<65+i;ch++){
        pattern+=String.fromCharCode(ch)
    }
    pattern+="\n"
}
console.log(pattern)

// ABCDE
// ABCD 
// ABC  
// AB   
// A 