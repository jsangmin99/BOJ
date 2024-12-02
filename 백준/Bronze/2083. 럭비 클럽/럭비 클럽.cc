#include <iostream>
using namespace std;

int main()
{
    string name;
    int age, w;
    while(true){
        name="";
        age=0;
        w=0;
        cin >> name >> age >> w;
        if (name =="#" && age == 0&& w == 0) break;
        if(age >17 || w >= 80){
            cout << name << " " << "Senior" << "\n";
        }
        else{
            cout << name << " " << "Junior" << "\n";
        }
    }
}