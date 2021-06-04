//MemberServiceを定義する
package service;

//読み込みをするために「Shift + Control + O」で「entity.Member」を選択する
import java.util.ArrayList;

import entity.Member;

public interface MemberService {
	//String型のものを返すgreetと言うメソッドを定義
	//この段階でabstractとpublicは自動的に補完されるため記載する必要はなし
	String greet(int i);
	
	//ArrayListを返すものを定義
	//リスト型でMemberが複数いるイメージ
	ArrayList<Member> getAll();
}
