class Solution {
    /**
     * @param A: sorted integer array A which has m elements, 
     *           but size of A is m+n
     * @param B: sorted integer array B which has n elements
     * @return: void
     */
    public void mergeSortedArray(int[] A, int m, int[] B, int n) {
		if (B == null || B.length == 0) return;
		int[] AA = new int[m];
		for (int i = 0; i < m; i++) {
		    AA[i] = A[i];
		}
		int i = 0;
		int j = 0;
		while(i <= m - 1 && j <= n - 1) {
		    if(AA[i] < B[j]) {
		        A[i + j] = AA[i];
		        i++;
		    }
		    else {
		        A[i + j] = B[j];
		        j++;
		    }
		}
		while(i <= m - 1) {
		    A[i + j] = AA[i];
		    i++;
		}
		while(j <= n - 1) {
		    A[i + j] = B[j];
		    j++;
		}

	}

}
