function solution(n, times) {
    times.sort((a, b) => b - a);
    
    let left = 1, right = n * times[times.length - 1];
    let minTimes = right;
    
    while (left <= right) {
        let mid = Math.floor((left + right) / 2);
        let count = 0;
        
        times.forEach(v => {
            count += Math.floor(mid / v);
            
            if (count >= n) {
                minTimes = Math.min(mid, minTimes);
                return;
            }
        });
        
        if (count >= n) right = mid - 1;
        else left = mid + 1;
    }
    return minTimes;
}