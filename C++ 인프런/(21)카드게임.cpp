#include<iostream>
using namespace std;
int main(){
    int arrA[11], arrB[11];
    int A = 0, B = 0;
    char result;
    for(int i = 0; i<10; i++)
        cin >> arrA[i];
    for(int i = 0; i<10; i++)
        cin >> arrB[i];
    for(int i = 0; i<10; i++){
        if(arrA[i] > arrB[i]){
            A +=3;
        }
        else if(arrA[i] < arrB[i]){
            B +=3;
        }
        else{
            A += 1;
            B += 1;
        }
    }
    cout << A << " " << B << "\n";
    if(A >B)
        cout << "A";
    else if(A < B)
        cout << "B";
    else
        cout << "D";

    
}