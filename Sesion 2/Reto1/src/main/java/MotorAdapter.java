public class MotorAdapter extends Motor{

    private MotorElectrico motorElectrico;

    public MotorAdapter(){
        super();
        this.motorElectrico = new MotorElectrico();
        System.out.println("Creando Motor Electrico Adapter");
    }

    @Override
    public void encender() {
        System.out.println("Encendiendo motorAdapter");
        motorElectrico.conectar();
        motorElectrico.activar();
    }

    @Override
    public void acelerar() {
        System.out.println("Acelerando motorAdapter...");
        motorElectrico.moverMasRapido();
    }

    @Override
    public void apagar() {
        System.out.println("Apagando motorAdapter");
        motorElectrico.detener();
        motorElectrico.desconectar();
    }



}