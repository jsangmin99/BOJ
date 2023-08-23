#include<iostream>
using namespace std;
int count(int num){
    int count = 0;
    while (num > 0) {
        if (num % 10 == 3) {
            count++;
        }
        num /= 10;
    }
    return count;
}
int main(){
    int N;
    cin >> N;

    int total_count = 0;
    for (int i = 1; i <= N; i++) {
        total_count += count(i);
    }

    cout << total_count << endl;

    return 0;
}