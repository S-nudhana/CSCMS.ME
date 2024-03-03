#include <stdio.h>
#include <stdlib.h>

int compare(const void *a, const void *b) {
    return (*(long long *)a - *(long long *)b);
}

int main() {
    int n;
    scanf("%d", &n);
    long long *arr = (long long *)malloc(n * sizeof(long long));
    int count = 0;

    for (int i = 0; i < n; i++) {
        scanf("%lld", &arr[i]);
    }

    qsort(arr, n, sizeof(long long), compare);

    long long max = -1;
    for (int i = 0; i < n; i++) {
        if (max < arr[i]) {
            max = arr[i];
            count++;
        }
    }

    printf("%d\n", count);

    free(arr);
    return 0;
}