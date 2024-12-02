#include<iostream>
using namespace std;
/* 
1. 높이 확인 */
int main(){
    int n, m, b; //n=세로축 , m 은 가로축 b 는 인벤토리
    int arr[500][500];
    int result_time = 999999999;
    int result_height = -1;
    cin >> n >> m >> b;
    for(int i=0; i<n; i++)
        for(int j = 0; j<m; j++)
            cin >> arr[i][j];
    
    for (int height =0; height <= 256; height++){
        int add =0; // 추가해야되는 개수
        int remove =0; // 제거해야되는 개수
        for(int i =0; i < n; i++){
            for(int j =0; j < m; j++){
                int test_height = arr[i][j] -height;

                if(test_height < 0) add -= test_height; //음수일 경우에는 블록을 쌓아야 되므로 추가(음수이므로 -)
                else remove += test_height; //안쌓아고 되는 경우에는 제거해야할 개수++
            }
        }
        
        if(remove + b >= add){ // 제거한양 +내가갖고있는양이 추가할 개수보다 클경우
            int time = add + (2 * remove);
            if (result_time >= time){
                result_time = time;
                result_height = height; 
            } 
        }
    }
    cout << result_time << " " << result_height;

}