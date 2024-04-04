#include <string>
#include <vector>

using namespace std;

vector<int> solution(int brown, int yellow) {
    vector<int> answer;
    int sum = brown + yellow;
    
    for(int height = 3; ; height++){
        if(!(sum % height)){
            int wide = sum / height;
            if((height-2) * (wide-2) == yellow){
                answer.push_back(wide);
                answer.push_back(height);
                break;
            } 
        }
    }
    return answer;
}
// 48/ 3 = 16
// 48 /4 = 12