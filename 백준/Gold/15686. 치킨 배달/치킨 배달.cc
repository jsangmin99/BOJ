#include <algorithm>
#include <cmath>
#include <iostream>
#include <vector>
using namespace std;

struct Pos
{
    int x, y;
};
int N, M;
int MIN = 987654321; // 출력할 도시의 치킨 거리 최솟값
bool selected[13];
vector<Pos> house_pos;
vector<Pos> chicken_pos;
vector<Pos> picked;

int Distance(Pos a, Pos b)
{
    return abs(a.x - b.x) + abs(a.y - b.y);
}

void Find_Min_Dist()
{
    int result = 0;
    for (int i = 0; i < house_pos.size(); i++) // 각 집으로부터
    {
        int min_dist = 987654321;
        for (int j = 0; j < picked.size(); j++) // 모든 고른 치킨집에 대해
        {
            min_dist = min(min_dist, Distance(house_pos[i], picked[j])); // 최소 치킨거리 찾아
        }
        result += min_dist; // 최소 도시의 치킨거리 구함
    }
    MIN = min(MIN, result);
}

void Find_M_Combination(int x, int m)
{
    if (m == M)
    { // M개 다 골랐으면 각 집으로부터 도시의 치킨거리가 최소인 치킨집 찾기
        Find_Min_Dist();
    }

    // 치킨집 M개 고르자
    for (int i = x; i < chicken_pos.size(); i++)
    {
        if (selected[i] == true)
            continue; // 이미 확정된거면 패스

        selected[i] = true;
        picked.push_back({ chicken_pos[i].x, chicken_pos[i].y });
        Find_M_Combination(i, m + 1);
        selected[i] = false;
        picked.pop_back();
    }
}

int main()
{
    cin >> N >> M;
    for (int i = 0; i < N; i++)
    {
        for (int j = 0; j < N; j++)
        {
            int tmp;
            cin >> tmp;
            if (tmp == 1)
                house_pos.push_back({ i, j });
            else if (tmp == 2)
                chicken_pos.push_back({ i, j });
        }
    }
    Find_M_Combination(0, 0);
    cout << MIN << endl;
    return 0;
}