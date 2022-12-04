package LeetCode;

class minimum_verage_difference {
    public int minimumAverageDifference(int[] nums) {
        /*
         * 2 번째 방법을 응용
         */
        long totalSum = 0, currentSum = 0;
        
        for (int i = 0 ; i < nums.length ; i++) {
            totalSum += nums[i];
        }
        
        int maxValue = Integer.MAX_VALUE, maxIdx = -1;
        
        for (int i = 0 ; i < nums.length ; i++) {
            currentSum += nums[i];
            
            long leftAvg = currentSum / (i + 1);
            long rightAvg =  0;
        
            if (nums.length != i + 1) {
                rightAvg = (totalSum - currentSum) / (nums.length - i - 1);
            }
            
            int abs = (int) Math.abs(leftAvg - rightAvg);
            if (abs < maxValue) {
                maxValue = abs;
                maxIdx = i;
            }
        }

        return maxIdx;
        
        /*
         * n 개가 있을 때, n 번만 반복하므로 O(n) 이다.
         * 2번째 방법
         */
//         int minValue = Integer.MAX_VALUE, minIdx = -1;
//         long[] prefixArray = new long[nums.length + 1];
//         long[] suffixArray = new long[nums.length + 1];
        
//         for (int i = 0 ; i < nums.length ; i++) {
//             prefixArray[i + 1] = prefixArray[i] + nums[i];
//         }
        
//         for (int i = nums.length - 1 ; i >= 0 ; i--) {
//             suffixArray[i] = suffixArray[i + 1] + nums[i];
//         }
        
//         for (int i = 0 ; i < nums.length ; i++) {
//             long leftAvg = prefixArray[i + 1] / (i + 1);
            
//             long rightAvg = suffixArray[i + 1];
            
//             if (nums.length != i + 1) {
//                 rightAvg /= (nums.length - i - 1);
//             }
            
//             int abs = (int) Math.abs(leftAvg - rightAvg);

//             if (minValue > abs) {
//                 minValue = abs;
//                 minIdx = i;
//             }
//         }
        
//         return minIdx;

            /*
             * O(n^2) 방법이다. 내부에 더하는 반복문이 있기 때문에.
             * 1번째 방법으로 브루투스 방법이다. (탐욕적 방법)
             */
        // int lt = 0, rt = 0, min = Integer.MAX_VALUE, minIdx = 0;
//         while (lt < nums.length) {
//             long leftSum = 0, rightSum = 0;
//             for (int i = 0 ; i <= lt ; i++) {
//                 leftSum += nums[i];
//             }
            
//             for (int i = rt ; i < nums.length ; i++) {
//                 rightSum += nums[i];
//             }
            
//             int leftAvg = (int) leftSum / (lt + 1);
//             int rightAvg = nums.length - rt == 0 ? 0 : (int) rightSum / (nums.length - rt);
//             int abs = (int) Math.abs(leftAvg - rightAvg);
//             if (min > abs) {
//                 min = abs;
//                 minIdx = lt;
//             }
//             lt++;
//             rt++;
//         }
        
        // return minIdx;
    }
}