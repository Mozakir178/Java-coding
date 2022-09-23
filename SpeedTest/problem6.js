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
    i = input.trim().split("\n") ;
    let t = +i[0] ;
    let line = 1 ;
    while(t-- > 0){
        let n = +i[line++] ;
        let num = i[line++].trim().split(" ").map(Number)   ;
        let ob = {} ;
        for( let i = 0 ; i< n ;i++){
            let el = num[i] ;
            if(ob[el] === undefined){
                ob[el] = 1 ;
            }
            else{
                ob[el]++ ;
            }
        }
        let flag = true ;
        for(let i in ob){
            if(ob[i] >1){
                flag = false ;
                break ;
            }
        }
        let ans = (flag) ? "NO" : "YES" ;
        console.log(ans) ;
    }

} 
