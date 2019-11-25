function ContestResponse(){
    let bogs = input[1];
    let cores = input[2];
    let c = input[3].split("");

    let right = c.map(a => {
        let maj = a.toLowerCase() != a;        
        let ind = bogs.indexOf(a.toLowerCase());
        if(ind != -1){
            return maj ? cores[ind].toUpperCase() : cores[ind];
        }

        return a;
    });

    console.log(right.join(''));
}