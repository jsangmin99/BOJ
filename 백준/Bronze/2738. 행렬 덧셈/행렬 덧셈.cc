#include <iostream>
using namespace std;

int main() {
    int N,M;
    int m[101][101];
    int n[101][101];
    cin >> N >> M;
    for (int i =0; i<N; i++){
        for(int j = 0; j<M; j++){
            cin >> n[i][j];
        }
    }
    for (int i =0; i<N; i++){
        for(int j = 0; j<M; j++){
            cin >> m[i][j];
        }
    }
    for (int i =0; i<N; i++){
        for(int j = 0; j<M; j++){
            cout << n[i][j] + m[i][j] << " ";
        }
        cout << "\n";
    }
   
}