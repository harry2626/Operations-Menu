/**
 * This class is use to contain the solutions of the quadratic equation.
 */
public class FloatPair {
	
	private float first;
	private float second;
	
	/**
	 * This constructor is used to initialize the first solution 
	 * of the quadratic equation when it has only one.
	 * @param first First solution of the quadratic equation.
	 */
	public FloatPair(float first){
		this.first = first;
	}
	
	/**
	 * This constructor is used to initialize the first and second solutions
	 * of the quadratic equation when it has two solutions.
	 * @param first First solution of the quadratic equation.
	 * @param second Second solution of the quadratic equation.
	 */
	public FloatPair(float first, float second){
		this.first = first;
		this.second = second;
	}

	/**
	 * This method gets the first solution.
	 * @return Returns the first solution.
	 */
	public float getFirst() {
		return first;
	}

	/**
	 * This method gets the second solution.
	 * @return Returns the second solution.
	 */
	public float getSecond() {
		return second;
	}
}
