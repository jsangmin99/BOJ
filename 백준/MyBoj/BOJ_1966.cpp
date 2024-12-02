// 첫 줄에 테스트케이스의 수가 주어진다. 
// 각 테스트케이스는 두 줄로 이루어져 있다.

// 첫 번째 줄에는 문서의 개수 TN(1 ≤ N ≤ 100)과, 몇 번째로 인쇄되었는지 궁금한 문서가 현재 Queue에서 몇 번째에 놓여 있는지를 나타내는 정수 M(0 ≤ M < N)이 주어진다. 
// 두 번째 줄에는 N개 문서의 중요도가 차례대로 주어진다. 중요도는 1 이상 9 이하의 정수이고, 중요도가 같은 문서가 여러 개 있을 수도 있다.


#include<iostream>
#include<queue>
using namespace std;

void solve(int N, int M){
    priority_queue<int> pq;
    queue<pair<int,int> > q; //<값, 중요도>
    int result = 0;
    for(int j = 0 ; j < N; j++){
        int x;
        cin >> x;
        q.push(make_pair(j, x));
        pq.push(x);
    }

    while (!q.empty()){
        int location =q.front().first;
        int imp = q.front().second;
        q.pop();
        if (pq.top() == imp){
            pq.pop();
            ++result;
            if(M == location){
                cout << result<< "\n"; // 개행 안하면 틀렸다고 인식
                break;
            }
        }else{
            q.push(make_pair(location, imp));
        }
    }
}

int main(){
    cin.tie(NULL);
    ios_base::sync_with_stdio(false);
    int tn; // 첫쨰줄
    int N, M; // 두째줄 1
    cin >> tn;
    for(int i =0 ; i < tn; i++){
        cin >> N >> M;
        solve(N,M);
    }
    return 0;
}