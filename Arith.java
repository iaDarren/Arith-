package javabase;

import java.math.BigDecimal;

public class Arith {

	// 默认除法运算精度
	private static final int DEF_DIV_SCALE = 10;

	private Arith() {
	};

	// 提供精确的加法运算
	public static double add(double val1, double val2) {
		BigDecimal b1 = BigDecimal.valueOf(val1);
		BigDecimal b2 = BigDecimal.valueOf(val2);
		return b1.add(b2).doubleValue();
	}

	// 提供精确的减法运算
	public static double sub(double val1, double val2) {
		BigDecimal b1 = BigDecimal.valueOf(val1);
		BigDecimal b2 = BigDecimal.valueOf(val2);
		return b1.subtract(b2).doubleValue();
	}

	// 提供精确的乘法运算
	public static double mul(double val1, double val2) {
		BigDecimal b1 = BigDecimal.valueOf(val1);
		BigDecimal b2 = BigDecimal.valueOf(val2);
		return b1.multiply(b2).doubleValue();
	}

	// 提供(相对)精确的减法运算，当发生除不尽时小数点以后10位以后的数字四舍五入
	public static double div(double val1, double val2) {
		BigDecimal b1 = BigDecimal.valueOf(val1);
		BigDecimal b2 = BigDecimal.valueOf(val2);
		return b1.divide(b2, DEF_DIV_SCALE, BigDecimal.ROUND_HALF_UP).doubleValue();
	}

	public static void main(String[] args) {
		System.out.println("0.002+0.0045 =" + Arith.add(0.002, 0.0045));
		System.out.println("0.002-0.0045 =" + Arith.sub(0.002, 0.0045));
		System.out.println("0.002*0.0045 =" + Arith.mul(0.002, 0.0045));
		System.out.println("0.01/0.3 =" + Arith.div(0.002, 0.0045));
	}
}
