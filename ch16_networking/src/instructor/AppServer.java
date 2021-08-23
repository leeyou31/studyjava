package chatting_programming;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

import com.framework.TcpApplication;

public class AppServer extends TcpApplication {

	/*
	 * ���ø����̼� �ʱ�ȭ
	 */
	@Override
	public void init() {
		super.init();
	}
	
	/*
	 * ���ø����̼� ����
	 */
	@Override
	public void start() {
		
		System.out.println(TcpApplication.timeStamp());
		System.out.println("TCP/IP �������α׷��� �����մϴ�.");
		System.out.println("SERVER STATR >>>");
		
		try {
			// 1. �������� ����
			ServerSocket server = new ServerSocket(TcpApplication.PORT);
			
			// 2. Ŭ���̾�Ʈ�� ����� ���� ����
			while(true) {
				
				Socket cSocket = server.accept();
				
				System.out.println(TcpApplication.timeStamp());
				System.out.println("Ŭ���̾�Ʈ ���� �����...");
				
				/* ������ Ŭ���̾�Ʈ �ۼ����� ����� �����带 �����Ͽ� ����(cSocket)�� �����Ѵ�.
				 * ������ �� ��ŭ �����尡 �����ȴ�.
				 */
				Thread th = new Thread(new TcpServerHandler(cSocket));
			}
			
		} catch(IOException ex) {
			ex.printStackTrace();
		}
	}

}
