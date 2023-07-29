package StructuralPatterns.Composite.Example;

import java.util.ArrayList;
import java.util.List;

public class Group extends Component {
	private List<Component> components = new ArrayList<>();

	public void AddItem(Component newItem){
		components.add(newItem);
	}

	public void Render(){
		for (var component: components) {
			component.Render();
		}
	}

	@Override
	public void Move() {
		for (var component : components)
			component.Move();
	}
}
