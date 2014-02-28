
public class Function2 extends AbstractCalculateFunction {

	@Override
	protected double f(double x) {
		return Math.sin(x);
	}

	@Override
	public String toString() {
		return String.format("Function2: f(x) = sin(x)\n%s\nf(x) = %.2f", super.toString(), f(getX()));
	}
}
