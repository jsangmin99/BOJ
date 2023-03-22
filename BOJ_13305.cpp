#include <iostream>
using namespace std;
int main()
{
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    cout.tie(NULL);
    long long N;
    long long MAX=1000000000, sum=0;
    cin >> N;
    
    long long point[100001];
    long long dis[100001];

    for(int i=0; i<N-1; i++)
        cin >> dis[i];
    
    
    for(int i=0; i<N; i++)
        cin >> point[i];
    
    
    for(int i=0; i<N-1; i++){
        if (point[i] < MAX)
			MAX = point[i];
			
		sum += MAX * dis[i];
    }
    cout << sum;
 
}