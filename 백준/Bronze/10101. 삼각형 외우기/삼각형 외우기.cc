#include<iostream>
using namespace std;
int main() {
    int q, w, e;
    cin >> q >> w >> e;
    
    if( q == 60 && w == 60 && e == 60){
        cout << "Equilateral";
    }
    else if(q+w+e == 180){
        if(q==w || w==e || q==e)
        cout << "Isosceles";
        else if(q!=w || w!=e || q!=e)
        cout << "Scalene";
    }
    else{
        cout << "Error";   
    }
}