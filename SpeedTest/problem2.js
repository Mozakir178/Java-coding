if (process.env.USERNAME === "Mo Zakir") {
 runProgram(``);
} else {
 process.stdin.resume();
 process.stdin.setEncoding("ascii");
 let read = "";
 process.stdin.on("data", function (input) {
   read += input;
 });
 process.stdin.on("end", function () {
   read = read.replace(/\n$/, "");
   read = read.replace(/\n$/, "");
   runProgram(read);
 });
 process.on("SIGINT", function () {
   read = read.replace(/\n$/, "");
   runProgram(read);
   process.exit(0);
 });
}

function runProgram(input){
input = input.trim().split("\n") ;
let t = +input[0] ;
let line = 1 ;
while(t-- >0){
    let n = +input[line++] ;
    let seta = new Set() ;
    for(let i=0;i<n;i++){
       let [a, b] = input[line++].trim().split(" ").map(Number) ;
       seta.add(a) ;
       seta.add(b) ;
    }
   
    let count = 0 ;
    seta.forEach(s=>count++) ;
    console.log(count) ;
}
} 
