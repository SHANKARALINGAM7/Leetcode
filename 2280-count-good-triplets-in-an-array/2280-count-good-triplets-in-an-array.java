class Solution {
    private long[] segTree;

    private void update(int stIdx, int start, int end, int queryIdx) {
        if (end < queryIdx || start > queryIdx) return;
        if (start == end) {
            segTree[stIdx]++;
            return;
        }
        int mid = start + (end - start) / 2;
        update(2 * stIdx, start, mid, queryIdx);
        update(2 * stIdx + 1, mid + 1, end, queryIdx);
        segTree[stIdx] = segTree[2 * stIdx] + segTree[2 * stIdx + 1];
    }

    private long rangeSumQuery(int stIdx, int start, int end, int qs, int qe) {
        if (qs > end || qe < start) return 0;
        if (start >= qs && end <= qe) return segTree[stIdx];
        int mid = start + (end - start) / 2;
        long leftSum = rangeSumQuery(2 * stIdx, start, mid, qs, qe);
        long rightSum = rangeSumQuery(2 * stIdx + 1, mid + 1, end, qs, qe);
        return leftSum + rightSum;
    }

    public long goodTriplets(int[] nums1, int[] nums2) {
        int n = nums1.length;
        segTree = new long[4 * n + 1];

        Map<Integer, Integer> nums2ValIdx = new HashMap<>();
        for (int i = 0; i < n; i++) {
            nums2ValIdx.put(nums2[i], i);
        }

        update(1, 0, n - 1, nums2ValIdx.get(nums1[0]));

        long count = 0;
        for (int i = 1; i < n - 1; i++) {
            int nums2Idx = nums2ValIdx.get(nums1[i]);
            long left = rangeSumQuery(1, 0, n - 1, 0, nums2Idx);
            long notComLeft = i - left;
            long comRight = (n - nums2Idx - 1) - notComLeft;
            count += left * comRight;

            update(1, 0, n - 1, nums2Idx);
        }
        return count;
    }
}