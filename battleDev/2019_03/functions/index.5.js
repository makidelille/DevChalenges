
function computeResult(){
    let n = +input[0];

    let row = input[1].split('');
    let current = row.indexOf('X');

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

    function getBestSol(availble, currentSeq, position){
        if(availble.length < 2){
            return availble.length ? [...currentSeq, availble[0]] : currentSeq;
        }

        let leftChain = [];
        let rightChain = [];
        let availbleLeft = '*', availbleRight = '*', leftL = [], leftR = [];

        availbleLeft = availble[Math.floor(position)]
        leftL = availble.slice();
        leftL.splice(Math.floor(position), 1)
        availbleRight = availble[Math.ceil(position)];
        leftR = availble.slice();
        leftR.splice(Math.ceil(position), 1);

        if(position < 0){
            return getBestSol(leftR, [...currentSeq, availbleRight], position);
        } else if(position > availble.length - 1 ){
            return getBestSol(leftL, [...currentSeq, availbleLeft], position - 1);
        } else {
            // on va toujours préféré o à *
            if(row[availbleLeft] === 'o' && row[availbleRight] === '*'){
                return getBestSol(leftL, [...currentSeq, availbleLeft], position - 1);
            } else if(row[availbleRight] === 'o' && row[availbleLeft] === '*'){
                return getBestSol(leftR, [...currentSeq, availbleRight], position);
            }

            leftChain = getBestSol(leftL, [...currentSeq, availbleLeft], position - 1);
            rightChain = getBestSol(leftR, [...currentSeq, availbleRight], position);
    
            if(score(leftChain) > score(rightChain)){
                return leftChain;
            } else {
                return rightChain;
            }
        }

       




    }

    let av=  row.map((_, i) => i);
    av.splice(current, 1);

    let best = getBestSol(av, [], current - 0.5)

    console.log(best.map(e => row[e]).join(''));







}
