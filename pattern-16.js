let pattern=""
for(let i=0;i<5;i++){
    let k=65+i
    for(let ch=65;ch<=65+i;ch++){
        pattern+=String.fromCharCode(k)
    }
    pattern+="\n"
}
console.log(pattern)

// A    
// BB   
// CCC  
// DDDD 
// EEEEE