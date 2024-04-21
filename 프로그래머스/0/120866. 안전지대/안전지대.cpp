#include <string>
#include <vector>

using namespace std;

int solution(vector<vector<int>> board) {
    int answer = 0;
    int dx[8] = {-1,-1,0,1,1,1,0,-1};
    int dy[8] = {0,1,1,1,0,-1,-1,-1};
    
    for(int x = 0 ; x < board.size(); x++){
        for(int y = 0; y < board.size(); y++){
            if(board[x][y] == 1) {
            	for(int k=0; k<8; k++){
                    if(x+dx[k]>=0 && x+dx[k]<board.size() && y+dy[k]>=0 && y+dy[k]<board.size())
                    if(board[x+dx[k]][y+dy[k]]!=1) board[x+dx[k]][y+dy[k]]=2; // 스킵 방지
            	}
            }
        }
    }
    for(int i=0; i<board.size(); i++)
        for(int j=0; j<board.size(); j++)
            if(board[i][j]==0)
                answer++;
    return answer;
}