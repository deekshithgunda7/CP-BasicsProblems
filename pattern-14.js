let pattern=""
for(let i=0;i<=5;i++){
    for(let ch=65;ch<=65+i;ch++){
        pattern+=String.fromCharCode(ch)
    }
    pattern+="\n"
}
console.log(pattern)

// A     
// AB    
// ABC   
// ABCD  
// ABCDE 
// ABCDEF