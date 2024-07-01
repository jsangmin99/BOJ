#include <limits.h>
#include <cmath>
#include <algorithm>
#include <iostream>
#include <string>
using namespace std;
int main() {
    string bday;
    cin >> bday;
    int N;
    cin >> N;
    int max = INT_MIN;
    string result = "";

    for (int i = 0; i < N; i++) {
        string cday;
        cin >> cday;
        int codingBioRithm = 0;
        int year = 0;
        int month = 0;
        int day = 0;

        for (int i = 0; i < 4; i++) {
            year += pow(((bday[i] - '0') - (cday[i] - '0')), 2);
        }
        for (int i = 0; i < 2; i++) {
            month += pow(((bday[4 + i] - '0') - (cday[4 + i] - '0')), 2);
            day += pow(((bday[6 + i] - '0') - (cday[6 + i] - '0')), 2);
        }
        int sum = 0;
        sum = year * month * day;

        if (sum > max) {
            max = sum;
            result = cday;
        } else if (sum == max && cday < result) {
            result = cday;
        }
    }
    cout << result;
}