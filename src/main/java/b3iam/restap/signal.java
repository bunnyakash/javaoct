package b3iam.restap;

public enum signal {
RED("stop",5),YELLOW("wait",2),GREEN("move",0);
	int time;
	 String action;
	signal(String action,int time){
		this.action=action;
		this.time=time;
	}
}