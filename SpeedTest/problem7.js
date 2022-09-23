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
    while(t-- > 0){
        let n = +input[line++] ;
        let array = input[line++].trim().split(" ").map(Number) ;
        let obj = {} ;
        for(let i =0;i<n;i++){
            let st = array[i] ;
            if(obj[st] === undefined){
                obj[st] = 1 ;
            }
            else{
                obj[st]++ ;
            }
        }
        
        let m = Math.floor(n/2) ;
        let flag = false ;
        let ans ;
        for(let i in obj){
            if(obj[i]>m){
                flag = true ;
                ans = i ;
                break ;
            }
        }
        if(flag)
            console.log(ans) ;
        else
            console.log(-1) ;
    }

} 
