//N15649 N과 M(1) - 백트래킹 알고리즘
/*
 백트래킹 = dfs의 비효율적인 경로 차단, 가능성이 있는 루트를 검색하는 방법

 이번문제: 1부터 n 까지 자연수 중 중복없이 m개를 고른 수열 => 중복 없는 순열
 */

#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>

int arr[8] = { 1,2,3,4,5,6,7,8 };
int result[8] = { 0 }; //결과 출력할 배열
int visited[8] = { 0 };	//방문한 숫자 기록

void f1(int n, int m, int depth) {

	if (depth == m) {
		//for (int i = 0; i < n; i++) visited[i] = 0;
		for (int i = 0; i < m; i++)
			printf("%d ", result[i]);
		printf("\n");
		return;
	}
	else {

		for (int i = 0; i < n; i++) {
			if (visited[i] == 0) {
				result[depth] = arr[i];
				visited[i] = 1;
				f1(n, m, depth + 1);
				visited[i] = 0;
			}
		}
		
	}

}

int main() {
	int n, m;
	scanf("%d %d", &n, &m);
	
	
	f1(n, m, 0);
}