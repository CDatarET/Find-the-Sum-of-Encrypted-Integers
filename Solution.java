class Solution {
    private int encrypt(int n){
        int max = 0;
        int l = 0;
        while(n > 0){
            max = Math.max(max, n % 10);
            n = n / 10;
            l++;
        }

        return(max * (int)((Math.pow(10, l) - 1) / 9));
    }

    public int sumOfEncryptedInt(int[] nums) {
        int sum = 0;
        for(int i = 0; i < nums.length; i++){
            nums[i] = encrypt(nums[i]);
            sum += nums[i];
        }

        return(sum);
    }
}
