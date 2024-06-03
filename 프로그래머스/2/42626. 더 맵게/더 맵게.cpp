#include <string>
#include <vector>
#include <queue>

using namespace std;
// 섞은 음식의 스코빌 지수 = 
// 가장 맵지 않은 음식의 스코빌 지수 + (두 번째로 맵지 않은 음식의 스코빌 지수 * 2)

int solution(vector<int> scoville, int K) {
    int answer = 0;
    priority_queue<int, vector<int>, greater<int>> pq;
    
    for(int i = 0; i < scoville.size(); i++){
        pq.push(scoville[i]);
    }
    
    while (pq.size() >= 2 && K > pq.top()){
        int firstMin = pq.top();
        pq.pop();
        int secondMin = pq.top();
        pq.pop();
        pq.push(firstMin + (secondMin*2));
        answer++;
    }
    
    if (!pq.empty() && pq.top() < K) return -1;
    return answer;
}