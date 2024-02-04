function solution(scores) {
  let answer = 0;

  const sum = scores[0][0] + scores[0][1];
  scores = scores.map((score, i) => [...score, i]);
  scores.sort((a, b) => {
    if (a[0] === b[0]) return a[1] - b[1];
    return b[0] - a[0];
  });

  let max = 0;
  for (const score of scores) {
    const [s1, s2, i] = score;

    if (s2 < max) {
      if (i === 0) return -1;
    } else {
      max = s2;
      if (s1 + s2 > sum) answer += 1;
    }
  }

  return answer + 1;
}