package CreationalPatterns.Prototype.ExerciseSolution;

public class Text implements Component {
    private String content;

    public Text(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    @Override
    public Component Clone() {
        return new Text(this.getContent());
    }
}
