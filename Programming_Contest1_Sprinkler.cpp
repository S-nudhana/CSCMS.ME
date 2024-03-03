#include <iostream>
#include <vector>

int main() {
    std::ios::sync_with_stdio(false);
    std::cin.tie(0);

    int n, m;
    std::cin >> n >> m;
    
    std::vector<std::vector<int>> arr(n, std::vector<int>(m));
    
    for (int i = 0; i < n; ++i) {
        for (int j = 0; j < m; ++j) {
            std::cin >> arr[i][j];
        }
    }

    int maxSum = 0;

    for (int i = 0; i < n; ++i) {
        for (int j = 0; j < m; ++j) {
            int rowSum = 0;
            int colSum = 0;

            for (int k = 0; k < m; ++k) {
                rowSum += arr[i][k];
            }

            for (int l = 0; l < n; ++l) {
                colSum += arr[l][j];
            }

            int sum = rowSum + colSum - arr[i][j];

            if (sum > maxSum) {
                maxSum = sum;
            }
        }
    }

    std::cout << maxSum << std::endl;

    return 0;
}