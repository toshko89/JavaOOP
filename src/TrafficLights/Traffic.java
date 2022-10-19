package TrafficLights;

public class Traffic {
    private Lights color;

    public Traffic(Lights color) {
        this.color = color;
    }

    public void changeColor(Lights lights){
        switch (lights){
            case RED:
                this.color = Lights.GREEN;
                break;
            case GREEN:
                this.color = Lights.YELLOW;
                break;
            case YELLOW:
                this.color = Lights.RED;
        }
    }

    public Lights getColor() {
        return color;
    }

}
