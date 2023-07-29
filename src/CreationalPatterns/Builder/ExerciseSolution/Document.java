package CreationalPatterns.Builder.ExerciseSolution;

import CreationalPatterns.Builder.ExerciseSolution.html.HtmlDocument;
import CreationalPatterns.Builder.ExerciseSolution.html.HtmlImage;
import CreationalPatterns.Builder.ExerciseSolution.html.HtmlParagraph;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Document {
    private final List<Element> elements = new ArrayList<>();

    public void add(Element element) {
        elements.add(element);
    }

    public void export(DocumentBuilder documentBuilder, String fileName) throws IOException {
            for (Element element: elements) {
                if (element instanceof Text) {
                    documentBuilder.AddText((Text)element);
                }
                else if (element instanceof Image) {
                    documentBuilder.AddImage((Image)element);
                }
            }
        var content = documentBuilder.GetContent();
        var writer = new FileWriter(fileName);
        writer.write(content);
        writer.close();
    }
}
