package CreationalPatterns.Prototype.ExerciseSolution;

public class ContextMenu {
    private Timeline timeline;

    public ContextMenu(Timeline timeline) {
        this.timeline = timeline;
    }

    public Component duplicate(Component component) {
      return component.Clone();
    }
}
