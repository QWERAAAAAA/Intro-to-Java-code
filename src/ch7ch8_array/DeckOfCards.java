package ch7ch8_array;

/********************************************************
FileName:		扑克牌
Author:        	M12J10
Created:       	2022/11/27
Description:	数组的应用。从一副牌中随机选出4张牌，显示这四张牌对应的牌。
Analyze:		cardNumber / 13 决定牌的花色	（0黑桃、1红桃、2方块、3梅花）
				cardNumber % 13 决定具体是花色中的哪张牌（0-Ace、1-2、11-Jack、12-Queen、13-King）
********************************************************/

public class DeckOfCards {
	public static void main(String[] args) {
		// 存放数据
		int[] deck = new int[52];
		String[] suits = {"Spades","Hearts","Diamonds","Clubs"};
		String[] ranks = {"Ace","2","3","4","5","6","7","8","9","10","Jack","Queen","King"};
		
		// 初始化牌号
		for(int i = 0; i < deck.length; i++)
			deck[i] = i;
		
		// 打乱扑克
		for(int i = 0; i < deck.length; i++) {
			int index = (int)(Math.random() * deck.length);
			int temp = deck[i];
			deck[i] = deck[index];
			deck[index] = temp;
		}
		
		// 求出随机四张牌的具体花色号码
		for(int i = 0; i < 4; i++) {
			String suit = suits[deck[i] / 13];
			String rank = ranks[deck[i] % 13];
			System.out.println("Card number " + deck[i] + ": " + rank + " of " + suit);
		}
	}
}
