#include <iostream>
#include <string>
 
using namespace std;
 
int main() {
 
    string a, b;
    cin>>a>>b;
 
    int A=0;
    int B=0;
 
    for(int i=0; i<a.length(); i++){
        if(a[i]=='a'){
            A++;
        }
    }
 
    for(int i=0; i<b.length(); i++){
        if(b[i]=='a'){
            B++;
        }
    }
    if(A>=B||a.length()==b.length()){
        cout<<"go";
    }    
    else{
        cout<<"no";
    }
}