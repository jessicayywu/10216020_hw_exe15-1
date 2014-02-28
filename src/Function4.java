
public class Function4 extends AbstractCalculateFunction {

	@Override
	protected double f(double x) {
		return Math.tan(x);
	}
	
	@Override
	public String toString() {
		return String.format("Function4: f(x) = tan(x)\n%s\nf(x) = %.2f", super.toString(), f(getX()));
	}

}
