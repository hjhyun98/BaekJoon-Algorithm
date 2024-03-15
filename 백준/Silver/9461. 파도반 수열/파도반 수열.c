#include <stdio.h>

long long int p[101];
long long getP(int n) {
	if (p[n] != 0) return p[n];
	else {
		for (int i = 6; i <= n; i++) {
			p[i] = p[i - 5] + p[i - 1];
		}
		return p[n];
	}
}

int main() {
	int t, n;
	int i;
	scanf("%d", &t);
	
	
	for (i = 0; i < 100; i++)	//p초기화
		p[i] = 0;
	
	p[1] = 1; p[2] = 1; p[3] = 1;
	p[4] = 2; p[5] = 2;

	for (i = 1; i <= t; i++) {
		scanf("%d", &n);
		printf("%lld\n", getP(n));
	}
}

