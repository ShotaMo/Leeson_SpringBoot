//実装したクラスを作成する
//"implements MemberService"を行った形でMemberServiceImplを生成する
package service;

import java.util.ArrayList;

import entity.Member;

public class MemberServiceImpl implements MemberService {

	//Overrideした場合、自動生成させるとアノテーションがつく（付けておいた方が良い）
	@Override
	public String greet(int i) {
		//"int i"に応じて挨拶文を返すようにするため、Stringの配列を作成する
		String[] greetings = {"Good morning", "Hello", "Good evening"};
		//送られてきた[i]に値によってreturnの値を変更する
		return greetings[i];
	}

	//getAll()と言う名のメソッドでArrayListを返す
	//まだメンバーができていなかったので、メンバーを2つインスタンス化しておいてlistに加え、"return list"で返す
	@Override
	public ArrayList<Member> getAll() {
		ArrayList<Member> list = new ArrayList<>();
		//2つのメンバーをインスタンス化してArrayの中に詰める
		Member mem1 = new Member(1, "Linda", "linda@example.com");
		Member mem2 = new Member(2, "James", "james@example.com");
		//listに生成したMemberインスタンスを追加する
		list.add(mem1);
		list.add(mem2);
		
		return list;
	}
}
