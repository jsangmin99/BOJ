#include <iostream>
using namespace std;

int main() {
    int score[] = {12, 11, 11, 10, 9, 9, 9, 8, 7, 6, 6};
    int penalty[] = {1600, 894, 1327, 1311, 1004, 1178, 1357, 837, 1055, 556, 773};
    
    int n;
    cin >> n;
    
    cout << score[n-1] << " " << penalty[n-1];
    
    return 0;
}