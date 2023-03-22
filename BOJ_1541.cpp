#include<iostream>
#include<string>
using namespace std;

int main(){
    string input;
    string num;
    int result=0;
    bool minus=false;


    cin >> input;
    for(int i=0; i<=input.size();i++){

        if(input[i] == '-' || input[i] == '+' || i==input.size()){
            if(minus == false){
                result += stoi(num);
                num = "";
            }
            else{
                result -= stoi(num);
                num = "";
            }
        }
        else{
            num += input[i];
        }
        if (input[i] == '-') {
				minus = true;
			}
    }
    cout << result;
}