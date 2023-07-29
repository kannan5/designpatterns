package StructuralPatterns.Composite.Exercise;

import java.util.ArrayList;
import java.util.List;

public class Team extends SubTeam{
  private List<SubTeam> resources = new ArrayList<>();

  public void add(SubTeam resource) {
    resources.add(resource);
  }

  public void deploy() {
    for (var resource : resources) {
        resource.deploy();
    }
  }
}
