package com.huluohu.learning.dp.test;

import java.util.Arrays;
import java.util.Calendar;
import java.util.HashSet;
import java.util.Set;

/**
 * Company        :   mamahao.com
 * author         :   guxiaolong
 * Date           :   2015/12/24
 * Time           :   10:40
 * Description    :
 */
public class Client {
	public static void main(String[] args) {
//		int sub = ChineseEraAndZodiacUtils.subtractYear(1110);
//		System.out.println(sub);
//		System.out.println(34/60);
//		System.out.println(694/60);
//		System.out.println(ChineseEraAndZodiacUtils.getShengXiaoName(1670));
//		System.out.println(ChineseEraAndZodiacUtils.getShengXiaoIndex(1989));
//		System.out.println(Calendar.getInstance().get(Calendar.YEAR));

		Set<Integer> set = new HashSet<>();
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(3);
		set.add(1);
		set.add(1);
		System.out.println(Arrays.toString(set.toArray()));
	}
}
