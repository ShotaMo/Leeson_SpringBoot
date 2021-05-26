package entity;

public class Member {
	//必要なフィールドを定義
	//全てprivateであるため直接のアクセスはできない状態
	private int id;
	private String name;
	private String email;
	
	//デフォルトの値が設定されるためのConstructorを用意する
	//これだけでidには0,nameにはnullが代入されるConstructorが用意される
	public Member() {}

	//ここから先は自動生成を使用する
	//Source > Generate Constructor using Fields...
	//Accessはpublicにしておき、外からインスタンスを作成できるようにする
	//引数を入れた場合は引数が入った状態の物が呼び出される	
	public Member(int id, String name, String email) {
		this.id = id;
		this.name = name;
		this.email = email;
	}

	//Getter and setterを用意する
	//Source > Generate Getters and Setters...
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	};
	

	

	

	
}
