#include <string>
#include <vector>

using namespace std;

int trans(int x){
    if(x >= 50 && x%2 == 0)
        return x/2;
    else if (x < 50 && x%2 ==1)
        return x *2 +1;
    else
        return x;
}

int solution(vector<int> arr) {
    int idx = 0;
    vector<int> prevArr = arr;

    while (true) {
        vector<int> changedArr;

        for (int i = 0; i < prevArr.size(); i++) {
            int a = prevArr[i];
            if (a >= 50 && a % 2 == 0) {
                changedArr.push_back(a / 2);
            } else if (a < 50 && a % 2 == 1) {
                changedArr.push_back(a * 2 + 1);
            } else {
                changedArr.push_back(a);
            }
        }

        bool check = true;
        for (int i = 0; i < prevArr.size(); i++) {
            if (prevArr[i] != changedArr[i]) {
                check = false;
                break;
            }
        }
        if (check) break;
        idx++;
        prevArr = changedArr;
    }

    return idx;
}