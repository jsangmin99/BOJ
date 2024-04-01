#include <string>
#include <vector>

using namespace std;
void Hanoi(vector<vector<int>>& answer, int n, int start, int destination) {
    int other_area = 6-start-destination;
    if (n == 1) {
        answer.push_back({start, destination});
        return;
    }

    Hanoi(answer, n-1, start, other_area);
    answer.push_back({start, destination});
    Hanoi(answer,n-1, other_area, destination);
}

vector<vector<int>> solution(int n) {
    vector<vector<int>> answer;
    Hanoi(answer,n,1,3);
    return answer;
}