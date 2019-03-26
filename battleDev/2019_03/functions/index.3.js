function computeResult(){
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