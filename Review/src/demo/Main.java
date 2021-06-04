package demo;

import java.util.ArrayList;

import entity.Member;
//Shift+Control+Oでインポートする
import service.MemberServiceImpl;

//ServiceImplクラスを使ってMainメソッドの中で実行するためのクラスを作成する
//public static void mainにチェックを入れる
public class Main {

	public static void main(String[] args) {
		MemberServiceImpl service = new MemberServiceImpl();
		
		//greetから試してみる
		//使い方としては、serviceのgreetは値を返してくるため、引数の中にいれる
		System.out.println(service.greet(2)); 
		
		//ArrayListが返ってくるのか確認する
		System.out.println(service.getAll());
		//中身の値を確かめるためまずはArrayListを呼び出す
		ArrayList<Member> list = service.getAll();
		//ArrayListであるためfor文を使ってlistの中にあるmemberを次々と取り出す
		//listの中にはmemberのインスタンスが格納されているので、それを次々と取り出し、getで値を出力する
		for(Member mem : list) {
			System.out.println(mem.getId() + "," + mem.getName() + "," + mem.getEmail());
		}
		
	}

}
