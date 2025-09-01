/**
 * @param {number[]} nums
 * @param {number} k
 * @return {number}
 */
var subarraySum = function (nums, k) {
    let len = nums.length;
    let counter = 0;
    let prefix_sum = 0;

    const map = new Map();
    map.set(0, 1);
    for (let i = 0; i < len ; i++) {
        let val = parseInt(nums[i]);
        prefix_sum += val;
        let need = prefix_sum - k;
        if (map.has(need)) {
            counter += map.get(need);
        }
        if (map.has(prefix_sum)) {
            map.set(prefix_sum, map.get(prefix_sum) + 1);
        }
        else {
            map.set(prefix_sum, 1);
        }
    }
    return counter;
};