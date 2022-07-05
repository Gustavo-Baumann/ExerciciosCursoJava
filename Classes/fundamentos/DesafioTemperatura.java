package fundamentos;

public class DesafioTemperatura {
	public static void main(String[] args) {
		// (F -32)*5/9
		final double fnrgt = -32;
		final double cels = 0.5555555555555556;
	    double fnrgt2 = 209;
	    double cels2 = (fnrgt2 + fnrgt) * cels;
	    System.out.println(cels2);
	    fnrgt2 = 69;
	    cels2 = (fnrgt2 + fnrgt) * cels;
	    System.out.println(cels2);
	}
}
