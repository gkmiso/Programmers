function solution(n, results) {
    let answer = 0;
    const winGraph = new Array(n+1).fill().map(e => new Array());
    const loseGraph = new Array(n+1).fill().map(e => new Array());
    results.forEach(result => {
        const [winner, loser] = result;
        winGraph[winner].push(loser);
        loseGraph[loser].push(winner);
    });
    
    //모든 선수별로 이기는 사람 + 지는 사람의 수의 합
    //합이 n-1과 같다면 그 사람은 순위를 정확히 알 수 있는 사람이다.
    for(let i=1; i<=n; i++) {
        let winCount = bfs(winGraph, i);
        let loseCount = bfs(loseGraph, i);
        
        if(winCount + loseCount == n-1) answer++;
    }
    
    return answer;
    
    function bfs(graph, start) {
        let count = 0;
        let queue = [start];
        let visited = new Array(n+1).fill(false);
        visited[start] = true;
        
        while(queue.length) {
            let node = queue.shift();
            if(graph[node].length > 0) {
                graph[node].forEach(player => {
                    if(visited[player] == false) {
                        visited[player] = true;
                        count++;
                        queue.push(player)
                    }
                })
            }
        }
        
        return count;
    }
    
}