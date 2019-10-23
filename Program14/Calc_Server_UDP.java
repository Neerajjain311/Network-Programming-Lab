// Java Program to illustrate Server Side implementation 
// of Simple Calculator using UDP 
import java.io.*; 
import java.net.*; 
import java.util.StringTokenizer; 

public class Calc_Server_UDP 
{ 
	public static void main(String[] args) throws IOException 
	{ 
		// Create a socket to listen at port 8888 
		DatagramSocket ds = new DatagramSocket(8888); 
		byte[] buf = null; 
		DatagramPacket DpReceive = null; 
		DatagramPacket DpSend = null; 
		while (true) 
		{ 
			buf = new byte[10]; 
			// create a DatgramPacket to receive the data. 
			DpReceive = new DatagramPacket(buf, buf.length); 

			// receive the data in byte buffer. 
			ds.receive(DpReceive); 

			String inp = new String(buf, 0, buf.length); 

			//To remove extra spaces. 
			inp=inp.trim(); 
			System.out.println("Equation Received : " + inp); 

			// Exit the server if the client sends "bye" 
			if (inp.equals("bye")) 
			{ 
				System.out.println("Client sent bye.....EXITING"); 
				break; 
			} 

			int result; 

			// Use StringTokenizer to break the 
			// equation into operand and operation 
			StringTokenizer st = new StringTokenizer(inp); 

			int oprnd1 = Integer.parseInt(st.nextToken()); 
			String operation = st.nextToken(); 
			int oprnd2 = Integer.parseInt(st.nextToken()); 

			// perform the required operation. 
			if (operation.equals("+")) 
				result = oprnd1 + oprnd2; 

			else if (operation.equals("-")) 
				result = oprnd1 - oprnd2; 

			else if (operation.equals("*")) 
				result = oprnd1 * oprnd2; 

			else
				result = oprnd1 / oprnd2; 

			System.out.println("Sending the result..."); 
			String res = Integer.toString(result); 

			// Clear the buffer after every message. 
			buf = res.getBytes(); 

			// get the port of client. 
			int port = DpReceive.getPort(); 

			DpSend = new DatagramPacket(buf, buf.length, 
						InetAddress.getLocalHost(), port); 
			ds.send(DpSend); 
		} 
	} 
} 
