#include<iostream>
using namespace std;
int main(){
    char str[100];
    char arrA[53]={};
    char arrB[53]={};

    cin >> str;
    for (int i = 0; str[i] != '\0'; i++)
    {
        if (str[i] >=65 && str[i] <= 90)
            arrA[str[i]-64]++;
        else
            arrA[str[i]-70]++;        
    }
    cin >> str;
    for (int i = 0; str[i] != '\0'; i++)
    {
        if (str[i] >=65 && str[i] <= 90)
            arrB[str[i]-64]++;
        else
            arrB[str[i]-70]++;        
    }
    for (int i = 0; i <= 52; i++)
    {
        if (arrA[i] != arrB[i])
        {
            cout << "NO";
            exit (0);
        }
    }
    cout << "YES";
    
    
}