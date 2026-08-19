public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int left = 1;
        int right = n;
        
        while (left < right) {
            int mid = left + (right - left) / 2; // avoid overflow
            if (isBadVersion(mid)) {
                // mid might be the first bad version, so search left side
                right = mid;
            } else {
                // mid is good, so search right side
                left = mid + 1;
            }
        }
        return left; // left == right, pointing to first bad version
    }
}