#include <vector>
#include <algorithm> // for std::find
using namespace std;

vector<int> solution(vector<int> lottos, vector<int> win_nums) {
    vector<int> answer;
    int tmp = 0;
    int zero = 0;
    
    for(int i = 0; i < lottos.size(); i++){
        if(lottos[i] != 0){
            if(find(win_nums.begin(), win_nums.end(), lottos[i]) != win_nums.end()){
                tmp++;
            }
        }else{
            zero++;
        }
    }
    
    // 최고 순위 계산
    int max_rank = 7 - (zero + tmp);
    if(max_rank > 6) max_rank = 6; // 최대 6등
    
    // 최저 순위 계산
    int min_rank = 7 - tmp;
    if(min_rank > 6) min_rank = 6; // 최대 6등
    
    answer.push_back(max_rank);
    answer.push_back(min_rank);
    
    return answer;
}
