package part10;

public class Anonymous {
	//필드 선언과 초기값 대입
	Person field = new Person() {
		void work() {
			System.out.println("출근합니다.");
		}

		@Override
		void wake() {
			System.out.println("6시에 일어납니다");
			work();
		}
	};	//하나의 실행문이므로 세미콜론을 붙여줌
	
	void method1() {
		//로컬변수 선언과 초기값 대입
		Person localVar = new Person() {
			void walk() {
				System.out.println("산책합니다.");
			}

			@Override
			void wake() {
				System.out.println("7시에 일어납니다");
				walk();
			}			
		};
		//로컬변수 사용
		localVar.wake();
	}
	
		void method2(Person person) {
			person.wake();
		}
		
}	//END Anonymous()
