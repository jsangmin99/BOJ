#include<iostream>
#include<string>
using namespace std;
int main(){
    char arr[100];
    char result[100];
    int p = 0;
    cin.getline(arr, 100);
    for (int i = 0; arr[i] != '\0'; i++)
    {
        if(arr[i] != ' '){
            if(65 <= arr[i] && arr[i] <= 90)
                result[p++] = arr[i] + 32;
            else result[p++] = arr[i];
        }
    }
    result[p] = '\0';
    for(int i = 0; result[i] != '\0'; i ++){
        cout << result[i];
    }
    
}