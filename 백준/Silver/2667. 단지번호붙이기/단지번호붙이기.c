#include <stdio.h>

int map[25][25] = { 0 };
int dx[4] = {0,1,0,-1};
int dy[4] = {-1,0,1,0};
int res[1000] = { 0 };
int idx = 0;

int find(int x, int y, int n) {
	
	if (x < 0 || x >= n || y < 0 || y >= n)
		return 0;

	if (map[x][y] == 1) {
		map[x][y] = 0;
		res[idx]++;

		for (int i = 0; i < 4; i++) {
			find(x + dx[i], y + dy[i],n);
		}
		return 1;
	}
	
	return 0;
}

void sort(int n) {
	int i,j, temp;
	for (i = 0; i < n; i++) {
		for (j = 0; j < n - 1; j++) {
			if (res[j] > res[j + 1]) {
				temp = res[j];
				res[j] = res[j + 1];
				res[j + 1] = temp;
			}
		}
	}
}


int main() {
	int n;
	scanf("%d", &n);

	int i, j;
	for (i = 0; i < n; i++) {
		for (j = 0; j < n; j++) {
			scanf("%1d", &map[i][j]);
		}
	}

	for (i = 0; i < n; i++) {
		for (j = 0; j < n; j++) {
			if (find(i, j, n) == 1) {
				idx++;
			}
		}
	}
	
	printf("%d\n", idx);
	sort(idx);
	for (i = 0; i < idx; i++) {
		printf("%d\n", res[i]);
	}
}