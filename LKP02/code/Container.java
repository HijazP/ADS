public class Container {

    private Strawberry strawberry = new Strawberry();
    private Grader grader = new Grader();
    public Container() {}

    public void addStrawberry(int weight, String color)
    {
        strawberry.setWeight(weight);
        strawberry.setColor(color);
        grader.grading(strawberry.getWeight(), strawberry.getColor());
    }

    public void stopAddStrawberry()
    {
        grader.printResult();
    }
}