function score(seq) {
    let sc = 0;
    for (let ele of seq) {
        if (ele === 'o') {
            sc++;
        } else if (ele === '*') {
            sc = sc * 2;
        }
    }

    return sc;
}

function ContestResponse() {
    let n = +input[0];

    let row = input[1].split('');
    let current = row.indexOf('X');
    let left = row.slice(0, current);
    let right = row.slice(current + 1, row.length);

    counter = 0;
    function getBestSol(left, right, memo) {
        // On part du dernier movement :
        // La personne à le choix de prendre le dernier element a droite ou a gauche
        // On calcule le max des deux choix et on prend la meilleure des deux solutions
        // Pour chacun des choix, la valeur est égale à la meilleure solution en enlevant l'élément à droite ou à gauche * 2 ou +1 selon l'élément en question
        // MEMO
        let memoCur = memo[left.length + ',' + right.length];
        if (memoCur) {
            return memoCur;
        }
        // Condition d'arrêt
        if (left.length == 0) {
            return {max : score(right), seq : right.slice()}
        }
        if (right.length == 0) {
            let copy = left.slice();
            copy.reverse();
            return { max: score(copy), seq: copy.slice()};
        }
        //Recursion
        let leftEl = left[0];
        let rightEl = right[right.length - 1];

        let subLeftSol = getBestSol(left.slice(1), right.slice(), memo);
        let newLeftSeq = subLeftSol.seq.slice();
        newLeftSeq.push(leftEl);
        let leftSol = {
            max: (leftEl === "*" ? (subLeftSol.max * 2) : (subLeftSol.max + 1)),
            seq: newLeftSeq
        }

        let subRightSol = getBestSol(left.slice(), right.slice(0, right.length - 1), memo);
        let newRightSeq = subRightSol.seq.slice();
        newRightSeq.push(rightEl);
        let rightSol = {
            max: (rightEl === "*" ? (subRightSol.max * 2) : (subRightSol.max + 1)),
            seq: newRightSeq
        }

        if (leftSol.max >= rightSol.max) {
            memo[left.length + ',' + right.length] = leftSol;
            return leftSol;
        } else {
            memo[left.length + ',' + right.length] = rightSol;
            return rightSol;
        };
    }
    console.info(`Inp: ${row.join('')}`);
    console.info(`left: ${left.join('')}`);
    console.info(`right: ${right.join('')}`);
    let sol = getBestSol(left, right, {});
    console.info(`SEQ: ${sol.seq.join('')}`);
    console.info(`SCORE CALC: ${sol.max}`);
    console.log(sol.seq.join(''));







}
