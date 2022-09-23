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
    let arr = input[line++].trim().split(" ").map(Number) ;
    let count = 0 ;
    let int = -1 ;
    for(let i=0;i<4;i++){
        for(let j=0;j<n;j++){
            if(arr[j] == i && j> int){
                count++ ;
                arr[j] = "found" ;
                int = j ;
                break ;
            }
        }
    }
    // console.log(count) ;
    if(count == 4)
        console.log("YES") ;
    else
        console.log("NO") ;
}

} 
