#include<vector>
#include<queue>
using namespace std;

int solution(vector<vector<int> > maps)
{
    int n = maps.size(); // 행
    int m = maps[0].size(); // 열
    vector<vector<int>> visited(n, vector<int>(m, 0)); 
    int dx[4] = {0, 0, 1, -1}; 
    int dy[4] = {1, -1, 0, 0}; 
    queue<pair<int, int>> q; 
    q.push({0, 0}); 
    visited[0][0] = 1; 

    while (!q.empty()) {  
        pair<int, int> now = q.front(); 
        q.pop();
        int x = now.first; 
        int y = now.second; 
        for (int i = 0; i < 4; i++) { 
            int nx = x + dx[i]; 
            int ny = y + dy[i]; 
            if (nx >= 0 && ny >= 0 && nx < n && ny < m) { 
                if (maps[nx][ny] == 1 && visited[nx][ny] == 0) { 
                    visited[nx][ny] = visited[x][y] + 1;
                    q.push({nx, ny}); 
                }
            }
        }
    }
    return visited[n - 1][m - 1] == 0 ? -1 : visited[n - 1][m - 1]; 

}