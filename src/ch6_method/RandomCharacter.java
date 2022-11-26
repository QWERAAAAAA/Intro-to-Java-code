package ch6_method;

// 示例学习：生成随机字符
public class RandomCharacter {
	// 创建一个在两个字符之间的随机字符
	public static char getRandomCharacter(char ch1, char ch2) {
		return (char)(ch1 + Math.random() * (ch2 - ch1 + 1));	
		// 需要加上1，因为Math.random()小于1，再用int转换类型，就把小数位丢了，即随机数永远比ch2小，取不到。加上1就可以取到ch2了
		// 和数字进行运算，char类型操作数会自动转换为数字
	}
	// 随机生成一个字符
	public static char getRandomCharacter() {
		return getRandomCharacter('\u0000', '\uFFFF');
	}
	// 随机生成一个小写字符
	public static char getRandomLowerCaseLetter() {
		return getRandomCharacter('a', 'z');
	}
	// 随机生成一个大写字符
	public static char getRandomUpperCaseLetter() {
		return getRandomCharacter('A', 'Z');
	}
	// 随机生成一个数字字符
	public static char getRandomDigitCharacter() {
		return getRandomCharacter('0', '9');
	}
	
	//test: 显示175个随机的小写字母，每25个换一行
	public static void main(String[] args) {
		final int NUMBRT_TO_CHARS = 175;
		final int CHARS_PER_LINE = 25;
		
		for(int i = 0; i < NUMBRT_TO_CHARS; i++) {
			char ch = getRandomLowerCaseLetter();
			if((i + 1) % CHARS_PER_LINE == 0)
				System.out.println(ch);
			else
				System.out.print(ch);
		}
	}
}
