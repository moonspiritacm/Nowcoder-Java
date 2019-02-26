package com.moonspirit.nowcoder;

/**
 * @ClassName      Solution009_1
 * @Description    剑指 offer - 变态跳台阶 迭代
 * @author         moonspirit
 * @date           2019年2月26日 上午10:57:35
 * @version        1.0.0
 */
public class Solution009_1 {
	public int JumpFloorII(int target) {
		int num = 1;

		for (int i = 1; i < target; i++) {
			num = 2 * num;
		}
		return num;
	}
}

/**
 * @ClassName      Solution009_2
 * @Description    剑指 offer - 变态跳台阶 递归
 * @author         moonspirit
 * @date           2019年2月26日 上午10:57:35
 * @version        1.0.0
 */
public class Solution009_2 {
	public int JumpFloorII(int target) {
		if (target == 1)
			return 1;

		return 2 * JumpFloorII(target - 1);
	}
}
