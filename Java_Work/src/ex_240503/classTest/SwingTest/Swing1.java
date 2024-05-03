package ex_240503.classTest.SwingTest;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

class MyPanel extends JPanel {

}


// 작업순서1, JFrame 그림도구 상속받기. 
public class Swing1 extends JFrame{
	public Swing1() {
		// 제목
		setTitle("300x300 스윙 프레임 만들기");
		// 창의 엑스 표시를 클릭시 종료하는 코드
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// 창 사이즈
		setSize(300, 300);
		// 창 보여줄지 여부. 
		setVisible(true); 
		// 프레임의 컨텐트팬을 알아낸다.
		Container contentPane = getContentPane(); 
		
		// 패널 더 추가 해보기. 
//		Container contentPane = getContentPane(); // 컨텐트팬 알아내기
		contentPane.setBackground(Color.ORANGE); // 오렌지색 배경 설정
		// html flex 랑 동일해요, 기본 가로로 순차 배치, 
		contentPane.setLayout(new FlowLayout()); // 컨텐트팬에 FlowLayout
		// 배치관리자 달기
		contentPane.add(new JButton("OK")); // OK 버튼 달기
		contentPane.add(new JButton("Cancel")); // Cancel 버튼 달기
		contentPane.add(new JButton("Ignore")); // Ignore 버튼 달기
		
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




