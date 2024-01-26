#include <string>
#include <vector>
#include <queue>

using namespace std;

int solution(int bridge_length, int weight, vector<int> truck_weights) {
    int answer = 0;
    int T_weight_in_bridge = 0;
    int idx= 0;
    queue<int> q;
    
    while(1){
        //1. 마지막 차인 경우 시간을 예상하여 더해줘서 배속
        if(idx == truck_weights.size()){
            answer += bridge_length;
            break;
        }
        //시간초 증가
        answer++;
        //1. 차가 다 건넌경우 무게를 빼줘야함
        if(q.size() == bridge_length){
            T_weight_in_bridge -= q.front();
            q.pop();
        }
        //1. 다리에 있는 트럭 무게 + 다음 트럭 무게 <=  허용 무게일경우
        if(T_weight_in_bridge + truck_weights[idx] <= weight){
            //1. 다리 있는 트럭무게 += 트럭무게;
            T_weight_in_bridge += truck_weights[idx];
            //2. 큐에 트럭무게 push
            q.push(truck_weights[idx]);
            //3. 트럭 인덱스를 다음 트럭으로 ++
            idx++;
        }
        //2. 아닐 경우
        else{
            //1. 큐에 0을 push하여 위치 계산
            q.push(0);
        }   
    }
    
    return answer;
}