package com.moonspirit.nowcoder;

import java.util.ArrayList;

/**
 * @ClassName      Solution006
 * @Description    剑指 offer - 旋转数组的最小数字
 * @author         moonspirit
 * @date           2019年2月26日 上午10:57:35
 * @version        1.0.0
 */
public class Solution006 {
	public int minNumberInRotateArray(int[] array) {
		if (array.length == 0)
			return 0;

		int low = 0;
		int high = array.length - 1;
		while (low < high) {
			int mid = low + (high - low) / 2;
			if (array[mid] > array[high]) { // 3 4 5 1; 2 1
				low = mid + 1;
			} else if (array[mid] < array[high]) { // 4 1 2 3; 1 2
				high = mid;
			} else { // 1 1 0 1
				high = high - 1;
			}
		}
		return array[high];
	}
}
