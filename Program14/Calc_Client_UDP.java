// Java Program to illustrate Client Side implementation 
// of Simple Calculator using UDP 
import java.io.*; 
import java.net.*; 
import java.util.Scanner; 

public class Calc_Client_UDP 
{ 
	public static void main(String args[]) throws IOException 
	{ 
		Scanner sc = new Scanner(System.in); 

		DatagramSocket ds = new DatagramSocket(); 

		InetAddress ip = InetAddress.getLocalHost(); 
		byte buf[] = null; 

		while (true) 
		{ 
			System.out.print("Enter the equation in the format("); 
			System.out.println("Operand1 Operator Operand2)"); 
			String inp = sc.nextLine(); 
 
			buf = inp.getBytes(); 
			DatagramPacket DpSend = 
					new DatagramPacket(buf, buf.length, ip, 8888); 

			ds.send(DpSend); 
			if (inp.equals("Bye")) 
				break; 

			buf = new byte[10]; 
			DatagramPacket DpReceive = new DatagramPacket(buf, buf.length); 
			ds.receive(DpReceive); 

			System.out.println("Answer = " + 
								new String(buf,0,buf.length)); 
		} 
	} 
} 
