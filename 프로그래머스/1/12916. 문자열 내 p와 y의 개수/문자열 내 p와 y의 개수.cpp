#include <string>
#include <iostream>
using namespace std;

bool solution(string s)
{
    bool answer = true;
    int check = 0;
    for(int i = 0; i< s.size();i++){
        if(s[i] == 'p' || s[i] == 'P'){
            check++;
        }else if(s[i] == 'y' || s[i] == 'Y'){
            check--;
        }
    }
    
    if(check == 0){
        answer = true;
    }else{
        answer = false;
    }



    return answer;
}