function ContestResponse(){
    let n = +input[0];
    let ages = input[1].split(" ").map(a => +a);

    console.log(ages.filter(a => a >= 5 && a <= 9).length);
}