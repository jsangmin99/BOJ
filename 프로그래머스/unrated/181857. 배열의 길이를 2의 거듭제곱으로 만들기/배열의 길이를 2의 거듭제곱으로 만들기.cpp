#include <string>
#include <vector>
#include <cmath>

using namespace std;

vector<int> solution(vector<int> arr) {
    int originSize = arr.size();
    int length = pow(2,ceil(log2(originSize)));
    
    for(int i =0; i < (length - originSize); i++){
        arr.push_back(0);
    }
    return arr;
}