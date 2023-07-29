package StructuralPatterns.Decorator.Exercise;

public class Editor {
    public void openProject(String path) {
        System.out.println(path);
//        IArtefact artefact = new ErrorDecorator("error", true,new Artefact("Default Artefact"));
        IArtefact artefact = new MainDecorator ("Main ", false, new ErrorDecorator("error", true,new Artefact("Default Artefact")));
        System.out.println(artefact.render());
    }
}
