function computeResult(){
    let n = +input[0];
    let classement = n;

    for(let i=1; i< 43; i++){
        let [devant, derriere] = input[i].split(" ").map(e => +e);

        classement = classement + devant - derriere;
    }

    if(classement > 10000){
        console.log("KO");
    } else if(classement <= 100){
        console.log("1000");
    } else {
        console.log("100");
    }
}