package lt.a;

public class TestCallBack {
public static void main(String[] args) {
	Server server=new Server();
	Client client=new Client();
	client.setServer(server);
	client.sendMessage("hello world!");
}
}
