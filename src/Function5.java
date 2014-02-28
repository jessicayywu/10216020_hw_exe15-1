
public class Function5 extends AbstractCalculateFunction {

	@Override
	protected double f(double x) {
		return Math.cos(x) + 5 * Math.sin(x);
	}


	@Override
	public String toString() {
		return String.format("Function5: f(x) = cos(x) + 5sin(x)\n%s\nf(x) = %.2f", super.toString(), f(getX()));
	}
}
