package b3iam.restap;

public class child extends parent {

	public String getsavings(double sal) {
		String ps=super.getsavings(sal)+"";
		return ps+"<br>"+sal*15/100;
	}
}
