#include <iostream>
#include <vector>
using namespace std;

int main() {
    int n;
    cin >> n;
    vector<int> front_height(n);
    vector<int> side_height(n);

    for (int i = 0; i < n; i++) {
        cin >> front_height[i];
    }

    for (int i = 0; i < n; i++) {
        cin >> side_height[i];
    }

    int max_blocks = 0;

    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            int min_height = min(front_height[i], side_height[j]);
            max_blocks += min_height; 
        }
    }

    cout << max_blocks << endl; 
    return 0;
}
