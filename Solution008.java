package com.moonspirit.nowcoder;

/**
 * @ClassName      Solution008_1
 * @Description    剑指 offer - 跳台阶 迭代
 * @author         moonspirit
 * @date           2019年2月26日 上午10:57:35
 * @version        1.0.0
 */
public class Solution008_1 {
	public int JumpFloor(int target) {
		int[] num = new int[] { 1, 1 };
		for (int i = 1; i < target; i++) {
			num[(i + 1) % 2] = num[0] + num[1];
		}
		return num[target % 2];
	}
}

/**
 * @ClassName      Solution008_2
 * @Description    剑指 offer - 跳台阶 递归
 * @author         moonspirit
 * @date           2019年2月26日 上午10:57:35
 * @version        1.0.0
 */
public class Solution008_2 {
	public int JumpFloor(int target) {
		if (target <= 2)
			return target;

		return JumpFloor(target - 1) + JumpFloor(target - 2);
	}
}
