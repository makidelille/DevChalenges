function ContestResponse(){
    let [n, m] = input[0].split(" ").map(a => +a);
    let [dep, arr] = input[1].split(" ").map(a => +a);
    let stat = input[2].split(" ").map(a => +a);
    let lignes = input.slice(2).map(l => {
        let split = l.split(" ");
        return split.map(a => +a);
    });

    let station2ligne = {};
    for(let l = 0; l < lignes.length; l++){
        for(let j= 0; j < lignes[l].length; j++){
            let stat = lignes[l][j];
            if(station2ligne[stat] === undefined){
                station2ligne[stat] = [];
            }
            // toutes les stations on les binds a leur lignes
            station2ligne[stat].push(l);
        }
    }

    let lignes2ligne = {};
    for(let l=0; l < lignes.length; l++){
        if(lignes2ligne[l] == undefined){
            lignes2ligne[l] = {};
        }
        for(let j=0; j <lignes[l].length; j++){
            let stat = lignes[l][j];

            if(station2ligne[stat].length >= 2){
                let other = station2ligne[stat].filter(a => a != l);
                for(let a of other){
                    lignes2ligne[l][a] = 1;
                }
            }
        }
    }

    let ligneDepart = station2ligne[dep];
    let ligneArrive = Array.isArray(station2ligne[arr]) ? station2ligne[arr][0] : station2ligne[arr];

    // console.log(JSON.stringify(lignes2ligne, undefined, 4));
    const {dist, prev} = djikstra(lignes2ligne, ligneDepart);
    // console.log("graph: " + JSON.stringify(lignes2ligne, undefined, 4));
    // console.log("prev: " + JSON.stringify(prev, undefined, 4));
    // console.log("dist : "+ JSON.stringify(dist, undefined, 4));
    let path = getPath(prev, ligneDepart, ligneArrive);
    console.log(path);

    if(ligneDepart == ligneArrive){
        console.log(1);
    }else if(ligneDepart != ligneArrive && path.length == 1){
        console.log(-1)
    } else{
        let count = path.length;
        if(ligneDepart != path[0]){
            ++count;
        }

        if(ligneArrive != path[path.length - 1]){
            ++count;
        }

        console.log(count);
    }


    function getPath(prev, source, target){
        let path = [target];
        let cur = prev[target];
    
        isSource  = function(ele){
            if(Array.isArray(source)){
                return source.includes(ele);
            } else {
                return source === ele
            }

            
        }

        while(!isSource(cur) && cur != undefined){
            path.push(cur)
            cur = prev[cur];
        }
    
        return path.reverse();
    }

    function djikstra(graph, depart){
        // console.log(JSON.stringify(graph, undefined, 4));
        const noeuds = Object.getOwnPropertyNames(graph);
        
        // init
        const toExplore = [];
        const dist = {};
        const prev = {};
        for(let noeud of noeuds){
            dist[noeud] = Infinity;
            prev[noeud] = undefined;
            toExplore.push(noeud);
        }
        
        if(Array.isArray(depart)){
            depart.forEach(d => dist[d] = 0);
        } else {
            dist[depart] = 0;
        }


    
        // // console.log(JSON.stringify(graph, undefined, 4));
        // console.log(JSON.stringify(dist, undefined, 4));
        // console.log(JSON.stringify(toExplore, undefined, 4));
        while(toExplore.length > 0){
            let u = toExplore[0];
            for(let toBeExplorer of toExplore){
                if(dist[toBeExplorer] < dist[u]){
                    u = toBeExplorer;
                }
            }
            toExplore.splice(toExplore.indexOf(u), 1);
            // console.log(`picked : ${u}`);
            // // console.log(JSON.stringify(graph, undefined, 4));
            // console.log(JSON.stringify(graph[u], undefined, 4));
            

            // Pour chaque voisin, on calcul sa distance en passant par u;
            for(let voisin of Object.getOwnPropertyNames(graph[u])){
                // console.log(`dist: ${dist[u]}, voisin : ${graph[u][voisin]}`);
                let alt = dist[u] + graph[u][voisin];
                // console.log(alt);
                if(alt < dist[voisin]){
                    dist[voisin] = alt;
                    prev[voisin] = u;
                }
            }
        }
    
        return {dist, prev};
    }
    
}