//a-b
#include <iostream>
using namespace std;

int main(){
   int T,x1,y1,r1,x2,y2,r2;
   int d,mcase,pcase;
    cin>>T;
    for(int i=0;i<T;i++){
        cin>>x1>>y1>>r1>>x2>>y2>>r2;
    d=(x1-x2)*(x1-x2)+(y1-y2)*(y1-y2);
    mcase=(r1-r2)*(r1-r2);
    pcase=(r1+r2)*(r1+r2);
        if(d==0){
            if(mcase==0){
                cout<<"-1"<<"\n";}
            else{
                cout<<"0"<<"\n";
            }
        }
        else if(pcase==d||mcase==d){
            cout<<"1"<<"\n";}
        else if(mcase<d&&d<pcase){
            cout<<"2"<<"\n";}
        else{
            cout<<"0"<<"\n";
        }
    }
}   