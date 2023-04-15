#include <iostream>
using namespace std;
int main()
{
	int n, cas=1;
	int n0, n1, n2, n3, n4;

	while (1)
	{
		cin >> n0;
		if (n0 == 0) break;
		n1 = n0 * 3;
		if (n1 % 2 == 0)
			n2 = n1 / 2;
		else
			n2 = (n1 + 1) / 2;

		n3 = n2 * 3;
		n4 = n3 / 9;

		if (n1 % 2 == 0){
			n0 = 2 * n4;
			cout << cas << ". " << "even " << n4<< "\n";
			cas++;
		}else{
			n0 = n2* n4 + 1;
			cout << cas << ". " << "odd " << n4<< "\n";
			cas++;
		}
		
	}
}