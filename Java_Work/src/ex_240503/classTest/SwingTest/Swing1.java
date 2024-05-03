package ex_240503.classTest.SwingTest;

import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;

// 작업순서1, JFrame 그림도구 상속받기. 
public class Swing1 extends JFrame{
	public Swing1() {
		setTitle("300x300 스윙 프레임 만들기");
		setSize(300, 300); 
		setVisible(true); 
		// 프레임의 컨텐트팬을 알아낸다.
		Container contentPane = getContentPane(); 
		// 버튼 컴포넌트 생성
		JButton button = new JButton("Click");
		// 컨텐트팬 여기에 버튼을 붙이는 코드 
		contentPane.add(button); // 컨텐트팬에 버튼 부착

		}

	public static void main(String[] args) {
		// 인스턴스를 생성하는 과정 중에, 기본 생성자를 호출해서, 실행함. 
		Swing1 swing1 = new Swing1() ;

	}

}




