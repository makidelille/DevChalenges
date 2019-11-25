var fs = require("fs");
var path = require("path")

var returnValue ="";
console.log = function(message){
    process.stdout.write(`[LOG]: ${message}\n\r`);
    returnValue = message;
}

var inputFolderNb = process.argv[2] || 0;
var inputs = +process.argv[3];

let funct = fs.readFileSync(path.resolve(__dirname, "functions", `index.${inputFolderNb}.js`), 'utf8');


for(let i=1; i <= inputs; i++){
    var input = fs.readFileSync(path.resolve(__dirname, `input/${inputFolderNb}`, `input${i}.txt` ), "utf8").split('\n');
    let expected = fs.readFileSync(path.resolve(__dirname, `input/${inputFolderNb}`, `output${i}.txt`), "utf8");

    eval(funct);
    try{
        ContestResponse();
    }catch(err){
        console.error(err);
    }

    if(returnValue != expected){
        console.error(`FAILED test ${i} =>\n\t RETURN ${returnValue} \n\t TARGET ${expected}\n`);
    } else {
        console.info(`SUCCES test ${i}\n`);
    }
}

