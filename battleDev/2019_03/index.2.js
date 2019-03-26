
function computeResult(){
    let n = +input[0];
    let curMass = 0;
    let ar = 1;
    for(let i=1; i < n+1; i++){
        let p  = +input[i];

        if(curMass + p <= 100){
            curMass += p;
        } else {
            ar++;
            curMass = p;
        }
        console.error(curMass);
    }


    console.log(ar);




}
