#include<iostream>
using namespace std;
int main(){
    int num[10];
    int score=0;
    for(int i=0; i<10;i++){
    cin >>num[i];
    }

    for(int i=0; i<10;i++){
        if(abs(score+num[i]-100) <= abs(score -100)){
            score += num[i];
        }
        else{
            break;
        }
    }
    cout<< score;
    return 0;
}