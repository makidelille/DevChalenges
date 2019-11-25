function ContestResponse(){
    let n = +input[0];
    let voyageuer = input.slice(1).map(a => +a);

    let count = voyageuer.map(a => +Math.ceil(a/10)).reduce((a, v) => a + v, 0);

    console.log(count)

}