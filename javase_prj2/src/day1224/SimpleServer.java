package day1224;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * port(1~65535 �� �ϳ�)�� ���� ������ ������ �޴� ��.
 * @author owner
 */
public class SimpleServer {

	public SimpleServer() throws IOException {

		//1.port�� ���� �����ڰ� �����⸦ ��ٸ���.
		ServerSocket server = null;
		//�����ڿ��� ������ �޼���
		String msg = "���� �� ������ο������� ���� �� �ƴ϶���.";
		//�����ڿ��� �޼����� ������ ���� ��Ʈ��
		DataOutputStream dos = null;
		try {
			server = new ServerSocket(3000);
			System.out.println("���� ���� �� " + server);
			//3.�����ڰ� ������ ������ ������ �޴´�. 
			while (true) {
				
			Socket client = server.accept();
			System.out.println("������ ���� "+client);
			//�����ڿ��� �޼����� ������ ���� ��Ʈ�� ����
			dos = new DataOutputStream(client.getOutputStream());
			//�� ��Ʈ���� ������ ����
			dos.writeUTF(msg);
			//��Ʈ�� �����͸� �������� ����
			dos.flush();
			
			}			
			
		} finally {
			if (dos != null) {
				dos.close();
			}
			if (server != null) {
				server.close();
			}
		}
		
	}//SimpleServer
	
	public static void main(String[] args) {
		try {
			new SimpleServer();
		} catch (IOException e) {
			System.out.println("��Ʈ�� �̹� ������Դϴ�.");
			e.printStackTrace();
		}
	}

}
