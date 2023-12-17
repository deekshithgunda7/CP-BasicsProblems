let pattern=""
for(let i=0;i<5;i++){
    for(let ch=69-i;ch<=69;ch++){
        pattern+=String.fromCharCode(ch)
    }
    pattern+="\n"
}
console.log(pattern)

// E    
// DE   
// CDE  
// BCDE 
// ABCDE