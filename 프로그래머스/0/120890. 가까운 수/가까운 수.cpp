#include <string>
#include <vector>
#include <algorithm>
#include <cmath>

using namespace std;

int solution(vector<int> array, int n) {
    int answer = 0;
    int min = 101;
    sort(array.begin(), array.end());
    for(int i = 0; i < array.size(); i++){
        if(min > abs(array[i] - n)) {
            min = abs(array[i] - n);
            answer = array[i];
        }
    }
    return answer;
}