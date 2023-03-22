#include <iostream>
using namespace std;

int main(){
   int x1,x2,x3,y1,y2,y3;
   int re1=0,re2=0;
   cin>>x1>>y1>>x2>>y2>>x3>>y3;

   if(x1==x2){
      re1=x3;}
   else if(x1==x3){
      re1=x2;
   }else{
      re1=x1;
   }
   if(y1==y2){
      re2=y3;}
   else if(y1==y3){
      re2=y2;
   }else{
      re2=y1;
   }
   cout<<re1<<" "<<re2;

}   