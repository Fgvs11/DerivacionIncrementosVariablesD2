public class DerivacionIV{
	//Funcion 
    public double f(double x, double xa,double xb,double xc,double ya,double yb,double yc){
        double part1 = (2*x-xb-xc)/((xa-xb)*(xa-xc)) * ya;
        double part2 = (2*x-xa-xc)/((xb-xa)*(xb-xc)) * yb;
        double part3 = (2*x-xb-xa)/((xc-xb)*(xc-xa)) * yc;
        return part1 + part2 + part3;
    }
}
