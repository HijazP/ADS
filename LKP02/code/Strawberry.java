public class Strawberry {
    public static Strawberry instance;
    private int weight;
    private String color;
    public Strawberry() {}

    public void setWeight(int weight)
    {
        this.weight = weight;
    }

    public void setColor(String color)
    {
        this.color = color;
    }

    public int getWeight()
    {
        return this.weight;
    }

    public String getColor()
    {
        return this.color;
    }
}