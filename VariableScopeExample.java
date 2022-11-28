package sec01.exam04;

public class VariableScopeExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int v1 = 15;
		if(v1>10) {
			int v2;					// <-- 을 위로 1줄이동시 에러 사라짐.
			v2 = v1 -10;
		}
		int v3 = v1 + v2 + 5;		// v2 변수를 사용할 수 없기 때문에 컴파일 에러 발생
	}

}
