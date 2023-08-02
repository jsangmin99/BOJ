#include <iostream>
#include <cmath>
using namespace std;
int main(){
    int D; //대각선의 길이
    int H; // TV 높이 비율
    int W; // TV 너비 비율
    double ratio;
    cin >> D >> H >> W;
    ratio = sqrt((double)(D*D) / (H*H + W*W));


    cout<< (int)(H*ratio) << " " << (int)(W*ratio);
}