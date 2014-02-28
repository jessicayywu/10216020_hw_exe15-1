
public class Function3 extends AbstractCalculateFunction {

	@Override
	protected double f(double x) {
		return Math.cos(x);
	}

	@Override
	public String toString() {
		return String.format("Function3: f(x) = cos(x)\n%s\nf(x) = %.2f", super.toString(), f(getX()));
	}
}
