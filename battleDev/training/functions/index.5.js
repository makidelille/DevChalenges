function ContestResponse(){
    let n = +input[0];
    let hours = input.slice(1).map(a => a.split(" ").map(a1 => +a1));
    let arrival = hours.map(a => +a[0]).sort((a,b) => a-b);
    // console.log(arrival);
    let departure = hours.map(a => +a[1]).sort((a,b) => a-b);
    // console.log(departure);

    let max = 0;

    let count = 0;
    let i = 0
    for(i; i < 86400000 && (arrival.length > 0); i++){
        // console.log(`test: ${arrival[0]}, ${departure[0]} `)
        if(arrival[0] == i){
            // console.log(`Arrive : ${arrival[0]}`)
            ++count;
            arrival.splice(0,1);
        } 
        
        if(departure[0] == i){
            // console.log(`Depart : ${departure[0]}`)
            departure.splice(0,1);
            --count;
        };

        if(count > max){
            max = count;
        }
    }

    console.log(max);

}