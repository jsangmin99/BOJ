#include <string>
#include <vector>
#include <map>

using namespace std;

int solution(vector<int> array) {
    int answer = 0;
    map<int,int> freq;
    int max = 0;
    int mode = -1;
    
    for(int i : array){
        freq[i]++;
        if(freq[i] > max){
            max = freq[i];
            mode = i;
        }else if(freq[i] == max){
            mode = -1;
        }
    }
    answer = mode;
    return answer;
}