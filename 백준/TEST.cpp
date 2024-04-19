#include <stdio.h>

int main(int argc, char *argv[]) 
{ 
    int a[4] = {0, 2, 4, 8}; 
    int b[3] = {}; 
    int i = 0; // i를 0으로 초기화
    int sum = 0;

    for (i = 1; i < 4; i++) // i를 초기화한 후에 반복문 시작
    {
        int* p1 = a + i; // p1을 반복문 내부에 정의
        b[i-1] = p1 - (a + i - 1); // b[i-1]에 p1과 a[i-1] 사이의 거리 할당
        sum += b[i-1] + a[i]; // sum에 b[i-1] + a[i] 더하기
    } 

    printf("%d", sum); 
    return 0; 
}
