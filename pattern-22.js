let pattern=''
let n=4
for(let i=0;i<2*n-1;i++){
    for(let j=0;j<2*n-1;j++){
       let top=i;
       let left=j;
       let right=(2*n-2)-j
       let down=(2*n-2)-i
       pattern+=(n-Math.min(Math.min(top,down),Math.min(left,right)))
    }
    pattern+="\n"
}
console.log(pattern)

// 4444444
// 4333334
// 4322234
// 4321234
// 4322234
// 4333334
// 4444444

// let pattern=''
// for(let i=0;i<7;i++){
//     for(let j=0;j<7;j++){
//         if(i==0 || i==6 ||j==0 || j==6){
//             pattern+='4'
//         }
//         else if( i==1|| j==1 || i==5 || j==5){
//             pattern+='3' 
//         }
//         else if(i==2 || j==2 || i==4 || j==4){
//             pattern+='2'
//         }
//         else{
//             pattern+='1'
//         }
//     }
//     pattern+="\n"
// }
// console.log(pattern)