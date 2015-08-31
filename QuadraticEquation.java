/**
 * This class has the methods to compute the solutions of a quadratic equation.
 */
public class QuadraticEquation {
	
	private float a;
	private float b;
	private float c;
	
	/**
	 * This constructor initializes all the coefficients of the quadratic equation.
	 * @param a The coefficient of the squared term.
	 * @param b The coefficient of the linear term.
	 * @param c The coefficient of the constant term.
	 */
	public QuadraticEquation(float a, float b, float c){
		this.a = a;
		this.b = b;
		this.c = c;
	}

	/**
	 * This method gets the squared coefficient.
	 * @return Returns the squared coefficient.
	 */
	public float getA() {
		return a;
	}

	/**
	 * This method gets the linear coefficient.
	 * @return Returns the linear coefficient.
	 */
	public float getB() {
		return b;
	}

	/**
	 * This method gets the constant coefficient.
	 * @return Returns the constant coefficient.
	 */
	public float getC() {
		return c;
	}

	/**
	 * This method computes how many solutions the quadratic equation has.
	 * @return Returns the number of solutions.
	 */
	public int realSolutionsCount(){
		int solutionsCount;
		
		if((getB()*getB() - 4*getA()*getC()) < 0){
			solutionsCount = 0;
		}
		else if((getB()*getB() - 4*getA()*getC()) == 0){
			solutionsCount = 1;
		}
		else{
			solutionsCount = 2;
		}
		return solutionsCount;
	}
	
	/**
	 * This method computes the solutions for the quadratic equation.
	 * @return Returns a reference to a FloatPair which contains the solutions.
	 */
	public FloatPair getRealSolutions() { 
		FloatPair floatObj;
		float firstSol;
		float secondSol;
		
        if(this.realSolutionsCount() == 0){
        	floatObj = null;
        }
        else if(this.realSolutionsCount() == 1){
        	firstSol = -getB()/(2*getA());
        	floatObj = new FloatPair(firstSol);
        }
        else{
        	firstSol = (float) ((-getB() + Math.sqrt(getB()*getB() - 4*getA()*getC()))/(2*getA()));
        	secondSol = (float) ((-getB() - Math.sqrt(getB()*getB() - 4*getA()*getC()))/(2*getA()));
        	floatObj = new FloatPair(firstSol, secondSol);
        }
		return floatObj;
    } 
	
	
}
