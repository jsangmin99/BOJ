#include<iostream>
#include<vector>
#include<queue>
#include<algorithm>
using namespace std;
string arr[26];
bool visited[26][26]={0,};
int cnt = 0;
int n =0;
vector<int> result;
queue<pair<int,int>> q;
int dx[4] = {1, -1, 0, 0};
int dy[4] = {0, 0, 1, -1};

void BFS(int x, int y){
    q.push({x,y});
    visited[x][y]=true;
    cnt++;

    while(!q.empty()) {
                int cx = q.front().first;
        int cy = q.front().second;
        q.pop();
        
        // 사방 탐색
        for (int i = 0; i < 4; i++) {
            int nx = cx + dx[i];
            int ny = cy + dy[i];
            if (0 <= nx && 0 <= ny && nx < n && ny < n && !visited[nx][ny] && arr[nx][ny] == '1') {
                q.push({nx, ny});
                visited[nx][ny] = true;
                cnt++;
            }
        }
    }

}
int main(){
    cin >> n;

    for(int i=0; i < n; i++){
        cin >> arr[i];
    }

    for(int i =0; i<n; i++){
        for(int j =0; j< n; j++){
            if(arr[i][j] == '1' && visited[i][j] == false){
                cnt =0;
                BFS(i,j);
                result.push_back(cnt);
            }
        }
    }

    sort(result.begin(),result.end());

    cout << result.size()<< "\n";

    for(int i =0; i < result.size(); i++){
        cout << result[i] << "\n";
    }


}