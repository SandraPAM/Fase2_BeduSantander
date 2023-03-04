public class Calculadora {

    private CalculadoraDao calculadoraDao;
    public int suma(int a, int b){
        return a + b + calculadoraDao.findValorConstante();
    }

    public int resta(int a, int b){
        return a - b + calculadoraDao.findValorConstante();
    }

    public int multiplicacion(int a, int b){
        return a * b + calculadoraDao.findValorConstante();
    }
}
