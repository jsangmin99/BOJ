#include <string>
#include <vector>

using namespace std;

vector<int> solution(int n, vector<int> slicer, vector<int> num_list) {
    int a = slicer[0];
    int b = slicer[1];
    int c = slicer[2];

    vector<int> result;

    if (n == 1) {
        result.assign(num_list.begin(), num_list.begin() + b + 1);
    } else if (n == 2) {
        result.assign(num_list.begin() + a, num_list.end());
    } else if (n == 3) {
        result.assign(num_list.begin() + a, num_list.begin() + b + 1);
    } else if (n == 4) {
        for (int i = a; i <= b; i += c) {
            result.push_back(num_list[i]);
        }
    }

    return result;
}