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
        let string = input[line++].trim().split("") ;
        let vowel =  "aeoiu" ;
        let vow = [] ;
        let ind = [] ;
        for(let i=0;i<string.length;i++){
            for(let j=0;j<5;j++){
                if(string[i] == vowel[j]){
                    vow.push(string[i]) ;
                    ind.push(i)  ;
                }
            }
        }
        for(let i=0 , j=ind.length-1;i<ind.length;i++ , j--){
            string[ind[i]] = vow[j] ;
            // console.log(ind[i] , vow[j] ) ;
        }
        console.log(string.join("")) ;
    }

} 
