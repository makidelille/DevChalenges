
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
