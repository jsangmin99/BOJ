#include <iostream>
#include <string>
using namespace std;
int main(){
    int cn= 0, hn=0, hindex = 0;
    int sum = 0;
    char arr[10];
    
    cin >> arr;

    if(arr[1] == 'H'){
	    cn = 1;
    }
    else{
	    for(int i=1; arr[i] != 'H'; i++){
		cn = cn * 10 + (arr[i] - 48);
		hindex = i;
	    }
    }

    if(arr[hindex + 2] =='\0'){
	    hn = 1;
    }
    else{
	    for(int i = hindex+2; arr[i] != '\0'; i++){
		    hn = hn * 10 + (arr[i]-48);
	    }
    }
    cout << 12 * cn + hn;
}

