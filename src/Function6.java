
public class Function6 extends AbstractCalculateFunction {

	@Override
	protected double f(double x) {
		return 5 * Math.cos(x) + Math.sin(x);
	}

	@Override
	public String toString() {
		return String.format("Function6: f(x) = 5cos(x) + sin(x)\n%s\nf(x) = %.2f", super.toString(), f(getX()));
	}

}
