function stockItUp(N,elements){
    let arr = [110*5, 120*2 , 42*2 ,53*3 , 40*2  ,32*5 , 126*2] ;
    let sum = 0 ;
    for(let i=0;i<7;i++){
        if(elements[i] == 1){
            sum+= arr[i] ;
        }
    }
    console.log(sum*N) ;
  
}
 
