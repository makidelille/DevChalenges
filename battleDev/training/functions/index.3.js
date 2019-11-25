function ContestResponse(){
    let n = +input[0];
    let color = input.slice(1).map(a => +a);

    let primary = [2, 3, 5, 7, 11];

    console.log(primary.filter(p => color.find(c => c % p == 0)).join(" "));
}