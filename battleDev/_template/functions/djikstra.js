/**
 * interface graph {
 *      noeud: {
 *          voisin: dist
 *      }
 * 
 * }
 * 
 * 
 * 
 */


function djikstra(graph, depart){
    const noeuds = Object.keys(graph);
    
    // init
    const toExplore = [];
    const dist = {};
    const prev = {};
    for(let noeud of noeuds){
        dist[noeud] = undefined;
        prev[noeud] = Infinity;
        toExplore.push(graph[noeud]);
    }

    dist[depart] = 0;

    while(toExplore.length){
        let u = toExplore.pop();

        // Pour chaque voisin, on calcul sa distance en passant par u;
        for(let voisin of Object.keys(graph[u])){
            let alt = dist[u] + graph[u][voisin];
            if(alt < dist[voisin]){
                dist[voisin] = alt;
                prev[voisin] = u;
            }
        }
    }

    return {dist, prev};
}

function getPath(prev, source, target){
    let path = [target];
    let cur = prev[target];
    
    while(cur != source){
        path.push(cur)
        cur = prev[cur];
    }

    return path;
}