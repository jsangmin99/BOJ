#include <string>
#include <vector>
#include <unordered_map>
#include <iostream>
#include <set>
#include <cstring>
using namespace std;

unordered_map<int, long long> mp; // <무게, 개수>
bool visited[1010][1010]; //방문했는지

long long solution(vector<int> weights) {
    long long answer = 0;

    // 각 무게의 개수를 저장
    for (int weight : weights) {
        mp[weight]++;
    }

    for (auto it = mp.begin(); it != mp.end(); it++) {
        int w = it->first; //화살표는 키를 본단걸 뜻함
        long long count = it->second; //개수

        answer += (count * (count - 1)) / 2; // 자기 자신과의 조합 수를 answer에 더함

        // 거리 2,3,4에 대해 다른 무게와 비교
        for (int i = 2; i <= 4; i++) {
            for (int j = 2; j <= 4; j++) {
                if (i == j) continue;
                if ((w * i) % j) continue;

                int other_weight = w * i / j;
                if (mp.count(other_weight) && !visited[w][other_weight]) {
                    visited[w][other_weight] = true;
                    visited[other_weight][w] = true;
                    answer += count * mp[other_weight];
                }
            }
        }
    }

    return answer;
}