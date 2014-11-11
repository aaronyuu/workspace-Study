import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;


public class Server {

	/**
	 * @param args
	 * @throws UnknownHostException 
	 */
	public static void main(String[] args) throws UnknownHostException {
		// TODO Auto-generated method stub
		//通过机器名获取InetAddress
		InetAddress inetaddress=InetAddress.getByName("AARON-HOME");
		
		System.out.println(inetaddress.getHostAddress());
		System.out.println(inetaddress.getHostName());
		byte[] addr=inetaddress.getAddress();
		System.out.println("ip是:"+Arrays.toString(addr));
		for (byte b : addr) {
			System.out.print( " " +(b&0xff) );
		}
		System.out.println();
		System.out.println(-1 & 0xff);
		
		//获取本机InetAddress
		InetAddress local=InetAddress.getLocalHost();
		
		System.out.println(local.getHostAddress());
		System.out.println(local.getHostName());
		byte[] bytes=local.getAddress();
		System.out.println("ip是:"+Arrays.toString(bytes));
		for (byte b : bytes) {
			System.out.print( " " +(b&0xff) );
		}
		System.out.println();
		System.out.println(-1 & 0xff);
		
		
		
	}

}
