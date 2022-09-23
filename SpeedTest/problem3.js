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
    let alphabet = input[0].trim() ;
    let k = +input[1] ;
    let n = k%26 ;
    let m = k%10 ;
            let str = "abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyz" ;
            let str2 = "ABCDEFGHIJKLMNOPQRSTUVWXYZABCDEFGHIJKLMNOPQRSTUVWXYZ" ;
            let str3 = "12345678901234567890" ;
            let sb = "";
            for(let i=0;i<alphabet.length;i++){
                  let flag = true ;
                  for(let j=0;j<10;j++){
                      if(alphabet[i]== str3[j]){
                          sb += str3[j+m] ;
                          flag = false ;
                          break ;
                      }
                  }
                  
                  for(let j=0;j<26;j++){
                      if(alphabet[i]== str2[j]){
                          sb += str2[j+n] ;
                          flag = false ;
                          break ;
                      }
                      else{
                          if(alphabet[i]== str[j]){
                          sb += str[j+n] ;
                          flag = false ;
                          break ;
                      }
                      }
                  }
                  if(flag)
                        sb += alphabet[i] ;
                  
            }
            console.log(sb) ;
} 
