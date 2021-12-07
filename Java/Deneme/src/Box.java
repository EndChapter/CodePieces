//Override tostring
public class Box {
	double width;
	double height;
	double depth;
	Box(int a, int b, int c){
		width = a;
		height = b;
		depth = c;
	}
	@Override
	public String toString() {
		return "Dimensions are " + width + " by " + depth + " by " + height + ".";
	}
}
