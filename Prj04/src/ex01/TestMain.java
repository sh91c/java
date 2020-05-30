package ex01;

interface Command{
	void execute();
}

class CommandProcess{
	public void process(Command command) {
		command.execute();
	}
}

public class TestMain {
	// 익명 클래스 - Anonymous class // 미리 알아보는 정도로 수업했음 - 람다식과 연관성 높
	public static void main(String[] args) {
		CommandProcess cp = new CommandProcess();
		cp.process( new Command() {  // 함수에 인자로 클래스, 인터페이가 들어갈 수 있다.
			// process()를 따로 호출하지 않고 여기 안에서 코딩을 작성하는 것.
			// 인터페이스를 이용하고 안에서 코딩을 해서 new를 사용할 수 있도록 하는 것.
			@Override
			public void execute() {
				System.out.println("내용보기 실행");
			}
			
		});
		
		
		
		
		
	}

}
