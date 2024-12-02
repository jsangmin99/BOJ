#include <iostream>

using namespace std;

int main() {
    int a,b,c;
    int x,y,z;
    int max_total = 0;
    int mell_total = 0;

    cin >> a >> b >> c;
    cin >> x >> y >> z;

    max_total = a*3 + b*20 + c*120;
    mell_total = x*3 + y*20 + z*120;

    if(max_total > mell_total){
        cout << "Max";
    }else if (max_total < mell_total){
        cout << "Mel";
    }else{
        cout << "Draw";
    }
    
       
    

return 0;
}
