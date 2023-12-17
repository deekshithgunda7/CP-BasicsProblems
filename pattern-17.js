let pattern=""
for(let i=1;i<5;i++){
    for(let j=1;j<5-i;j++){
        pattern+=" "
    }
    for(let ch=65;ch<65+i;ch++){
        pattern+=String.fromCharCode(ch)
    }
    for(let ch=65+i-1;ch>65;ch--){
        pattern+=String.fromCharCode(ch-1)
    }
    pattern+="\n"
}
console.log(pattern)

//    A   
//   ABA  
//  ABCBA 
// ABCDCBA

/*
void printTriangle(int n) {
        // code here
       
        for(int i=0;i<n;i++){
          
            for(int j=0;j<n-i-1;j++){
                cout<<" ";
            }
             char ch='A';
            int bp=(2*i+1)/2;
             for(int j=1j<=2*i+1;j++){
                cout<<ch;
                if(j<=bp) ch++;
                else ch--;
            }
             for(int j=0;j<n-i-1;j++){
                cout<<" ";
            }
            cout<<endl;
        }
    }
    */