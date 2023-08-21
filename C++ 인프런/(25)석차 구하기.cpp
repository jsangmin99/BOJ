#include<iostream>
using namespace std;
int main(){
   int N;
    cin >> N; 
    int scores[N]; 

    for (int i = 0; i < N; i++) {
        cin >> scores[i]; 
    }

    int ranks[N]; 

    for (int i = 0; i < N; i++) {
        ranks[i] = 1;
        for (int j = 0; j < N; j++) {
            if (scores[i] < scores[j]) {
                ranks[i]++; 
            }
        }
    }

    for (int i = 0; i < N; i++) {
        cout << ranks[i];
    }

    return 0;
}