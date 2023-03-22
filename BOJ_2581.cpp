#include <iostream>
using namespace std;
int main(){
    int m,n;
    int count=0;
    int sum=0,min= -1;
    cin>>m>>n;

    for(;m<=n;m++){
        for(int i = 1; i<=m;i++){
            if(m%i==0)
                count++;
        }
        if(count==2){
            sum += m;
            if(min==-1)
               min= m;
        }
        count=0;
    }
    if(min==-1)
        cout<<min<<"\n";
    else
    cout<<sum<<"\n"<<min<<"\n";
}