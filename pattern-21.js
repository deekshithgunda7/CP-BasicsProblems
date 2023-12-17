let pattern="";
for(let i=0;i<4;i++){
    for(let j=0;j<4;j++){
        if(i==0 || j==0 || i==3 || j==3)
        {
           pattern+="*"
        }
        else{
            pattern+=" "
        }
    }
    pattern+="\n"
}
console.log(pattern)

/*
****
*  *
*  *
****
*/
