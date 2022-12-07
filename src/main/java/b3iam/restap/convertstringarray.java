package b3iam.restap;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("ala")

public class convertstringarray {
	public static Integer[] toIntegerArray(String a[]) {
		Integer ar[] = new Integer[a.length];
		for (int i = 0; i < a.length; i++)
			ar[i] = Integer.parseInt(a[i]);
		return ar;
	}

	public static Float[] toFloatArray(String a[]) {
		Float ar[] = new Float[a.length];
		for (int i = 0; i < a.length; i++)
			ar[i] = Float.parseFloat(a[i]);
		return ar;
	}

	@GET
	@Path("t_array/{type}/{values}")
	@Produces(MediaType.TEXT_HTML)
	public String getArrayValues(@PathParam("type") String type, @PathParam("values") String values) {
		String vals[] = values.split(",");
		String s = "";
		if (type.equals("Integer")) {
			generictype<Integer> inst = new generictype<Integer>();
			inst.createArray(convertstringarray.toIntegerArray(vals));
			for (Integer i : inst.readArray())
				s += i + " ";
		} else if (type.equals("Float")) {
			generictype<Float> inst = new generictype<Float>();
			inst.createArray(convertstringarray.toFloatArray(vals));
			for (Float i : inst.readArray())
				s += i + " ";
		} else if (type.equals("String")) {
			generictype<String> inst = new generictype<String>();
			inst.createArray(vals);
			for (String i : inst.readArray())
				s += i + " ";
		}
		return s;
	}
}
