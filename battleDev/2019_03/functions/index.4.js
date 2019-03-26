function computeResult(){
    let n = +input[0];
    let wordArray = [];

    for(let i=2; i<= n; i++){
        wordArray.push(input[i]);
    }


    function isValid(solution){
        for(let w of wordArray){
            let cpy = w;
            for(let i=0; i < solution.length ; i++){
                if(cpy.indexOf(solution[i]) === -1){
                    return false;
                }

                cpy  = cpy.slice(cpy.indexOf(solution[i]) + 1);
            }
        }
        return true;
    }
    let first = input[1];


    function getBestSol(possiblite, index){
        if(!isValid(possiblite)){
            return "";
        }


        if(index >= first.length){
            return possiblite;
        }
        let bestWithIndex = getBestSol(possiblite + first[index], index + 1) ;
        let bestWithoutIndex = getBestSol(possiblite, index +1);


        return bestWithIndex.length > bestWithoutIndex.length ? bestWithIndex : bestWithoutIndex;
    }

    let result = getBestSol("", 0);
    if(result.length === 0){
        result = "KO";
    }
    console.log(result);

}
