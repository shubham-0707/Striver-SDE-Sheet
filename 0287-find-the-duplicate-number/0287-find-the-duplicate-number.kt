class Solution {
    fun findDuplicate(nums: IntArray): Int {
        while(nums[0]!=nums[nums[0]]){
            val temp = nums[nums[0]]
            nums[nums[0]] = nums[0]
            nums[0] = temp
        }
        return nums[0]
    }
}