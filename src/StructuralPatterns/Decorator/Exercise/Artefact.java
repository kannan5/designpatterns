package StructuralPatterns.Decorator.Exercise;

public class Artefact implements IArtefact {
    private String name;

    public Artefact(String name) {
        this.name = name;
    }

    public String render() {
        return String.format("%s", name);
    }
}
