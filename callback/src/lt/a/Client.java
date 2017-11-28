package lt.a;

public class Client implements CSCallBack{

	private Server server; 	
	
	public Server getServer() {
		return server;
	}

	public void setServer(Server server) {
		this.server = server;
	}
	
	public void sendMessage(final String msg)
	{
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				server.getClientMsg(Client.this,msg);
			}
		}).start();;
	}

	@Override
	public void process(String status) {
		// TODO Auto-generated method stub
		System.out.println("客户端方法D");
	}

}
