var fs = require("fs");
var path = require("path")

var returnValue ="";
console.log = function(message){
    console.debug(message);
    returnValue = message;
}

var inputFolderNb = 5;


for(let i=1; i<= 4; i++){
    var input = fs.readFileSync(path.resolve(__dirname, `input/${inputFolderNb}`, `input${i}.txt` ), "utf8").split('\n');
    let expected = fs.readFileSync(path.resolve(__dirname, `input/${inputFolderNb}`, `output${i}.txt`), "utf8");


    computeResult();


    if(returnValue != expected){
        console.error(`FAILED test ${i} \n\t=> RETURN ${returnValue} \n\t TARGET ${expected}\n`);
    } else {
        console.info(`SUCCES test ${i}\n`);
    }
}


function computeResult(){
    let n = +input[0];

    let row = input[1].split('');
    let current = row.indexOf('X');

    let bestSolution = row.filter(e => e === 'o') * row.filter(e => e === '*') * 2 

    function score(seq){
        let sc = 0;
        for(let ele of seq){
            if(row[ele] === 'o'){
                sc++;
            } else if(row[ele] === '*'){
                sc = sc * 2;
            }
        }

        return sc;
    }

    function getBestSol(availble, currentSeq, position, bestScore){
        if(availble.length < 2){
            return availble.length ? [...currentSeq, availble[0]] : currentSeq;
        }

        let leftChain = [];
        let rightChain = [];
        if(position > 0){
            let availbleLeft = availble[Math.floor(position)];
            let leftL = availble.slice();
            leftL.splice(Math.floor(position), 1)
            let scoreL = score([...currentSeq, availbleLeft]);
            if(scoreL < bestScore){
                return currentSeq;
            }
            leftChain = getBestSol(leftL, [...currentSeq, availbleLeft], position - 1, scoreL);
        }

        if(position < availble.length - 1){
            let availbleRight = availble[Math.ceil(position)];
            let leftR = availble.slice();
            leftR.splice(Math.ceil(position), 1);
            let scoreR = score([...currentSeq, availbleRight]);
            if(scoreR < bestScore){
                return currentSeq;
            }
            rightChain = getBestSol(leftR, [...currentSeq, availbleRight], position, scoreR);
        }


        if(score(leftChain) > score(rightChain)){
            return leftChain;
        } else {
            return rightChain;
        }
    }

    let av=  row.map((_, i) => i);
    av.splice(current, 1);

    let best = getBestSol(av, [], current - 0.5, 0)

    console.log(best.map(e => row[e]).join(''));







}


function computeResult4(){
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


function computeResult3(){
    let n = +input[0];

    let grid = [];
    let mouv = "";

    let target = {
        '*': [],
        'o': []
    };

    for(let i=1; i< n+1; i++){
        let row = input[i].split('');
        for(let j=0; j< row.length; j++){
            if(row[j] === 'o'){
                target.o.push({y: i-1, x: j})
            } else if(row[j] === '*'){
                target['*'].push({y: i-1, x: j})
            }
        }
    }

    let x=0;
    let y=0;

    target.o.forEach(target => {

        let diffX = target.x - x;
        let diffY = target.y - y;

        mouv += ">".repeat(diffX > 0 ? diffX : 0) + "<".repeat(diffX < 0 ? -diffX : 0) + "v".repeat(diffY > 0 ? diffY : 0) + "^".repeat(diffY < 0 ? -diffY : 0) + "x";
        x = target.x;
        y = target.y;
    });

    target['*'].forEach(target => {
        let diffX = target.x - x;
        let diffY = target.y - y;

        mouv += ">".repeat(diffX > 0 ? diffX : 0) + "<".repeat(diffX < 0 ? -diffX : 0) + "v".repeat(diffY > 0 ? diffY : 0) + "^".repeat(diffY < 0 ? -diffY : 0) + "x";
        x = target.x;
        y = target.y;
    });


    console.log(mouv);


}


function computeResult2(){
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




function computeResult1(){
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